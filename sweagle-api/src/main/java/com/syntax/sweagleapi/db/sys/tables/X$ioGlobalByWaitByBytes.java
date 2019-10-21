/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.X$ioGlobalByWaitByBytesRecord;

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
public class X$ioGlobalByWaitByBytes extends TableImpl<X$ioGlobalByWaitByBytesRecord> {

    private static final long serialVersionUID = 426787787;

    /**
     * The reference instance of <code>sys.x$io_global_by_wait_by_bytes</code>
     */
    public static final X$ioGlobalByWaitByBytes X$IO_GLOBAL_BY_WAIT_BY_BYTES = new X$ioGlobalByWaitByBytes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$ioGlobalByWaitByBytesRecord> getRecordType() {
        return X$ioGlobalByWaitByBytesRecord.class;
    }

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.event_name</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.total</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.total_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.min_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> MIN_LATENCY = createField("min_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.avg_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.max_latency</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.count_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> COUNT_READ = createField("count_read", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.total_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, Long> TOTAL_READ = createField("total_read", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.avg_read</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, BigDecimal> AVG_READ = createField("avg_read", org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.count_write</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, ULong> COUNT_WRITE = createField("count_write", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.total_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, Long> TOTAL_WRITTEN = createField("total_written", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.avg_written</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, BigDecimal> AVG_WRITTEN = createField("avg_written", org.jooq.impl.SQLDataType.DECIMAL(23, 4).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.0000", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>sys.x$io_global_by_wait_by_bytes.total_requested</code>.
     */
    public final TableField<X$ioGlobalByWaitByBytesRecord, Long> TOTAL_REQUESTED = createField("total_requested", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>sys.x$io_global_by_wait_by_bytes</code> table reference
     */
    public X$ioGlobalByWaitByBytes() {
        this(DSL.name("x$io_global_by_wait_by_bytes"), null);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_bytes</code> table reference
     */
    public X$ioGlobalByWaitByBytes(String alias) {
        this(DSL.name(alias), X$IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    /**
     * Create an aliased <code>sys.x$io_global_by_wait_by_bytes</code> table reference
     */
    public X$ioGlobalByWaitByBytes(Name alias) {
        this(alias, X$IO_GLOBAL_BY_WAIT_BY_BYTES);
    }

    private X$ioGlobalByWaitByBytes(Name alias, Table<X$ioGlobalByWaitByBytesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$ioGlobalByWaitByBytes(Name alias, Table<X$ioGlobalByWaitByBytesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$ioGlobalByWaitByBytes(Table<O> child, ForeignKey<O, X$ioGlobalByWaitByBytesRecord> key) {
        super(child, key, X$IO_GLOBAL_BY_WAIT_BY_BYTES);
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
    public X$ioGlobalByWaitByBytes as(String alias) {
        return new X$ioGlobalByWaitByBytes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$ioGlobalByWaitByBytes as(Name alias) {
        return new X$ioGlobalByWaitByBytes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByBytes rename(String name) {
        return new X$ioGlobalByWaitByBytes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$ioGlobalByWaitByBytes rename(Name name) {
        return new X$ioGlobalByWaitByBytes(name, null);
    }
}
