/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables.records;


import com.syntax.sweagleapi.db.sys.enums.SessionTrxAutocommit;
import com.syntax.sweagleapi.db.sys.enums.SessionTrxState;
import com.syntax.sweagleapi.db.sys.tables.Session;

import java.math.BigDecimal;

import javax.annotation.Generated;

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
public class SessionRecord extends TableRecordImpl<SessionRecord> {

    private static final long serialVersionUID = 718112200;

    /**
     * Setter for <code>sys.session.thd_id</code>.
     */
    public void setThdId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>sys.session.thd_id</code>.
     */
    public ULong getThdId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>sys.session.conn_id</code>.
     */
    public void setConnId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>sys.session.conn_id</code>.
     */
    public ULong getConnId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>sys.session.user</code>.
     */
    public void setUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>sys.session.user</code>.
     */
    public String getUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>sys.session.db</code>.
     */
    public void setDb(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>sys.session.db</code>.
     */
    public String getDb() {
        return (String) get(3);
    }

    /**
     * Setter for <code>sys.session.command</code>.
     */
    public void setCommand(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>sys.session.command</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>sys.session.state</code>.
     */
    public void setState(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>sys.session.state</code>.
     */
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>sys.session.time</code>.
     */
    public void setTime(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>sys.session.time</code>.
     */
    public Long getTime() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>sys.session.current_statement</code>.
     */
    public void setCurrentStatement(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>sys.session.current_statement</code>.
     */
    public String getCurrentStatement() {
        return (String) get(7);
    }

    /**
     * Setter for <code>sys.session.statement_latency</code>.
     */
    public void setStatementLatency(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>sys.session.statement_latency</code>.
     */
    public String getStatementLatency() {
        return (String) get(8);
    }

    /**
     * Setter for <code>sys.session.progress</code>.
     */
    public void setProgress(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>sys.session.progress</code>.
     */
    public BigDecimal getProgress() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>sys.session.lock_latency</code>.
     */
    public void setLockLatency(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>sys.session.lock_latency</code>.
     */
    public String getLockLatency() {
        return (String) get(10);
    }

    /**
     * Setter for <code>sys.session.rows_examined</code>.
     */
    public void setRowsExamined(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>sys.session.rows_examined</code>.
     */
    public ULong getRowsExamined() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>sys.session.rows_sent</code>.
     */
    public void setRowsSent(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>sys.session.rows_sent</code>.
     */
    public ULong getRowsSent() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>sys.session.rows_affected</code>.
     */
    public void setRowsAffected(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>sys.session.rows_affected</code>.
     */
    public ULong getRowsAffected() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>sys.session.tmp_tables</code>.
     */
    public void setTmpTables(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>sys.session.tmp_tables</code>.
     */
    public ULong getTmpTables() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>sys.session.tmp_disk_tables</code>.
     */
    public void setTmpDiskTables(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>sys.session.tmp_disk_tables</code>.
     */
    public ULong getTmpDiskTables() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>sys.session.full_scan</code>.
     */
    public void setFullScan(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>sys.session.full_scan</code>.
     */
    public String getFullScan() {
        return (String) get(16);
    }

    /**
     * Setter for <code>sys.session.last_statement</code>.
     */
    public void setLastStatement(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>sys.session.last_statement</code>.
     */
    public String getLastStatement() {
        return (String) get(17);
    }

    /**
     * Setter for <code>sys.session.last_statement_latency</code>.
     */
    public void setLastStatementLatency(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>sys.session.last_statement_latency</code>.
     */
    public String getLastStatementLatency() {
        return (String) get(18);
    }

    /**
     * Setter for <code>sys.session.current_memory</code>.
     */
    public void setCurrentMemory(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>sys.session.current_memory</code>.
     */
    public String getCurrentMemory() {
        return (String) get(19);
    }

    /**
     * Setter for <code>sys.session.last_wait</code>.
     */
    public void setLastWait(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>sys.session.last_wait</code>.
     */
    public String getLastWait() {
        return (String) get(20);
    }

    /**
     * Setter for <code>sys.session.last_wait_latency</code>.
     */
    public void setLastWaitLatency(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>sys.session.last_wait_latency</code>.
     */
    public String getLastWaitLatency() {
        return (String) get(21);
    }

    /**
     * Setter for <code>sys.session.source</code>.
     */
    public void setSource(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>sys.session.source</code>.
     */
    public String getSource() {
        return (String) get(22);
    }

    /**
     * Setter for <code>sys.session.trx_latency</code>.
     */
    public void setTrxLatency(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>sys.session.trx_latency</code>.
     */
    public String getTrxLatency() {
        return (String) get(23);
    }

    /**
     * Setter for <code>sys.session.trx_state</code>.
     */
    public void setTrxState(SessionTrxState value) {
        set(24, value);
    }

    /**
     * Getter for <code>sys.session.trx_state</code>.
     */
    public SessionTrxState getTrxState() {
        return (SessionTrxState) get(24);
    }

    /**
     * Setter for <code>sys.session.trx_autocommit</code>.
     */
    public void setTrxAutocommit(SessionTrxAutocommit value) {
        set(25, value);
    }

    /**
     * Getter for <code>sys.session.trx_autocommit</code>.
     */
    public SessionTrxAutocommit getTrxAutocommit() {
        return (SessionTrxAutocommit) get(25);
    }

    /**
     * Setter for <code>sys.session.pid</code>.
     */
    public void setPid(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>sys.session.pid</code>.
     */
    public String getPid() {
        return (String) get(26);
    }

    /**
     * Setter for <code>sys.session.program_name</code>.
     */
    public void setProgramName(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>sys.session.program_name</code>.
     */
    public String getProgramName() {
        return (String) get(27);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionRecord
     */
    public SessionRecord() {
        super(Session.SESSION);
    }

    /**
     * Create a detached, initialised SessionRecord
     */
    public SessionRecord(ULong thdId, ULong connId, String user, String db, String command, String state, Long time, String currentStatement, String statementLatency, BigDecimal progress, String lockLatency, ULong rowsExamined, ULong rowsSent, ULong rowsAffected, ULong tmpTables, ULong tmpDiskTables, String fullScan, String lastStatement, String lastStatementLatency, String currentMemory, String lastWait, String lastWaitLatency, String source, String trxLatency, SessionTrxState trxState, SessionTrxAutocommit trxAutocommit, String pid, String programName) {
        super(Session.SESSION);

        set(0, thdId);
        set(1, connId);
        set(2, user);
        set(3, db);
        set(4, command);
        set(5, state);
        set(6, time);
        set(7, currentStatement);
        set(8, statementLatency);
        set(9, progress);
        set(10, lockLatency);
        set(11, rowsExamined);
        set(12, rowsSent);
        set(13, rowsAffected);
        set(14, tmpTables);
        set(15, tmpDiskTables);
        set(16, fullScan);
        set(17, lastStatement);
        set(18, lastStatementLatency);
        set(19, currentMemory);
        set(20, lastWait);
        set(21, lastWaitLatency);
        set(22, source);
        set(23, trxLatency);
        set(24, trxState);
        set(25, trxAutocommit);
        set(26, pid);
        set(27, programName);
    }
}
