/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.X$ioGlobalByWaitByLatencyRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
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
public class X$ioGlobalByWaitByLatency extends TableImpl<X$ioGlobalByWaitByLatencyRecord> {

    private static final long serialVersionUID = -2135568919;

    /**
     * The reference instance of <code>sys.x$io_global_by_wait_by_latency</code>
     */
    public static final X$ioGlobalByWaitByLatency X$IO_GLOBAL_BY_WAIT_BY_LATENCY = new X$ioGlobalByWaitByLatency();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$ioGlobalByWaitByLatencyRecord> getRecordType() {
        return X$ioGlobalByWaitByLatencyRecord.class;
    }

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.event_name</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.max_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.read_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> READ_LATENCY = createField("read_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.write_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> WRITE_LATENCY = createField("write_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.misc_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> MISC_LATENCY = createField("misc_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.count_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, Long> TOTAL_READ = createField("total_read", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, BigDecimal> AVG_READ = createField("avg_read", org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.count_write</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.total_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, Long> TOTAL_WRITTEN = createField("total_written", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_latency.avg_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByLatencyRecord, BigDecimal> AVG_WRITTEN = createField("avg_written", org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * Create a <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency() {
        this(DSL.name("x$io_global_by_wait_by_latency"), null);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency(String alias) {
        this(DSL.name(alias), X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_latency</code> table reference
     */
    public X$ioGlobalByWaitByLatency(Name alias) {
        this(alias, X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    private X$ioGlobalByWaitByLatency(Name alias, Table<X$ioGlobalByWaitByLatencyRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$ioGlobalByWaitByLatency(Name alias, Table<X$ioGlobalByWaitByLatencyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$ioGlobalByWaitByLatency(Table<O> child, ForeignKey<O, X$ioGlobalByWaitByLatencyRecord> key) {
        super(child, key, X$IO_GLOBAL_BY_WAIT_BY_LATENCY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatency as(String alias) {
        return new X$ioGlobalByWaitByLatency(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByLatency as(Name alias) {
        return new X$ioGlobalByWaitByLatency(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByLatency rename(String name) {
        return new X$ioGlobalByWaitByLatency(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByLatency rename(Name name) {
        return new X$ioGlobalByWaitByLatency(name, null);
    }
}
