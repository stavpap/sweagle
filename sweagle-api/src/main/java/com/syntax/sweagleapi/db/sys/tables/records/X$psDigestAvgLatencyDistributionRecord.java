/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.X$psDigestAvgLatencyDistribution;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class X$psDigestAvgLatencyDistributionRecord extends TableRecordImpl<X$psDigestAvgLatencyDistributionRecord> implements Record2<Long, BigInteger> {

    private static final long serialVersionUID = -280759999;

    /**
     * Setter for <code>sys.x$ps_digest_avg_latency_distribution.cnt</code>.
     */
    public void setCnt(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$ps_digest_avg_latency_distribution.cnt</code>.
     */
    public Long getCnt() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sys.x$ps_digest_avg_latency_distribution.avg_us</code>.
     */
    public void setAvgUs(BigInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$ps_digest_avg_latency_distribution.avg_us</code>.
     */
    public BigInteger getAvgUs() {
        return (BigInteger) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, BigInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, BigInteger> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION.CNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field2() {
        return X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION.AVG_US;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component2() {
        return getAvgUs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getCnt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value2() {
        return getAvgUs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$psDigestAvgLatencyDistributionRecord value1(Long value) {
        setCnt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$psDigestAvgLatencyDistributionRecord value2(BigInteger value) {
        setAvgUs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$psDigestAvgLatencyDistributionRecord values(Long value1, BigInteger value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$psDigestAvgLatencyDistributionRecord
     */
    public X$psDigestAvgLatencyDistributionRecord() {
        super(X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION);
    }

    /**
     * Create a detached, initialised X$psDigestAvgLatencyDistributionRecord
     */
    public X$psDigestAvgLatencyDistributionRecord(Long cnt, BigInteger avgUs) {
        super(X$psDigestAvgLatencyDistribution.X$PS_DIGEST_AVG_LATENCY_DISTRIBUTION);

        set(0, cnt);
        set(1, avgUs);
    }
}
