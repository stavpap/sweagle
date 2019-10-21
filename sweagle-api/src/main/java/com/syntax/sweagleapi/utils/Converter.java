package com.syntax.sweagleapi.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.syntax.sweagleapi.db.sweagle.tables.records.DatasetRecord;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;
import com.syntax.sweagleapi.dto.DatasetDTO;
import com.syntax.sweagleapi.dto.PayloadDTO;

/**
 * Util class for converting data transfer objects to data access objects and vice versa.
 */
public class Converter {

	public static DatasetRecord toDatasetRecord(DatasetDTO dataset) {
		DatasetRecord datasetRecord = new DatasetRecord();
		datasetRecord.setId(dataset.getId());
		datasetRecord.setName(dataset.getName());
		datasetRecord.setDescription(dataset.getDescription());
		return datasetRecord;
	}

	public static PayloadRecord toPayloadRecord(PayloadDTO payload,DatasetRecord dataset) {
		PayloadRecord payloadRecord = new PayloadRecord();
		payloadRecord.setData(payload.getData().getBytes());
		payloadRecord.setDatasetId(dataset.getId());
		return payloadRecord;
	}

	public static List<DatasetDTO> buildDatasetDTOsList(Map<DatasetRecord, List<PayloadRecord>> datasetsWithPayloads) {
		List<DatasetDTO> datasetsList = new ArrayList<>();
		for (Map.Entry<DatasetRecord, List<PayloadRecord>> entry : datasetsWithPayloads.entrySet()) {
			DatasetRecord datasetRecord = entry.getKey();
			PayloadRecord payloadRecord = entry.getValue().get(0);
			DatasetDTO datasetDTO = new DatasetDTO(datasetRecord.getId(), datasetRecord.getName(),datasetRecord.getDescription(),
					payloadRecord.into(PayloadDTO.class));
			datasetsList.add(datasetDTO);
		}
		return datasetsList;
	}

	public static List<DatasetDTO> buildDatasetDTOsList(List<DatasetRecord> datasets) {
		return datasets.stream().map(p -> new DatasetDTO(p.getId(),
				p.getName(), p.getDescription()))
				.collect(Collectors.toList());
	}
}
