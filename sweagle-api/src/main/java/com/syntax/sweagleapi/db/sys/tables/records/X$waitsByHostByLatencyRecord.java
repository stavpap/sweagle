/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.X$waitsByHostByLatency;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class X$waitsByHostByLatencyRecord extends TableRecordImpl<X$waitsByHostByLatencyRecord> implements Record6<String, String, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -121359704;

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.event</code>.
     */
    public void setEvent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.event</code>.
     */
    public String getEvent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.total</code>.
     */
    public void setTotal(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.total</code>.
     */
    public ULong getTotal() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$waits_by_host_by_latency.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$waits_by_host_by_latency.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, String, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field3() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.TOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY.MAX_LATENCY;
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
        return getEvent();
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
    public ULong component4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
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
        return getEvent();
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
    public ULong value4() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value2(String value) {
        setEvent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value3(ULong value) {
        setTotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value4(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value5(ULong value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord value6(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$waitsByHostByLatencyRecord values(String value1, String value2, ULong value3, ULong value4, ULong value5, ULong value6) {
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
     * Create a detached X$waitsByHostByLatencyRecord
     */
    public X$waitsByHostByLatencyRecord() {
        super(X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY);
    }

    /**
     * Create a detached, initialised X$waitsByHostByLatencyRecord
     */
    public X$waitsByHostByLatencyRecord(String host, String event, ULong total, ULong totalLatency, ULong avgLatency, ULong maxLatency) {
        super(X$waitsByHostByLatency.X$WAITS_BY_HOST_BY_LATENCY);

        set(0, host);
        set(1, event);
        set(2, total);
        set(3, totalLatency);
        set(4, avgLatency);
        set(5, maxLatency);
    }
}
