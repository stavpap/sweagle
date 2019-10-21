/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.WaitClassesGlobalByAvgLatency;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class WaitClassesGlobalByAvgLatencyRecord extends TableRecordImpl<WaitClassesGlobalByAvgLatencyRecord> implements Record6<String, BigInteger, String, String, String, String> {

    private static final long serialVersionUID = 1924013767;

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.event_class</code>.
     */
    public void setEventClass(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.event_class</code>.
     */
    public String getEventClass() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.total</code>.
     */
    public void setTotal(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.total</code>.
     */
    public BigInteger getTotal() {
        return (BigInteger) get(1);
    }

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public void setTotalLatency(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.total_latency</code>.
     */
    public String getTotalLatency() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public void setMinLatency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.min_latency</code>.
     */
    public String getMinLatency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public void setAvgLatency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.avg_latency</code>.
     */
    public String getAvgLatency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public void setMaxLatency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.wait_classes_global_by_avg_latency.max_latency</code>.
     */
    public String getMaxLatency() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, BigInteger, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, BigInteger, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.EVENT_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.MIN_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getEventClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMinLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getEventClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getTotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMinLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value1(String value) {
        setEventClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value2(BigInteger value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value3(String value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value4(String value) {
        setMinLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value5(String value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord value6(String value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WaitClassesGlobalByAvgLatencyRecord values(String value1, BigInteger value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WaitClassesGlobalByAvgLatencyRecord
     */
    public WaitClassesGlobalByAvgLatencyRecord() {
        super(WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);
    }

    /**
     * Create a detached, initialised WaitClassesGlobalByAvgLatencyRecord
     */
    public WaitClassesGlobalByAvgLatencyRecord(String eventClass, BigInteger total, String totalLatency, String minLatency, String avgLatency, String maxLatency) {
        super(WaitClassesGlobalByAvgLatency.WAIT_CLASSES_GLOBAL_BY_AVG_LATENCY);

        set(0, eventClass);
        set(1, total);
        set(2, totalLatency);
        set(3, minLatency);
        set(4, avgLatency);
        set(5, maxLatency);
    }
}
