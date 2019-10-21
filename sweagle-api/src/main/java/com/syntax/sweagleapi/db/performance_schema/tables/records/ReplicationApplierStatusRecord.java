/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.enums.ReplicationApplierStatusServiceState;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatus;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatusRecord extends UpdatableRecordImpl<ReplicationApplierStatusRecord> implements Record4<String, ReplicationApplierStatusServiceState, UInteger, ULong> {

    private static final long serialVersionUID = -1894783200;

    /**
     * Setter for <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    public void setServiceState(ReplicationApplierStatusServiceState value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    public ReplicationApplierStatusServiceState getServiceState() {
        return (ReplicationApplierStatusServiceState) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    public void setRemainingDelay(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    public UInteger getRemainingDelay() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    public void setCountTransactionsRetries(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    public ULong getCountTransactionsRetries() {
        return (ULong) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, ReplicationApplierStatusServiceState, UInteger, ULong> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, ReplicationApplierStatusServiceState, UInteger, ULong> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationApplierStatus.REPLICATION_APPLIER_STATUS.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ReplicationApplierStatusServiceState> field2() {
        return ReplicationApplierStatus.REPLICATION_APPLIER_STATUS.SERVICE_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return ReplicationApplierStatus.REPLICATION_APPLIER_STATUS.REMAINING_DELAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return ReplicationApplierStatus.REPLICATION_APPLIER_STATUS.COUNT_TRANSACTIONS_RETRIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusServiceState component2() {
        return getServiceState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getRemainingDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getCountTransactionsRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusServiceState value2() {
        return getServiceState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getRemainingDelay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getCountTransactionsRetries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusRecord value2(ReplicationApplierStatusServiceState value) {
        setServiceState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusRecord value3(UInteger value) {
        setRemainingDelay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusRecord value4(ULong value) {
        setCountTransactionsRetries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationApplierStatusRecord values(String value1, ReplicationApplierStatusServiceState value2, UInteger value3, ULong value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationApplierStatusRecord
     */
    public ReplicationApplierStatusRecord() {
        super(ReplicationApplierStatus.REPLICATION_APPLIER_STATUS);
    }

    /**
     * Create a detached, initialised ReplicationApplierStatusRecord
     */
    public ReplicationApplierStatusRecord(String channelName, ReplicationApplierStatusServiceState serviceState, UInteger remainingDelay, ULong countTransactionsRetries) {
        super(ReplicationApplierStatus.REPLICATION_APPLIER_STATUS);

        set(0, channelName);
        set(1, serviceState);
        set(2, remainingDelay);
        set(3, countTransactionsRetries);
    }
}
