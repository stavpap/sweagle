/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables.records;


import com.syntax.sweagleapi.db.information_schema.tables.InnodbForeignCols;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class InnodbForeignColsRecord extends TableRecordImpl<InnodbForeignColsRecord> implements Record4<String, String, String, UInteger> {

    private static final long serialVersionUID = 1659045843;

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN_COLS.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN_COLS.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    public void setForColName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    public String getForColName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    public void setRefColName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    public String getRefColName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_FOREIGN_COLS.POS</code>.
     */
    public void setPos(UInteger value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN_COLS.POS</code>.
     */
    public UInteger getPos() {
        return (UInteger) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, UInteger> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InnodbForeignCols.INNODB_FOREIGN_COLS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbForeignCols.INNODB_FOREIGN_COLS.FOR_COL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InnodbForeignCols.INNODB_FOREIGN_COLS.REF_COL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field4() {
        return InnodbForeignCols.INNODB_FOREIGN_COLS.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getForColName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRefColName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component4() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getForColName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRefColName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value4() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignColsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignColsRecord value2(String value) {
        setForColName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignColsRecord value3(String value) {
        setRefColName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignColsRecord value4(UInteger value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignColsRecord values(String value1, String value2, String value3, UInteger value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbForeignColsRecord
     */
    public InnodbForeignColsRecord() {
        super(InnodbForeignCols.INNODB_FOREIGN_COLS);
    }

    /**
     * Create a detached, initialised InnodbForeignColsRecord
     */
    public InnodbForeignColsRecord(String id, String forColName, String refColName, UInteger pos) {
        super(InnodbForeignCols.INNODB_FOREIGN_COLS);

        set(0, id);
        set(1, forColName);
        set(2, refColName);
        set(3, pos);
    }
}
