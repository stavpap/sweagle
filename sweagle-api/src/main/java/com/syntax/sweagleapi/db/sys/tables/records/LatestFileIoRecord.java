/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.LatestFileIo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


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
public class LatestFileIoRecord extends TableRecordImpl<LatestFileIoRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -2067041488;

    /**
     * Setter for <code>sys.latest_file_io.thread</code>.
     */
    public void setThread(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.latest_file_io.thread</code>.
     */
    public String getThread() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.latest_file_io.file</code>.
     */
    public void setFile(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.latest_file_io.file</code>.
     */
    public String getFile() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.latest_file_io.latency</code>.
     */
    public void setLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.latest_file_io.latency</code>.
     */
    public String getLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.latest_file_io.operation</code>.
     */
    public void setOperation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.latest_file_io.operation</code>.
     */
    public String getOperation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.latest_file_io.requested</code>.
     */
    public void setRequested(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.latest_file_io.requested</code>.
     */
    public String getRequested() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return LatestFileIo.LATEST_FILE_IO.THREAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return LatestFileIo.LATEST_FILE_IO.FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return LatestFileIo.LATEST_FILE_IO.LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return LatestFileIo.LATEST_FILE_IO.OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return LatestFileIo.LATEST_FILE_IO.REQUESTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getThread();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRequested();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getThread();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRequested();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord value1(String value) {
        setThread(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord value2(String value) {
        setFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord value3(String value) {
        setLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord value4(String value) {
        setOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord value5(String value) {
        setRequested(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LatestFileIoRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached LatestFileIoRecord
     */
    public LatestFileIoRecord() {
        super(LatestFileIo.LATEST_FILE_IO);
    }

    /**
     * Create a detached, initialised LatestFileIoRecord
     */
    public LatestFileIoRecord(String thread, String file, String latency, String operation, String requested) {
        super(LatestFileIo.LATEST_FILE_IO);

        set(0, thread);
        set(1, file);
        set(2, latency);
        set(3, operation);
        set(4, requested);
    }
}
