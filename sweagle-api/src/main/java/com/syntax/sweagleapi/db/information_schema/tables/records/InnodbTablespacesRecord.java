/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables.records;


import com.syntax.sweagleapi.db.information_schema.tables.InnodbTablespaces;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbTablespacesRecord extends TableRecordImpl<InnodbTablespacesRecord> implements Record14<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong, String, UInteger, String, String> {

    private static final long serialVersionUID = -2027711114;

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.SPACE</code>.
     */
    public void setSpace(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.NAME</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.FLAG</code>.
     */
    public void setFlag(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.FLAG</code>.
     */
    public UInteger getFlag() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.ROW_FORMAT</code>.
     */
    public void setRowFormat(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.PAGE_SIZE</code>.
     */
    public void setPageSize(UInteger value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.PAGE_SIZE</code>.
     */
    public UInteger getPageSize() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public void setZipPageSize(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.ZIP_PAGE_SIZE</code>.
     */
    public UInteger getZipPageSize() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.SPACE_TYPE</code>.
     */
    public void setSpaceType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.SPACE_TYPE</code>.
     */
    public String getSpaceType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public void setFsBlockSize(UInteger value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.FS_BLOCK_SIZE</code>.
     */
    public UInteger getFsBlockSize() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.FILE_SIZE</code>.
     */
    public void setFileSize(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.FILE_SIZE</code>.
     */
    public ULong getFileSize() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public void setAllocatedSize(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.ALLOCATED_SIZE</code>.
     */
    public ULong getAllocatedSize() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.SERVER_VERSION</code>.
     */
    public void setServerVersion(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.SERVER_VERSION</code>.
     */
    public String getServerVersion() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.SPACE_VERSION</code>.
     */
    public void setSpaceVersion(UInteger value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.SPACE_VERSION</code>.
     */
    public UInteger getSpaceVersion() {
        return (UInteger) get(11);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.ENCRYPTION</code>.
     */
    public void setEncryption(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.ENCRYPTION</code>.
     */
    public String getEncryption() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.INNODB_TABLESPACES.STATE</code>.
     */
    public void setState(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESPACES.STATE</code>.
     */
    public String getState() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong, String, UInteger, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<UInteger, String, UInteger, String, UInteger, UInteger, String, UInteger, ULong, ULong, String, UInteger, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return InnodbTablespaces.INNODB_TABLESPACES.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbTablespaces.INNODB_TABLESPACES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field3() {
        return InnodbTablespaces.INNODB_TABLESPACES.FLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InnodbTablespaces.INNODB_TABLESPACES.ROW_FORMAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field5() {
        return InnodbTablespaces.INNODB_TABLESPACES.PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field6() {
        return InnodbTablespaces.INNODB_TABLESPACES.ZIP_PAGE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InnodbTablespaces.INNODB_TABLESPACES.SPACE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field8() {
        return InnodbTablespaces.INNODB_TABLESPACES.FS_BLOCK_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field9() {
        return InnodbTablespaces.INNODB_TABLESPACES.FILE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return InnodbTablespaces.INNODB_TABLESPACES.ALLOCATED_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return InnodbTablespaces.INNODB_TABLESPACES.SERVER_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field12() {
        return InnodbTablespaces.INNODB_TABLESPACES.SPACE_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InnodbTablespaces.INNODB_TABLESPACES.ENCRYPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return InnodbTablespaces.INNODB_TABLESPACES.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component5() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component6() {
        return getZipPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSpaceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component8() {
        return getFsBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component9() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getAllocatedSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getServerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component12() {
        return getSpaceVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getEncryption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value3() {
        return getFlag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRowFormat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value5() {
        return getPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value6() {
        return getZipPageSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSpaceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value8() {
        return getFsBlockSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value9() {
        return getFileSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getAllocatedSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getServerVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value12() {
        return getSpaceVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getEncryption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value1(UInteger value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value3(UInteger value) {
        setFlag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value4(String value) {
        setRowFormat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value5(UInteger value) {
        setPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value6(UInteger value) {
        setZipPageSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value7(String value) {
        setSpaceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value8(UInteger value) {
        setFsBlockSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value9(ULong value) {
        setFileSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value10(ULong value) {
        setAllocatedSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value11(String value) {
        setServerVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value12(UInteger value) {
        setSpaceVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value13(String value) {
        setEncryption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord value14(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbTablespacesRecord values(UInteger value1, String value2, UInteger value3, String value4, UInteger value5, UInteger value6, String value7, UInteger value8, ULong value9, ULong value10, String value11, UInteger value12, String value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbTablespacesRecord
     */
    public InnodbTablespacesRecord() {
        super(InnodbTablespaces.INNODB_TABLESPACES);
    }

    /**
     * Create a detached, initialised InnodbTablespacesRecord
     */
    public InnodbTablespacesRecord(UInteger space, String name, UInteger flag, String rowFormat, UInteger pageSize, UInteger zipPageSize, String spaceType, UInteger fsBlockSize, ULong fileSize, ULong allocatedSize, String serverVersion, UInteger spaceVersion, String encryption, String state) {
        super(InnodbTablespaces.INNODB_TABLESPACES);

        set(0, space);
        set(1, name);
        set(2, flag);
        set(3, rowFormat);
        set(4, pageSize);
        set(5, zipPageSize);
        set(6, spaceType);
        set(7, fsBlockSize);
        set(8, fileSize);
        set(9, allocatedSize);
        set(10, serverVersion);
        set(11, spaceVersion);
        set(12, encryption);
        set(13, state);
    }
}
