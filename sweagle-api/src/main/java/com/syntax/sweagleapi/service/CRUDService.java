package com.syntax.sweagleapi.service;

import java.util.List;
import java.util.Map;

import org.jooq.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syntax.sweagleapi.db.sweagle.tables.records.DatasetRecord;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;
import com.syntax.sweagleapi.dto.DatasetDTO;
import com.syntax.sweagleapi.dto.PayloadDTO;
import com.syntax.sweagleapi.exceptions.NoResourceFoundException;
import com.syntax.sweagleapi.exceptions.NotValidDataException;
import com.syntax.sweagleapi.repository.DatasetRepository;
import com.syntax.sweagleapi.repository.PayloadRepository;
import com.syntax.sweagleapi.utils.Converter;

/**
 * The class for implementing the service layer of our application. This class
 * could be refactored and break into smaller classes.
 */
@Service
public class CRUDService {
	private final DatasetRepository datasetRepository;
	private final PayloadRepository payloadRepository;

	@Autowired
	public CRUDService(DatasetRepository datasetRepository, PayloadRepository payloadRepository) {
		this.datasetRepository = datasetRepository;
		this.payloadRepository = payloadRepository;
	}

	public List<DatasetDTO> getAll(boolean returnPayloads) {
		List<DatasetDTO> datasetsList;
		if (returnPayloads) {
			datasetsList = getAllWithPayload();
		} else {
			datasetsList = getAll();
		}
		return datasetsList;
	}

	public DatasetDTO get(long id, boolean returnPayload) {
		DatasetDTO dataset;
		if (returnPayload) {
			dataset = getWithPayload(id);
		} else {
			dataset = get(id);
		}
		return dataset;
	}

	public DatasetDTO get(String name, boolean returnPayload) {
		DatasetDTO dataset;
		if (returnPayload) {
			dataset = getWithPayload(name);
		} else {
			dataset = get(name);
		}
		return dataset;
	}

	public PayloadDTO getPayload(long datasetId) {
		PayloadRecord payloadRecord = payloadRepository.get(datasetId);
		//Use jooq for generating payload dto
		return payloadRecord.into(PayloadDTO.class);
	}

	public PayloadDTO getPayload(String name) throws NoResourceFoundException {
		DatasetRecord dataset;
		try {
			// Here we make the assumption that only one dataset will be returned for the specified name.
			//Further improvement is to return a list of payloads with the specified name.
			dataset = datasetRepository.get(name).get(0);
			Long datasetId = dataset.getId();
			return getPayload(datasetId);
		} catch (IndexOutOfBoundsException e) {
			//This exception is thrown when an empty list is returned
			throw new NoResourceFoundException(String.format("No dataset with name %s found", name));
		}
	}

	public long createDatasetWithPayload(DatasetDTO dataset) throws NoResourceFoundException, NotValidDataException {
		//The id of the dataset is an auto increment BIGINT value in the database.
		//For mysql auto increment BIGINT values start from 1. So if the given id is higher than 1 then 
		// an existing resource should be updated. Only for id=0 (default value for long) then a new record is created
		if (dataset.getId() > 0) {
			return updateExistingDataset(dataset);
		} else {
			return insertNewDataset(dataset);
		}
	}

	public int updatePayload(long datasetId, PayloadDTO payload)
			throws NotValidDataException, NoResourceFoundException {
		PayloadRecord payloadRecord = new PayloadRecord();
		try {
			String data = payload.getData();
			payloadRecord.setData(data.getBytes());
		} catch (NullPointerException e) {
			// Data in payload was null
			throw new NotValidDataException("No data for updating payload found");
		}
		int updateRows = payloadRepository.update(payloadRecord, datasetId);
		if (updateRows < 1) {
			throw new NoResourceFoundException(
					String.format("No payload found for updating with dataset id %s", datasetId));
		}
		return updateRows;
	}

	public void delete(long id) {
		int deletedPayloads = payloadRepository.delete(id);
		if (deletedPayloads < 1) {
			throw new NoDataFoundException("No payload found for delete");
		}
		int deletedDatasets = datasetRepository.delete(id);
		if (deletedDatasets < 1) {
			throw new NoDataFoundException("No dataset found for delete");
		}
	}

	public void delete(String name) throws NoResourceFoundException {
		DatasetRecord dataset;
		try {
			dataset = datasetRepository.get(name).get(0);
			Long datasetId = dataset.getId();
			payloadRepository.delete(datasetId);
			datasetRepository.delete(datasetId);
		} catch (IndexOutOfBoundsException e) {
			//No dataset found with specified name
			throw new NoResourceFoundException(String.format("No dataset with name %s found for delete", name));
		}
	}

	private long insertNewDataset(DatasetDTO dataset) throws NotValidDataException {
		DatasetRecord newDataset = insertDataset(dataset);
		insertPayload(dataset, newDataset);
		return newDataset.getId();
	}

	private long updateExistingDataset(DatasetDTO dataset) throws NoResourceFoundException {
		int updateRows = datasetRepository.update(Converter.toDatasetRecord(dataset), dataset.getId());
		if(updateRows > 0) {
		return dataset.getId();}
		else {
			throw new NoResourceFoundException(String.format("No dataset with id %s found for update.",dataset.getId()));
		}
	}

	private DatasetDTO get(long id) {
		DatasetRecord datasetRecord = datasetRepository.get(id);
		//Use jooq mapping
		return datasetRecord.into(DatasetDTO.class);
	}

	private DatasetDTO getWithPayload(long id) {
		Map<DatasetRecord, List<PayloadRecord>> datasetsWithPayloads = datasetRepository.getWithPayload(id);
		return Converter.buildDatasetDTOsList(datasetsWithPayloads).get(0);
	}

	private DatasetDTO get(String name) {
		List<DatasetRecord> datasetList = datasetRepository.get(name);
		return Converter.buildDatasetDTOsList(datasetList).get(0);
	}

	private DatasetDTO getWithPayload(String name) {
		Map<DatasetRecord, List<PayloadRecord>> datasetsWithPayloads = datasetRepository.getWithPayload(name);
		return Converter.buildDatasetDTOsList(datasetsWithPayloads).get(0);
	}

	private List<DatasetDTO> getAllWithPayload() {
		Map<DatasetRecord, List<PayloadRecord>> datasetsWithPayloads = datasetRepository.getAllWithPayloads();
		return Converter.buildDatasetDTOsList(datasetsWithPayloads);
	}

	private List<DatasetDTO> getAll() {
		List<DatasetRecord> datasets = datasetRepository.getAll();
		return Converter.buildDatasetDTOsList(datasets);
	}

	private DatasetRecord insertDataset(DatasetDTO dataset) throws NotValidDataException {
		if (dataset.getName() == null) {
			throw new NotValidDataException("No name provided for creating dataset");
		}
		DatasetRecord datasetRecord = Converter.toDatasetRecord(dataset);
		return datasetRepository.insert(datasetRecord);
	}

	private PayloadRecord insertPayload(DatasetDTO datasetDTO, DatasetRecord datasetRecord) throws NotValidDataException {
		if (datasetDTO.getPayload() == null || datasetDTO.getPayload().getData() == null) {
			throw new NotValidDataException("No payload provided for creating dataset");
		} 
		PayloadRecord payloadRecord = Converter.toPayloadRecord(datasetDTO.getPayload(), datasetRecord);
		payloadRepository.insert(payloadRecord);
		return payloadRecord;
	}

}
