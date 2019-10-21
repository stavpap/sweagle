/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.tables.MetadataLocks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
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
public class MetadataLocksRecord extends UpdatableRecordImpl<MetadataLocksRecord> implements Record11<String, String, String, String, ULong, String, String, String, String, ULong, ULong> {

    private static final long serialVersionUID = -1460014574;

    /**
     * Setter for <code>performance_schema.metadata_locks.OBJECT_TYPE</code>.
     */
    public void setObjectType(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.OBJECT_INSTANCE_BEGIN</code>.
     */
    public void setObjectInstanceBegin(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.LOCK_TYPE</code>.
     */
    public void setLockType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.LOCK_TYPE</code>.
     */
    public String getLockType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.LOCK_DURATION</code>.
     */
    public void setLockDuration(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.LOCK_DURATION</code>.
     */
    public String getLockDuration() {
        return (String) get(6);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.LOCK_STATUS</code>.
     */
    public void setLockStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.LOCK_STATUS</code>.
     */
    public String getLockStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.SOURCE</code>.
     */
    public void setSource(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.OWNER_THREAD_ID</code>.
     */
    public void setOwnerThreadId(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OWNER_THREAD_ID</code>.
     */
    public ULong getOwnerThreadId() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.metadata_locks.OWNER_EVENT_ID</code>.
     */
    public void setOwnerEventId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.metadata_locks.OWNER_EVENT_ID</code>.
     */
    public ULong getOwnerEventId() {
        return (ULong) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, ULong, String, String, String, String, ULong, ULong> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, ULong, String, String, String, String, ULong, ULong> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return MetadataLocks.METADATA_LOCKS.OBJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return MetadataLocks.METADATA_LOCKS.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return MetadataLocks.METADATA_LOCKS.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return MetadataLocks.METADATA_LOCKS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return MetadataLocks.METADATA_LOCKS.OBJECT_INSTANCE_BEGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return MetadataLocks.METADATA_LOCKS.LOCK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return MetadataLocks.METADATA_LOCKS.LOCK_DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return MetadataLocks.METADATA_LOCKS.LOCK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return MetadataLocks.METADATA_LOCKS.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return MetadataLocks.METADATA_LOCKS.OWNER_THREAD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return MetadataLocks.METADATA_LOCKS.OWNER_EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLockType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLockDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getLockStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getOwnerThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getOwnerEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getObjectType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getObjectSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getObjectName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getObjectInstanceBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLockType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLockDuration();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getLockStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getOwnerThreadId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getOwnerEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value1(String value) {
        setObjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value2(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value5(ULong value) {
        setObjectInstanceBegin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value6(String value) {
        setLockType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value7(String value) {
        setLockDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value8(String value) {
        setLockStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value9(String value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value10(ULong value) {
        setOwnerThreadId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord value11(ULong value) {
        setOwnerEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetadataLocksRecord values(String value1, String value2, String value3, String value4, ULong value5, String value6, String value7, String value8, String value9, ULong value10, ULong value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MetadataLocksRecord
     */
    public MetadataLocksRecord() {
        super(MetadataLocks.METADATA_LOCKS);
    }

    /**
     * Create a detached, initialised MetadataLocksRecord
     */
    public MetadataLocksRecord(String objectType, String objectSchema, String objectName, String columnName, ULong objectInstanceBegin, String lockType, String lockDuration, String lockStatus, String source, ULong ownerThreadId, ULong ownerEventId) {
        super(MetadataLocks.METADATA_LOCKS);

        set(0, objectType);
        set(1, objectSchema);
        set(2, objectName);
        set(3, columnName);
        set(4, objectInstanceBegin);
        set(5, lockType);
        set(6, lockDuration);
        set(7, lockStatus);
        set(8, source);
        set(9, ownerThreadId);
        set(10, ownerEventId);
    }
}
