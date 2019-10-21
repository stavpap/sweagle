/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.X$userSummaryByStagesRecord;

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
public class X$userSummaryByStages extends TableImpl<X$userSummaryByStagesRecord> {

    private static final long serialVersionUID = 329978923;

    /**
     * The reference instance of <code>sys.x$user_summary_by_stages</code>
     */
    public static final X$userSummaryByStages X$USER_SUMMARY_BY_STAGES = new X$userSummaryByStages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$userSummaryByStagesRecord> getRecordType() {
        return X$userSummaryByStagesRecord.class;
    }

    /**
     * The column <code>sys.x$user_summary_by_stages.user</code>.
     */
    public final TableField<X$userSummaryByStagesRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.x$user_summary_by_stages.event_name</code>.
     */
    public final TableField<X$userSummaryByStagesRecord, String> EVENT_NAME = createField("event_name", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_stages.total</code>.
     */
    public final TableField<X$userSummaryByStagesRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_stages.total_latency</code>.
     */
    public final TableField<X$userSummaryByStagesRecord, ULong> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$user_summary_by_stages.avg_latency</code>.
     */
    public final TableField<X$userSummaryByStagesRecord, ULong> AVG_LATENCY = createField("avg_latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$user_summary_by_stages</code> table reference
     */
    public X$userSummaryByStages() {
        this(DSL.name("x$user_summary_by_stages"), null);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_stages</code> table reference
     */
    public X$userSummaryByStages(String alias) {
        this(DSL.name(alias), X$USER_SUMMARY_BY_STAGES);
    }

    /**
     * Create an aliased <code>sys.x$user_summary_by_stages</code> table reference
     */
    public X$userSummaryByStages(Name alias) {
        this(alias, X$USER_SUMMARY_BY_STAGES);
    }

    private X$userSummaryByStages(Name alias, Table<X$userSummaryByStagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$userSummaryByStages(Name alias, Table<X$userSummaryByStagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$userSummaryByStages(Table<O> child, ForeignKey<O, X$userSummaryByStagesRecord> key) {
        super(child, key, X$USER_SUMMARY_BY_STAGES);
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
    public X$userSummaryByStages as(String alias) {
        return new X$userSummaryByStages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$userSummaryByStages as(Name alias) {
        return new X$userSummaryByStages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStages rename(String name) {
        return new X$userSummaryByStages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$userSummaryByStages rename(Name name) {
        return new X$userSummaryByStages(name, null);
    }
}
