package com.syntax.sweagleapi.repository;

import org.jooq.impl.DefaultDSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.syntax.sweagleapi.db.sweagle.tables.Dataset;
import com.syntax.sweagleapi.db.sweagle.tables.Payload;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;

@Repository
public class PayloadRepository implements SweagleRepository<PayloadRecord> {

	private static final Dataset DATASET = Dataset.DATASET;
	private static final Payload PAYLOAD = Payload.PAYLOAD;
	private DefaultDSLContext jooq;

	@Autowired
	public PayloadRepository(DefaultDSLContext jooq) {
		this.jooq = jooq;
	}

	@Override
	public PayloadRecord get(long id) {
		return jooq.select().from(PAYLOAD).where(PAYLOAD.DATASET_ID.eq(id)).fetchOne().into(PayloadRecord.class);
	}
	
	@Override
	public PayloadRecord insert(PayloadRecord body) {
		return jooq.insertInto(PAYLOAD, PAYLOAD.DATA,PAYLOAD.DATASET_ID)
				   .values(body.getData(),body.getDatasetId())
				   .returning()
				   .fetchOne();
	}

	@Override
	public int update(PayloadRecord body,long datasetId) {
		//Get payload id by joining on dataset table
		  Long payloadId = jooq.select(PAYLOAD.ID)
							   .from(DATASET)
							   .join(PAYLOAD)
							   .on(DATASET.ID.eq(PAYLOAD.DATASET_ID))
							   .where(DATASET.ID.eq(datasetId))
							   .fetchOne().into(Long.class);
		return jooq.update(PAYLOAD)
				   .set(PAYLOAD.DATA, body.getData())
				   .where(PAYLOAD.ID.eq(payloadId))
				   .execute();
	}

	@Override
	public int delete(long id) {
	  return jooq.delete(PAYLOAD)
			  	 .where(PAYLOAD.DATASET_ID.eq(id))
			  	 .execute();
	}
}
