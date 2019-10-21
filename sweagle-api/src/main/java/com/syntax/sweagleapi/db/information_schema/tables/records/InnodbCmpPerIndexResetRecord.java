/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables.records;


import com.syntax.sweagleapi.db.information_schema.tables.InnodbCmpPerIndexReset;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCmpPerIndexResetRecord extends TableRecordImpl<InnodbCmpPerIndexResetRecord> implements Record8<String, String, String, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -1088478317;

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.database_name</code>.
     */
    public void setDatabaseName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.database_name</code>.
     */
    public String getDatabaseName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.table_name</code>.
     */
    public void setTableName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.table_name</code>.
     */
    public String getTableName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.index_name</code>.
     */
    public void setIndexName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.index_name</code>.
     */
    public String getIndexName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops</code>.
     */
    public void setCompressOps(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops</code>.
     */
    public Integer getCompressOps() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops_ok</code>.
     */
    public void setCompressOpsOk(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_ops_ok</code>.
     */
    public Integer getCompressOpsOk() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_time</code>.
     */
    public void setCompressTime(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.compress_time</code>.
     */
    public Integer getCompressTime() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_ops</code>.
     */
    public void setUncompressOps(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_ops</code>.
     */
    public Integer getUncompressOps() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_time</code>.
     */
    public void setUncompressTime(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP_PER_INDEX_RESET.uncompress_time</code>.
     */
    public Integer getUncompressTime() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.DATABASE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_OPS_OK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.COMPRESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.UNCOMPRESS_OPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET.UNCOMPRESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getDatabaseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getCompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCompressOpsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getUncompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getUncompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDatabaseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCompressOpsOk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getUncompressOps();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getUncompressTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value1(String value) {
        setDatabaseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value2(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value3(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value4(Integer value) {
        setCompressOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value5(Integer value) {
        setCompressOpsOk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value6(Integer value) {
        setCompressTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value7(Integer value) {
        setUncompressOps(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord value8(Integer value) {
        setUncompressTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpPerIndexResetRecord values(String value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbCmpPerIndexResetRecord
     */
    public InnodbCmpPerIndexResetRecord() {
        super(InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET);
    }

    /**
     * Create a detached, initialised InnodbCmpPerIndexResetRecord
     */
    public InnodbCmpPerIndexResetRecord(String databaseName, String tableName, String indexName, Integer compressOps, Integer compressOpsOk, Integer compressTime, Integer uncompressOps, Integer uncompressTime) {
        super(InnodbCmpPerIndexReset.INNODB_CMP_PER_INDEX_RESET);

        set(0, databaseName);
        set(1, tableName);
        set(2, indexName);
        set(3, compressOps);
        set(4, compressOpsOk);
        set(5, compressTime);
        set(6, uncompressOps);
        set(7, uncompressTime);
    }
}
