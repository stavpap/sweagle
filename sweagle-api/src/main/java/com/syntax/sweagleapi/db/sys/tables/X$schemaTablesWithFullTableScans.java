/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.X$schemaTablesWithFullTableScansRecord;

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
public class X$schemaTablesWithFullTableScans extends TableImpl<X$schemaTablesWithFullTableScansRecord> {

    private static final long serialVersionUID = 867707321;

    /**
     * The reference instance of <code>sys.x$schema_tables_with_full_table_scans</code>
     */
    public static final X$schemaTablesWithFullTableScans X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS = new X$schemaTablesWithFullTableScans();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<X$schemaTablesWithFullTableScansRecord> getRecordType() {
        return X$schemaTablesWithFullTableScansRecord.class;
    }

    /**
     * The column <code>sys.x$schema_tables_with_full_table_scans.object_schema</code>.
     */
    public final TableField<X$schemaTablesWithFullTableScansRecord, String> OBJECT_SCHEMA = createField("object_schema", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$schema_tables_with_full_table_scans.object_name</code>.
     */
    public final TableField<X$schemaTablesWithFullTableScansRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.x$schema_tables_with_full_table_scans.rows_full_scanned</code>.
     */
    public final TableField<X$schemaTablesWithFullTableScansRecord, ULong> ROWS_FULL_SCANNED = createField("rows_full_scanned", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.x$schema_tables_with_full_table_scans.latency</code>.
     */
    public final TableField<X$schemaTablesWithFullTableScansRecord, ULong> LATENCY = createField("latency", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>sys.x$schema_tables_with_full_table_scans</code> table reference
     */
    public X$schemaTablesWithFullTableScans() {
        this(DSL.name("x$schema_tables_with_full_table_scans"), null);
    }

    /**
     * Create an aliased <code>sys.x$schema_tables_with_full_table_scans</code> table reference
     */
    public X$schemaTablesWithFullTableScans(String alias) {
        this(DSL.name(alias), X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    /**
     * Create an aliased <code>sys.x$schema_tables_with_full_table_scans</code> table reference
     */
    public X$schemaTablesWithFullTableScans(Name alias) {
        this(alias, X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
    }

    private X$schemaTablesWithFullTableScans(Name alias, Table<X$schemaTablesWithFullTableScansRecord> aliased) {
        this(alias, aliased, null);
    }

    private X$schemaTablesWithFullTableScans(Name alias, Table<X$schemaTablesWithFullTableScansRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> X$schemaTablesWithFullTableScans(Table<O> child, ForeignKey<O, X$schemaTablesWithFullTableScansRecord> key) {
        super(child, key, X$SCHEMA_TABLES_WITH_FULL_TABLE_SCANS);
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
    public X$schemaTablesWithFullTableScans as(String alias) {
        return new X$schemaTablesWithFullTableScans(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public X$schemaTablesWithFullTableScans as(Name alias) {
        return new X$schemaTablesWithFullTableScans(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTablesWithFullTableScans rename(String name) {
        return new X$schemaTablesWithFullTableScans(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public X$schemaTablesWithFullTableScans rename(Name name) {
        return new X$schemaTablesWithFullTableScans(name, null);
    }
}
