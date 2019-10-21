/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.tables.X$statementsWithRuntimesIn_95thPercentile;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class X$statementsWithRuntimesIn_95thPercentileRecord extends TableRecordImpl<X$statementsWithRuntimesIn_95thPercentileRecord> implements Record16<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 892327355;

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.query</code>.
     */
    public void setQuery(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.query</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.full_scan</code>.
     */
    public void setFullScan(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.full_scan</code>.
     */
    public String getFullScan() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.exec_count</code>.
     */
    public void setExecCount(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.exec_count</code>.
     */
    public ULong getExecCount() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.err_count</code>.
     */
    public void setErrCount(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.err_count</code>.
     */
    public ULong getErrCount() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.warn_count</code>.
     */
    public void setWarnCount(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.warn_count</code>.
     */
    public ULong getWarnCount() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.total_latency</code>.
     */
    public void setTotalLatency(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.total_latency</code>.
     */
    public ULong getTotalLatency() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.max_latency</code>.
     */
    public void setMaxLatency(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.max_latency</code>.
     */
    public ULong getMaxLatency() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.avg_latency</code>.
     */
    public void setAvgLatency(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.avg_latency</code>.
     */
    public ULong getAvgLatency() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
     */
    public void setRowsSentAvg(BigInteger value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_sent_avg</code>.
     */
    public BigInteger getRowsSentAvg() {
        return (BigInteger) get(10);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
     */
    public void setRowsExaminedAvg(BigInteger value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.rows_examined_avg</code>.
     */
    public BigInteger getRowsExaminedAvg() {
        return (BigInteger) get(12);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.first_seen</code>.
     */
    public void setFirstSeen(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.first_seen</code>.
     */
    public Timestamp getFirstSeen() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.last_seen</code>.
     */
    public void setLastSeen(Timestamp value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.last_seen</code>.
     */
    public Timestamp getLastSeen() {
        return (Timestamp) get(14);
    }

    /**
     * Setter for <code>sys.x$statements_with_runtimes_in_95th_percentile.digest</code>.
     */
    public void setDigest(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.x$statements_with_runtimes_in_95th_percentile.digest</code>.
     */
    public String getDigest() {
        return (String) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<String, String, String, ULong, ULong, ULong, ULong, ULong, ULong, ULong, BigInteger, ULong, BigInteger, Timestamp, Timestamp, String> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.FULL_SCAN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.EXEC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ERR_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.WARN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.TOTAL_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field8() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.MAX_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.AVG_LATENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_SENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field11() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_SENT_AVG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_EXAMINED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field13() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.ROWS_EXAMINED_AVG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.FIRST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field15() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.LAST_SEEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE.DIGEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFullScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getExecCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getErrCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getWarnCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component8() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component11() {
        return getRowsSentAvg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component13() {
        return getRowsExaminedAvg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component15() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getDigest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFullScan();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getExecCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getErrCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getWarnCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getTotalLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value8() {
        return getMaxLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getAvgLatency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getRowsSent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value11() {
        return getRowsSentAvg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getRowsExamined();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value13() {
        return getRowsExaminedAvg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getFirstSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value15() {
        return getLastSeen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getDigest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value1(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value2(String value) {
        setDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value3(String value) {
        setFullScan(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value4(ULong value) {
        setExecCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value5(ULong value) {
        setErrCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value6(ULong value) {
        setWarnCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value7(ULong value) {
        setTotalLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value8(ULong value) {
        setMaxLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value9(ULong value) {
        setAvgLatency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value10(ULong value) {
        setRowsSent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value11(BigInteger value) {
        setRowsSentAvg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value12(ULong value) {
        setRowsExamined(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value13(BigInteger value) {
        setRowsExaminedAvg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value14(Timestamp value) {
        setFirstSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value15(Timestamp value) {
        setLastSeen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord value16(String value) {
        setDigest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$statementsWithRuntimesIn_95thPercentileRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, ULong value8, ULong value9, ULong value10, BigInteger value11, ULong value12, BigInteger value13, Timestamp value14, Timestamp value15, String value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached X$statementsWithRuntimesIn_95thPercentileRecord
     */
    public X$statementsWithRuntimesIn_95thPercentileRecord() {
        super(X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);
    }

    /**
     * Create a detached, initialised X$statementsWithRuntimesIn_95thPercentileRecord
     */
    public X$statementsWithRuntimesIn_95thPercentileRecord(String query, String db, String fullScan, ULong execCount, ULong errCount, ULong warnCount, ULong totalLatency, ULong maxLatency, ULong avgLatency, ULong rowsSent, BigInteger rowsSentAvg, ULong rowsExamined, BigInteger rowsExaminedAvg, Timestamp firstSeen, Timestamp lastSeen, String digest) {
        super(X$statementsWithRuntimesIn_95thPercentile.X$STATEMENTS_WITH_RUNTIMES_IN_95TH_PERCENTILE);

        set(0, query);
        set(1, db);
        set(2, fullScan);
        set(3, execCount);
        set(4, errCount);
        set(5, warnCount);
        set(6, totalLatency);
        set(7, maxLatency);
        set(8, avgLatency);
        set(9, rowsSent);
        set(10, rowsSentAvg);
        set(11, rowsExamined);
        set(12, rowsExaminedAvg);
        set(13, firstSeen);
        set(14, lastSeen);
        set(15, digest);
    }
}
