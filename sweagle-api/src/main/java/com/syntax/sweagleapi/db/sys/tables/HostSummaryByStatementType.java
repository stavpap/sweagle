/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.HostSummaryByStatementTypeRecord;

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
public class HostSummaryByStatementType extends TableImpl<HostSummaryByStatementTypeRecord> {

    private static final long serialVersionUID = -12198441;

    /**
     * The reference instance of <code>sys.host_summary_by_statement_type</code>
     */
    public static final HostSummaryByStatementType HOST_SUMMARY_BY_STATEMENT_TYPE = new HostSummaryByStatementType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostSummaryByStatementTypeRecord> getRecordType() {
        return HostSummaryByStatementTypeRecord.class;
    }

    /**
     * The column <code>sys.host_summary_by_statement_type.host</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, String> HOST = createField("host", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.statement</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, String> STATEMENT = createField("statement", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.total</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, ULong> TOTAL = createField("total", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.total_latency</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.max_latency</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, String> MAX_LATENCY = createField("max_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.lock_latency</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, String> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_sent</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_examined</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.rows_affected</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.host_summary_by_statement_type.full_scans</code>.
     */
    public final TableField<HostSummaryByStatementTypeRecord, ULong> FULL_SCANS = createField("full_scans", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>sys.host_summary_by_statement_type</code> table reference
     */
    public HostSummaryByStatementType() {
        this(DSL.name("host_summary_by_statement_type"), null);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_statement_type</code> table reference
     */
    public HostSummaryByStatementType(String alias) {
        this(DSL.name(alias), HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    /**
     * Create an aliased <code>sys.host_summary_by_statement_type</code> table reference
     */
    public HostSummaryByStatementType(Name alias) {
        this(alias, HOST_SUMMARY_BY_STATEMENT_TYPE);
    }

    private HostSummaryByStatementType(Name alias, Table<HostSummaryByStatementTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostSummaryByStatementType(Name alias, Table<HostSummaryByStatementTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> HostSummaryByStatementType(Table<O> child, ForeignKey<O, HostSummaryByStatementTypeRecord> key) {
        super(child, key, HOST_SUMMARY_BY_STATEMENT_TYPE);
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
    public HostSummaryByStatementType as(String alias) {
        return new HostSummaryByStatementType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostSummaryByStatementType as(Name alias) {
        return new HostSummaryByStatementType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStatementType rename(String name) {
        return new HostSummaryByStatementType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HostSummaryByStatementType rename(Name name) {
        return new HostSummaryByStatementType(name, null);
    }
}
