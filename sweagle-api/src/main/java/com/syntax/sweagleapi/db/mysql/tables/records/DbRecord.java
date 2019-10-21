/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.mysql.tables.records;


import com.syntax.sweagleapi.db.mysql.enums.DbAlterPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbAlterRoutinePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbCreatePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbCreateRoutinePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbCreateTmpTablePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbCreateViewPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbDeletePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbDropPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbEventPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbExecutePriv;
import com.syntax.sweagleapi.db.mysql.enums.DbGrantPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbIndexPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbInsertPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbLockTablesPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbReferencesPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbSelectPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbShowViewPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbTriggerPriv;
import com.syntax.sweagleapi.db.mysql.enums.DbUpdatePriv;
import com.syntax.sweagleapi.db.mysql.tables.Db;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Record3;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Database privileges
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbRecord extends UpdatableRecordImpl<DbRecord> implements Record22<String, String, String, DbSelectPriv, DbInsertPriv, DbUpdatePriv, DbDeletePriv, DbCreatePriv, DbDropPriv, DbGrantPriv, DbReferencesPriv, DbIndexPriv, DbAlterPriv, DbCreateTmpTablePriv, DbLockTablesPriv, DbCreateViewPriv, DbShowViewPriv, DbCreateRoutinePriv, DbAlterRoutinePriv, DbExecutePriv, DbEventPriv, DbTriggerPriv> {

    private static final long serialVersionUID = 1182911589;

    /**
     * Setter for <code>mysql.db.Host</code>.
     */
    public void setHost(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.db.Host</code>.
     */
    public String getHost() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.db.Db</code>.
     */
    public void setDb(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.db.Db</code>.
     */
    public String getDb() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.db.User</code>.
     */
    public void setUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql.db.User</code>.
     */
    public String getUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mysql.db.Select_priv</code>.
     */
    public void setSelectPriv(DbSelectPriv value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql.db.Select_priv</code>.
     */
    public DbSelectPriv getSelectPriv() {
        return (DbSelectPriv) get(3);
    }

    /**
     * Setter for <code>mysql.db.Insert_priv</code>.
     */
    public void setInsertPriv(DbInsertPriv value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql.db.Insert_priv</code>.
     */
    public DbInsertPriv getInsertPriv() {
        return (DbInsertPriv) get(4);
    }

    /**
     * Setter for <code>mysql.db.Update_priv</code>.
     */
    public void setUpdatePriv(DbUpdatePriv value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql.db.Update_priv</code>.
     */
    public DbUpdatePriv getUpdatePriv() {
        return (DbUpdatePriv) get(5);
    }

    /**
     * Setter for <code>mysql.db.Delete_priv</code>.
     */
    public void setDeletePriv(DbDeletePriv value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql.db.Delete_priv</code>.
     */
    public DbDeletePriv getDeletePriv() {
        return (DbDeletePriv) get(6);
    }

    /**
     * Setter for <code>mysql.db.Create_priv</code>.
     */
    public void setCreatePriv(DbCreatePriv value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql.db.Create_priv</code>.
     */
    public DbCreatePriv getCreatePriv() {
        return (DbCreatePriv) get(7);
    }

    /**
     * Setter for <code>mysql.db.Drop_priv</code>.
     */
    public void setDropPriv(DbDropPriv value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql.db.Drop_priv</code>.
     */
    public DbDropPriv getDropPriv() {
        return (DbDropPriv) get(8);
    }

    /**
     * Setter for <code>mysql.db.Grant_priv</code>.
     */
    public void setGrantPriv(DbGrantPriv value) {
        set(9, value);
    }

    /**
     * Getter for <code>mysql.db.Grant_priv</code>.
     */
    public DbGrantPriv getGrantPriv() {
        return (DbGrantPriv) get(9);
    }

    /**
     * Setter for <code>mysql.db.References_priv</code>.
     */
    public void setReferencesPriv(DbReferencesPriv value) {
        set(10, value);
    }

    /**
     * Getter for <code>mysql.db.References_priv</code>.
     */
    public DbReferencesPriv getReferencesPriv() {
        return (DbReferencesPriv) get(10);
    }

    /**
     * Setter for <code>mysql.db.Index_priv</code>.
     */
    public void setIndexPriv(DbIndexPriv value) {
        set(11, value);
    }

    /**
     * Getter for <code>mysql.db.Index_priv</code>.
     */
    public DbIndexPriv getIndexPriv() {
        return (DbIndexPriv) get(11);
    }

    /**
     * Setter for <code>mysql.db.Alter_priv</code>.
     */
    public void setAlterPriv(DbAlterPriv value) {
        set(12, value);
    }

    /**
     * Getter for <code>mysql.db.Alter_priv</code>.
     */
    public DbAlterPriv getAlterPriv() {
        return (DbAlterPriv) get(12);
    }

    /**
     * Setter for <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public void setCreateTmpTablePriv(DbCreateTmpTablePriv value) {
        set(13, value);
    }

    /**
     * Getter for <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public DbCreateTmpTablePriv getCreateTmpTablePriv() {
        return (DbCreateTmpTablePriv) get(13);
    }

    /**
     * Setter for <code>mysql.db.Lock_tables_priv</code>.
     */
    public void setLockTablesPriv(DbLockTablesPriv value) {
        set(14, value);
    }

    /**
     * Getter for <code>mysql.db.Lock_tables_priv</code>.
     */
    public DbLockTablesPriv getLockTablesPriv() {
        return (DbLockTablesPriv) get(14);
    }

    /**
     * Setter for <code>mysql.db.Create_view_priv</code>.
     */
    public void setCreateViewPriv(DbCreateViewPriv value) {
        set(15, value);
    }

    /**
     * Getter for <code>mysql.db.Create_view_priv</code>.
     */
    public DbCreateViewPriv getCreateViewPriv() {
        return (DbCreateViewPriv) get(15);
    }

    /**
     * Setter for <code>mysql.db.Show_view_priv</code>.
     */
    public void setShowViewPriv(DbShowViewPriv value) {
        set(16, value);
    }

    /**
     * Getter for <code>mysql.db.Show_view_priv</code>.
     */
    public DbShowViewPriv getShowViewPriv() {
        return (DbShowViewPriv) get(16);
    }

    /**
     * Setter for <code>mysql.db.Create_routine_priv</code>.
     */
    public void setCreateRoutinePriv(DbCreateRoutinePriv value) {
        set(17, value);
    }

    /**
     * Getter for <code>mysql.db.Create_routine_priv</code>.
     */
    public DbCreateRoutinePriv getCreateRoutinePriv() {
        return (DbCreateRoutinePriv) get(17);
    }

    /**
     * Setter for <code>mysql.db.Alter_routine_priv</code>.
     */
    public void setAlterRoutinePriv(DbAlterRoutinePriv value) {
        set(18, value);
    }

    /**
     * Getter for <code>mysql.db.Alter_routine_priv</code>.
     */
    public DbAlterRoutinePriv getAlterRoutinePriv() {
        return (DbAlterRoutinePriv) get(18);
    }

    /**
     * Setter for <code>mysql.db.Execute_priv</code>.
     */
    public void setExecutePriv(DbExecutePriv value) {
        set(19, value);
    }

    /**
     * Getter for <code>mysql.db.Execute_priv</code>.
     */
    public DbExecutePriv getExecutePriv() {
        return (DbExecutePriv) get(19);
    }

    /**
     * Setter for <code>mysql.db.Event_priv</code>.
     */
    public void setEventPriv(DbEventPriv value) {
        set(20, value);
    }

    /**
     * Getter for <code>mysql.db.Event_priv</code>.
     */
    public DbEventPriv getEventPriv() {
        return (DbEventPriv) get(20);
    }

    /**
     * Setter for <code>mysql.db.Trigger_priv</code>.
     */
    public void setTriggerPriv(DbTriggerPriv value) {
        set(21, value);
    }

    /**
     * Getter for <code>mysql.db.Trigger_priv</code>.
     */
    public DbTriggerPriv getTriggerPriv() {
        return (DbTriggerPriv) get(21);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<String, String, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, DbSelectPriv, DbInsertPriv, DbUpdatePriv, DbDeletePriv, DbCreatePriv, DbDropPriv, DbGrantPriv, DbReferencesPriv, DbIndexPriv, DbAlterPriv, DbCreateTmpTablePriv, DbLockTablesPriv, DbCreateViewPriv, DbShowViewPriv, DbCreateRoutinePriv, DbAlterRoutinePriv, DbExecutePriv, DbEventPriv, DbTriggerPriv> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, DbSelectPriv, DbInsertPriv, DbUpdatePriv, DbDeletePriv, DbCreatePriv, DbDropPriv, DbGrantPriv, DbReferencesPriv, DbIndexPriv, DbAlterPriv, DbCreateTmpTablePriv, DbLockTablesPriv, DbCreateViewPriv, DbShowViewPriv, DbCreateRoutinePriv, DbAlterRoutinePriv, DbExecutePriv, DbEventPriv, DbTriggerPriv> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Db.DB.HOST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Db.DB.DB_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Db.DB.USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbSelectPriv> field4() {
        return Db.DB.SELECT_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbInsertPriv> field5() {
        return Db.DB.INSERT_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbUpdatePriv> field6() {
        return Db.DB.UPDATE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbDeletePriv> field7() {
        return Db.DB.DELETE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbCreatePriv> field8() {
        return Db.DB.CREATE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbDropPriv> field9() {
        return Db.DB.DROP_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbGrantPriv> field10() {
        return Db.DB.GRANT_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbReferencesPriv> field11() {
        return Db.DB.REFERENCES_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbIndexPriv> field12() {
        return Db.DB.INDEX_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbAlterPriv> field13() {
        return Db.DB.ALTER_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbCreateTmpTablePriv> field14() {
        return Db.DB.CREATE_TMP_TABLE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbLockTablesPriv> field15() {
        return Db.DB.LOCK_TABLES_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbCreateViewPriv> field16() {
        return Db.DB.CREATE_VIEW_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbShowViewPriv> field17() {
        return Db.DB.SHOW_VIEW_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbCreateRoutinePriv> field18() {
        return Db.DB.CREATE_ROUTINE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbAlterRoutinePriv> field19() {
        return Db.DB.ALTER_ROUTINE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbExecutePriv> field20() {
        return Db.DB.EXECUTE_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbEventPriv> field21() {
        return Db.DB.EVENT_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<DbTriggerPriv> field22() {
        return Db.DB.TRIGGER_PRIV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHost();
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
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbSelectPriv component4() {
        return getSelectPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbInsertPriv component5() {
        return getInsertPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbUpdatePriv component6() {
        return getUpdatePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDeletePriv component7() {
        return getDeletePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreatePriv component8() {
        return getCreatePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDropPriv component9() {
        return getDropPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbGrantPriv component10() {
        return getGrantPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbReferencesPriv component11() {
        return getReferencesPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbIndexPriv component12() {
        return getIndexPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAlterPriv component13() {
        return getAlterPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateTmpTablePriv component14() {
        return getCreateTmpTablePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbLockTablesPriv component15() {
        return getLockTablesPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateViewPriv component16() {
        return getCreateViewPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbShowViewPriv component17() {
        return getShowViewPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateRoutinePriv component18() {
        return getCreateRoutinePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAlterRoutinePriv component19() {
        return getAlterRoutinePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbExecutePriv component20() {
        return getExecutePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbEventPriv component21() {
        return getEventPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTriggerPriv component22() {
        return getTriggerPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHost();
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
        return getUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbSelectPriv value4() {
        return getSelectPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbInsertPriv value5() {
        return getInsertPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbUpdatePriv value6() {
        return getUpdatePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDeletePriv value7() {
        return getDeletePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreatePriv value8() {
        return getCreatePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbDropPriv value9() {
        return getDropPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbGrantPriv value10() {
        return getGrantPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbReferencesPriv value11() {
        return getReferencesPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbIndexPriv value12() {
        return getIndexPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAlterPriv value13() {
        return getAlterPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateTmpTablePriv value14() {
        return getCreateTmpTablePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbLockTablesPriv value15() {
        return getLockTablesPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateViewPriv value16() {
        return getCreateViewPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbShowViewPriv value17() {
        return getShowViewPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbCreateRoutinePriv value18() {
        return getCreateRoutinePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbAlterRoutinePriv value19() {
        return getAlterRoutinePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbExecutePriv value20() {
        return getExecutePriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbEventPriv value21() {
        return getEventPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbTriggerPriv value22() {
        return getTriggerPriv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value1(String value) {
        setHost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value2(String value) {
        setDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value3(String value) {
        setUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value4(DbSelectPriv value) {
        setSelectPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value5(DbInsertPriv value) {
        setInsertPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value6(DbUpdatePriv value) {
        setUpdatePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value7(DbDeletePriv value) {
        setDeletePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value8(DbCreatePriv value) {
        setCreatePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value9(DbDropPriv value) {
        setDropPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value10(DbGrantPriv value) {
        setGrantPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value11(DbReferencesPriv value) {
        setReferencesPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value12(DbIndexPriv value) {
        setIndexPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value13(DbAlterPriv value) {
        setAlterPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value14(DbCreateTmpTablePriv value) {
        setCreateTmpTablePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value15(DbLockTablesPriv value) {
        setLockTablesPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value16(DbCreateViewPriv value) {
        setCreateViewPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value17(DbShowViewPriv value) {
        setShowViewPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value18(DbCreateRoutinePriv value) {
        setCreateRoutinePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value19(DbAlterRoutinePriv value) {
        setAlterRoutinePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value20(DbExecutePriv value) {
        setExecutePriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value21(DbEventPriv value) {
        setEventPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord value22(DbTriggerPriv value) {
        setTriggerPriv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DbRecord values(String value1, String value2, String value3, DbSelectPriv value4, DbInsertPriv value5, DbUpdatePriv value6, DbDeletePriv value7, DbCreatePriv value8, DbDropPriv value9, DbGrantPriv value10, DbReferencesPriv value11, DbIndexPriv value12, DbAlterPriv value13, DbCreateTmpTablePriv value14, DbLockTablesPriv value15, DbCreateViewPriv value16, DbShowViewPriv value17, DbCreateRoutinePriv value18, DbAlterRoutinePriv value19, DbExecutePriv value20, DbEventPriv value21, DbTriggerPriv value22) {
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
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DbRecord
     */
    public DbRecord() {
        super(Db.DB);
    }

    /**
     * Create a detached, initialised DbRecord
     */
    public DbRecord(String host, String db, String user, DbSelectPriv selectPriv, DbInsertPriv insertPriv, DbUpdatePriv updatePriv, DbDeletePriv deletePriv, DbCreatePriv createPriv, DbDropPriv dropPriv, DbGrantPriv grantPriv, DbReferencesPriv referencesPriv, DbIndexPriv indexPriv, DbAlterPriv alterPriv, DbCreateTmpTablePriv createTmpTablePriv, DbLockTablesPriv lockTablesPriv, DbCreateViewPriv createViewPriv, DbShowViewPriv showViewPriv, DbCreateRoutinePriv createRoutinePriv, DbAlterRoutinePriv alterRoutinePriv, DbExecutePriv executePriv, DbEventPriv eventPriv, DbTriggerPriv triggerPriv) {
        super(Db.DB);

        set(0, host);
        set(1, db);
        set(2, user);
        set(3, selectPriv);
        set(4, insertPriv);
        set(5, updatePriv);
        set(6, deletePriv);
        set(7, createPriv);
        set(8, dropPriv);
        set(9, grantPriv);
        set(10, referencesPriv);
        set(11, indexPriv);
        set(12, alterPriv);
        set(13, createTmpTablePriv);
        set(14, lockTablesPriv);
        set(15, createViewPriv);
        set(16, showViewPriv);
        set(17, createRoutinePriv);
        set(18, alterRoutinePriv);
        set(19, executePriv);
        set(20, eventPriv);
        set(21, triggerPriv);
    }
}
