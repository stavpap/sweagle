/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.HostSummaryByFileIoType;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostSummaryByFileIoTypeRecord extends TableRecordImpl<HostSummaryByFileIoTypeRecord> implements Record5<String, String, ULong, String, String> {

    private static final long serialVersionUID = 641185779;

    /**
     * Setter for <code>sys.host_summary_by_file_io_type.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.host_summary_by_file_io_type.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.host_summary_by_file_io_type.event_name</code>.
     */
    public void setEventName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.host_summary_by_file_io_type.event_name</code>.
     */
    public String getEventName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.host_summary_by_file_io_type.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.host_summary_by_file_io_type.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.host_summary_by_file_io_type.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.host_summary_by_file_io_type.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.host_summary_by_file_io_type.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.host_summary_by_file_io_type.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, ULong, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE.EVENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component3() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEventName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value3() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord value2(String value) {
        setEventName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord value4(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord value5(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByFileIoTypeRecord values(String value1, String value2, ULong value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostSummaryByFileIoTypeRecord
     */
    public HostSummaryByFileIoTypeRecord() {
        super(HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE);
    }

    /**
     * Create a detached, initialised HostSummaryByFileIoTypeRecord
     */
    public HostSummaryByFileIoTypeRecord(String host, String eventName, ULong total, String totalLatency, String maxLatency) {
        super(HostSummaryByFileIoType.HOST_SUMMARY_BY_FILE_IO_TYPE);

        set(0, host);
        set(1, eventName);
        set(2, total);
        set(3, totalLatency);
        set(4, maxLatency);
    }
}
