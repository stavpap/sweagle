/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.enums.SessionTrxAutocommit;
import com.syntax.sweagleapi.db.sys.enums.SessionTrxState;
import com.syntax.sweagleapi.db.sys.tables.records.SessionRecord;

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
public class Session extends TableImpl<SessionRecord> {

    private static final long serialVersionUID = 1064187827;

    /**
     * The reference instance of <code>sys.session</code>
     */
    public static final Session SESSION = new Session();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionRecord> getRecordType() {
        return SessionRecord.class;
    }

    /**
     * The column <code>sys.session.thd_id</code>.
     */
    public final TableField<SessionRecord, ULong> THD_ID = createField("thd_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>sys.session.conn_id</code>.
     */
    public final TableField<SessionRecord, ULong> CONN_ID = createField("conn_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.user</code>.
     */
    public final TableField<SessionRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(288), this, "");

    /**
     * The column <code>sys.session.db</code>.
     */
    public final TableField<SessionRecord, String> DB = createField("db", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.session.command</code>.
     */
    public final TableField<SessionRecord, String> COMMAND = createField("command", org.jooq.impl.SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>sys.session.state</code>.
     */
    public final TableField<SessionRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.session.time</code>.
     */
    public final TableField<SessionRecord, Long> TIME = createField("time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.session.current_statement</code>.
     */
    public final TableField<SessionRecord, String> CURRENT_STATEMENT = createField("current_statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.statement_latency</code>.
     */
    public final TableField<SessionRecord, String> STATEMENT_LATENCY = createField("statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.progress</code>.
     */
    public final TableField<SessionRecord, BigDecimal> PROGRESS = createField("progress", org.jooq.impl.SQLDataType.DECIMAL(26, 2), this, "");

    /**
     * The column <code>sys.session.lock_latency</code>.
     */
    public final TableField<SessionRecord, String> LOCK_LATENCY = createField("lock_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.rows_examined</code>.
     */
    public final TableField<SessionRecord, ULong> ROWS_EXAMINED = createField("rows_examined", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.rows_sent</code>.
     */
    public final TableField<SessionRecord, ULong> ROWS_SENT = createField("rows_sent", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.rows_affected</code>.
     */
    public final TableField<SessionRecord, ULong> ROWS_AFFECTED = createField("rows_affected", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.tmp_tables</code>.
     */
    public final TableField<SessionRecord, ULong> TMP_TABLES = createField("tmp_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.tmp_disk_tables</code>.
     */
    public final TableField<SessionRecord, ULong> TMP_DISK_TABLES = createField("tmp_disk_tables", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>sys.session.full_scan</code>.
     */
    public final TableField<SessionRecord, String> FULL_SCAN = createField("full_scan", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>sys.session.last_statement</code>.
     */
    public final TableField<SessionRecord, String> LAST_STATEMENT = createField("last_statement", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.last_statement_latency</code>.
     */
    public final TableField<SessionRecord, String> LAST_STATEMENT_LATENCY = createField("last_statement_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.current_memory</code>.
     */
    public final TableField<SessionRecord, String> CURRENT_MEMORY = createField("current_memory", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.last_wait</code>.
     */
    public final TableField<SessionRecord, String> LAST_WAIT = createField("last_wait", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.session.last_wait_latency</code>.
     */
    public final TableField<SessionRecord, String> LAST_WAIT_LATENCY = createField("last_wait_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.source</code>.
     */
    public final TableField<SessionRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>sys.session.trx_latency</code>.
     */
    public final TableField<SessionRecord, String> TRX_LATENCY = createField("trx_latency", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>sys.session.trx_state</code>.
     */
    public final TableField<SessionRecord, SessionTrxState> TRX_STATE = createField("trx_state", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.syntax.sweagleapi.db.sys.enums.SessionTrxState.class), this, "");

    /**
     * The column <code>sys.session.trx_autocommit</code>.
     */
    public final TableField<SessionRecord, SessionTrxAutocommit> TRX_AUTOCOMMIT = createField("trx_autocommit", org.jooq.impl.SQLDataType.VARCHAR(3).asEnumDataType(com.syntax.sweagleapi.db.sys.enums.SessionTrxAutocommit.class), this, "");

    /**
     * The column <code>sys.session.pid</code>.
     */
    public final TableField<SessionRecord, String> PID = createField("pid", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>sys.session.program_name</code>.
     */
    public final TableField<SessionRecord, String> PROGRAM_NAME = createField("program_name", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>sys.session</code> table reference
     */
    public Session() {
        this(DSL.name("session"), null);
    }

    /**
     * Create an aliased <code>sys.session</code> table reference
     */
    public Session(String alias) {
        this(DSL.name(alias), SESSION);
    }

    /**
     * Create an aliased <code>sys.session</code> table reference
     */
    public Session(Name alias) {
        this(alias, SESSION);
    }

    private Session(Name alias, Table<SessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Session(Name alias, Table<SessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> Session(Table<O> child, ForeignKey<O, SessionRecord> key) {
        super(child, key, SESSION);
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
    public Session as(String alias) {
        return new Session(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Session as(Name alias) {
        return new Session(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Session rename(String name) {
        return new Session(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Session rename(Name name) {
        return new Session(name, null);
    }
}
