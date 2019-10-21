package com.syntax.sweagleapi.repository;

import java.util.List;
import java.util.Map;

import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.syntax.sweagleapi.db.sweagle.tables.Dataset;
import com.syntax.sweagleapi.db.sweagle.tables.Payload;
import com.syntax.sweagleapi.db.sweagle.tables.records.DatasetRecord;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;

@Repository
public class DatasetRepository implements SweagleRepository<DatasetRecord> {

	private static final Payload PAYLOAD = Payload.PAYLOAD;
	private static final Dataset DATASET = Dataset.DATASET;
	private DefaultDSLContext jooq;

	@Autowired
	public DatasetRepository(DefaultDSLContext jooq) {
		this.jooq = jooq;
	}
	
	@Override
	public DatasetRecord get(long id) {
		return jooq.select().from(DATASET).where(DATASET.ID.eq(id)).fetchOne().into(DatasetRecord.class);
	}

	@Override
	public DatasetRecord insert(DatasetRecord dataset) {
		return jooq.insertInto(DATASET, DATASET.NAME, DATASET.DESCRIPTION)
				   .values(dataset.getName(), dataset.getDescription())
				   .returning(DATASET.ID)
				   .fetchOne();
	}
	
	@Override
	@Transactional
	public int update(DatasetRecord body,long datasetId) {
		int rowsUpdated = 0;
		//Update only the not null properties. Null check is necessary otherwise an existing value would be replaced with null
		if(body.getName() != null) {
			rowsUpdated = jooq.update(DATASET)
			   .set(DATASET.NAME, body.getName())
			   .where(DATASET.ID.eq(datasetId))
			   .execute();
		}
		if(body.getDescription() != null) {
			rowsUpdated = jooq.update(DATASET)
			   .set(DATASET.DESCRIPTION, body.getDescription())
			   .where(DATASET.ID.eq(body.getId()))
			   .execute();
		}
		return rowsUpdated;
	}

	@Override
	public int delete(long id) {
	  return jooq.delete(DATASET)
			  	 .where(DATASET.ID.eq(id))
			  	 .execute();
	}
	
	/**
	 * Get all datasets. No payload details returned here.
	 * @return list with datasets retrieved
	 */
	public List<DatasetRecord> getAll() {
		return jooq.select().from(DATASET).fetch().into(DatasetRecord.class);
	}

	/**
	 * Get all datasets along with their payload. A join query was necessary here.
	 * @return a map of the datasets with their respective payloads. 
	 *         In our case each dataset has one payload so every list contains one element.
	 */
	public Map<DatasetRecord, List<PayloadRecord>> getAllWithPayloads() {
		 return jooq.select()
				 	.from(DATASET)
				 	.join(PAYLOAD)
				 	.on(DATASET.ID.eq(PAYLOAD.DATASET_ID))
				 	.fetch().intoGroups(DatasetRecord.class,PayloadRecord.class);
	}

	/**
	 * Get a specific dataset along with its payload. A join query was necessary here.
	 * @param the id for specifying the dataset
	 * @return a map of the dataset with a list with its payloads. 
	 *         In our case the dataset has one payload so the list contains one element.
	 */
	public Map<DatasetRecord, List<PayloadRecord>> getWithPayload(long id) {
		return jooq.select()
				   .from(DATASET)
				   .join(PAYLOAD)
				   .on(DATASET.ID.eq(PAYLOAD.DATASET_ID))
				   .where(DATASET.ID.eq(id))
				   .fetch().intoGroups(DatasetRecord.class, PayloadRecord.class);
	}
	
	/**
	 * Method for getting a specific dataset by name without payload.
	 * @param name
	 * @return a list with the records retrieved from the database
	 */
	public List<DatasetRecord> get(String name) {
		return jooq.select().from(DATASET).where(DATASET.NAME.eq(name)).fetch().into(DatasetRecord.class);
	}

	/**
	 * Method for getting a specific dataset by name with payload.
	 * @param name
	 * @return a list with the records retrieved from the database
	 */
	public Map<DatasetRecord, List<PayloadRecord>> getWithPayload(String name) {
		return jooq.select()
				   .from(DATASET)
				   .join(PAYLOAD)
				   .on(DATASET.ID.eq(PAYLOAD.DATASET_ID))
				   .where(DATASET.NAME.eq(name))
				   .fetch().intoGroups(DatasetRecord.class, PayloadRecord.class);

	}
}
