/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.UserSummaryRecord;

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
public class UserSummary extends TableImpl<UserSummaryRecord> {

    private static final long serialVersionUID = -1658378206;

    /**
     * The reference instance of <code>sys.user_summary</code>
     */
    public static final UserSummary USER_SUMMARY = new UserSummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserSummaryRecord> getRecordType() {
        return UserSummaryRecord.class;
    }

    /**
     * The column <code>sys.user_summary.user</code>.
     */
    public final TableField<UserSummaryRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>sys.user_summary.statements</code>.
     */
    public final TableField<UserSummaryRecord, BigInteger> STATEMENTS = createField("statements", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.user_summary.statement_latency</code>.
     */
    public final TableField<UserSummaryRecord, String> STATEMENT_LATENCY = createField("statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.statement_avg_latency</code>.
     */
    public final TableField<UserSummaryRecord, String> STATEMENT_AVG_LATENCY = createField("statement_avg_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.table_scans</code>.
     */
    public final TableField<UserSummaryRecord, BigInteger> TABLE_SCANS = createField("table_scans", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(65), this, "");

    /**
     * The column <code>sys.user_summary.file_ios</code>.
     */
    public final TableField<UserSummaryRecord, BigInteger> FILE_IOS = createField("file_ios", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(64), this, "");

    /**
     * The column <code>sys.user_summary.file_io_latency</code>.
     */
    public final TableField<UserSummaryRecord, String> FILE_IO_LATENCY = createField("file_io_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.current_connections</code>.
     */
    public final TableField<UserSummaryRecord, BigInteger> CURRENT_CONNECTIONS = createField("current_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.user_summary.total_connections</code>.
     */
    public final TableField<UserSummaryRecord, BigInteger> TOTAL_CONNECTIONS = createField("total_connections", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

    /**
     * The column <code>sys.user_summary.unique_hosts</code>.
     */
    public final TableField<UserSummaryRecord, Long> UNIQUE_HOSTS = createField("unique_hosts", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>sys.user_summary.current_memory</code>.
     */
    public final TableField<UserSummaryRecord, String> CURRENT_MEMORY = createField("current_memory", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.user_summary.total_memory_allocated</code>.
     */
    public final TableField<UserSummaryRecord, String> TOTAL_MEMORY_ALLOCATED = createField("total_memory_allocated", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>sys.user_summary</code> table reference
     */
    public UserSummary() {
        this(DSL.name("user_summary"), null);
    }

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    public UserSummary(String alias) {
        this(DSL.name(alias), USER_SUMMARY);
    }

    /**
     * Create an aliased <code>sys.user_summary</code> table reference
     */
    public UserSummary(Name alias) {
        this(alias, USER_SUMMARY);
    }

    private UserSummary(Name alias, Table<UserSummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserSummary(Name alias, Table<UserSummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> UserSummary(Table<O> child, ForeignKey<O, UserSummaryRecord> key) {
        super(child, key, USER_SUMMARY);
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
    public UserSummary as(String alias) {
        return new UserSummary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserSummary as(Name alias) {
        return new UserSummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummary rename(String name) {
        return new UserSummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserSummary rename(Name name) {
        return new UserSummary(name, null);
    }
}
