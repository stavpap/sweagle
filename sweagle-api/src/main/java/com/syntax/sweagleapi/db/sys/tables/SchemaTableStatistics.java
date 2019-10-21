/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.SchemaTableStatisticsRecord;

import java.math.BigInteger;

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
public class SchemaTableStatistics extends TableImpl<SchemaTableStatisticsRecord> {

    private static final long serialVersionUID = -1209333209;

    /**
     * The reference instance of <code>sys.schema_table_statistics</code>
     */
    public static final SchemaTableStatistics SCHEMA_TABLE_STATISTICS = new SchemaTableStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchemaTableStatisticsRecord> getRecordType() {
        return SchemaTableStatisticsRecord.class;
    }

    /**
     * The column <code>sys.schema_table_statistics.table_schema</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TABLE_SCHEMA = createField("table_schema", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_statistics.table_name</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.schema_table_statistics.total_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> TOTAL_LATENCY = createField("total_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_fetched</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_FETCHED = createField("rows_fetched", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.fetch_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> FETCH_LATENCY = createField("fetch_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_inserted</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_INSERTED = createField("rows_inserted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.insert_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> INSERT_LATENCY = createField("insert_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_updated</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_UPDATED = createField("rows_updated", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.update_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> UPDATE_LATENCY = createField("update_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.rows_deleted</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, ULong> ROWS_DELETED = createField("rows_deleted", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.schema_table_statistics.delete_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> DELETE_LATENCY = createField("delete_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_READ_REQUESTS = createField("io_read_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_READ = createField("io_read", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_read_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_READ_LATENCY = createField("io_read_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_WRITE_REQUESTS = createField("io_write_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_WRITE = createField("io_write", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_write_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_WRITE_LATENCY = createField("io_write_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_misc_requests</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, BigInteger> IO_MISC_REQUESTS = createField("io_misc_requests", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(42), this, "");

    /**
     * The column <code>sys.schema_table_statistics.io_misc_latency</code>.
     */
    public final TableField<SchemaTableStatisticsRecord, String> IO_MISC_LATENCY = createField("io_misc_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics() {
        this(DSL.name("schema_table_statistics"), null);
    }

    /**
     * Create an aliased <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics(String alias) {
        this(DSL.name(alias), SCHEMA_TABLE_STATISTICS);
    }

    /**
     * Create an aliased <code>sys.schema_table_statistics</code> table reference
     */
    public SchemaTableStatistics(Name alias) {
        this(alias, SCHEMA_TABLE_STATISTICS);
    }

    private SchemaTableStatistics(Name alias, Table<SchemaTableStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SchemaTableStatistics(Name alias, Table<SchemaTableStatisticsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> SchemaTableStatistics(Table<O> child, ForeignKey<O, SchemaTableStatisticsRecord> key) {
        super(child, key, SCHEMA_TABLE_STATISTICS);
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
    public SchemaTableStatistics as(String alias) {
        return new SchemaTableStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemaTableStatistics as(Name alias) {
        return new SchemaTableStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTableStatistics rename(String name) {
        return new SchemaTableStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SchemaTableStatistics rename(Name name) {
        return new SchemaTableStatistics(name, null);
    }
}
