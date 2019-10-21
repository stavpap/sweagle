/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByThreadByError;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
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
public class EventsErrorsSummaryByThreadByErrorRecord extends TableRecordImpl<EventsErrorsSummaryByThreadByErrorRecord> implements Record8<ULong, Integer, String, String, ULong, ULong, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1024472155;

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.THREAD_ID</code>.
     */
    public void setThreadId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NUMBER</code>.
     */
    public void setErrorNumber(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NUMBER</code>.
     */
    public Integer getErrorNumber() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NAME</code>.
     */
    public void setErrorName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.ERROR_NAME</code>.
     */
    public String getErrorName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.SQL_STATE</code>.
     */
    public void setSqlState(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.SQL_STATE</code>.
     */
    public String getSqlState() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_RAISED</code>.
     */
    public void setSumErrorRaised(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_RAISED</code>.
     */
    public ULong getSumErrorRaised() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_HANDLED</code>.
     */
    public void setSumErrorHandled(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.SUM_ERROR_HANDLED</code>.
     */
    public ULong getSumErrorHandled() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.FIRST_SEEN</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.FIRST_SEEN</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>performance_schema.events_errors_summary_by_thread_by_error.LAST_SEEN</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.events_errors_summary_by_thread_by_error.LAST_SEEN</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Integer, String, String, ULong, ULong, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, Integer, String, String, ULong, ULong, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.ERROR_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.ERROR_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.SQL_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.SUM_ERROR_RAISED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.SUM_ERROR_HANDLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.FIRST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR.LAST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getErrorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSqlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getSumErrorRaised();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getSumErrorHandled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getErrorNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getErrorName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSqlState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getSumErrorRaised();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getSumErrorHandled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value1(ULong value) {
        setThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value2(Integer value) {
        setErrorNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value3(String value) {
        setErrorName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value4(String value) {
        setSqlState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value5(ULong value) {
        setSumErrorRaised(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value6(ULong value) {
        setSumErrorHandled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value7(Timestamp value) {
        setFirstSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord value8(Timestamp value) {
        setLastSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsErrorsSummaryByThreadByErrorRecord values(ULong value1, Integer value2, String value3, String value4, ULong value5, ULong value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsErrorsSummaryByThreadByErrorRecord
     */
    public EventsErrorsSummaryByThreadByErrorRecord() {
        super(EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR);
    }

    /**
     * Create a detached, initialised EventsErrorsSummaryByThreadByErrorRecord
     */
    public EventsErrorsSummaryByThreadByErrorRecord(ULong threadId, Integer errorNumber, String errorName, String sqlState, ULong sumErrorRaised, ULong sumErrorHandled, Timestamp firstSeen, Timestamp lastSeen) {
        super(EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR);

        set(0, threadId);
        set(1, errorNumber);
        set(2, errorName);
        set(3, sqlState);
        set(4, sumErrorRaised);
        set(5, sumErrorHandled);
        set(6, firstSeen);
        set(7, lastSeen);
    }
}
