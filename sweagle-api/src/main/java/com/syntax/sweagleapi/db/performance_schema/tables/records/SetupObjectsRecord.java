/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsEnabled;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsObjectType;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsTimed;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupObjects;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SetupObjectsRecord extends TableRecordImpl<SetupObjectsRecord> implements Record5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> {

    private static final long serialVersionUID = -968087354;

    /**
     * Setter for <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
     */
    public void setObjectType(SetupObjectsObjectType value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
     */
    public SetupObjectsObjectType getObjectType() {
        return (SetupObjectsObjectType) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
     */
    public void setObjectSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_objects.OBJECT_NAME</code>.
     */
    public void setObjectName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.setup_objects.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.setup_objects.ENABLED</code>.
     */
    public void setEnabled(SetupObjectsEnabled value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.setup_objects.ENABLED</code>.
     */
    public SetupObjectsEnabled getEnabled() {
        return (SetupObjectsEnabled) get(3);
    }

    /**
     * Setter for <code>performance_schema.setup_objects.TIMED</code>.
     */
    public void setTimed(SetupObjectsTimed value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.setup_objects.TIMED</code>.
     */
    public SetupObjectsTimed getTimed() {
        return (SetupObjectsTimed) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<SetupObjectsObjectType, String, String, SetupObjectsEnabled, SetupObjectsTimed> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupObjectsObjectType> field1() {
        return SetupObjects.SETUP_OBJECTS.OBJECT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SetupObjects.SETUP_OBJECTS.OBJECT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SetupObjects.SETUP_OBJECTS.OBJECT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupObjectsEnabled> field4() {
        return SetupObjects.SETUP_OBJECTS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupObjectsTimed> field5() {
        return SetupObjects.SETUP_OBJECTS.TIMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsObjectType component1() {
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
    public SetupObjectsEnabled component4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsTimed component5() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsObjectType value1() {
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
    public SetupObjectsEnabled value4() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsTimed value5() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord value1(SetupObjectsObjectType value) {
        setObjectType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord value2(String value) {
        setObjectSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord value3(String value) {
        setObjectName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord value4(SetupObjectsEnabled value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord value5(SetupObjectsTimed value) {
        setTimed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjectsRecord values(SetupObjectsObjectType value1, String value2, String value3, SetupObjectsEnabled value4, SetupObjectsTimed value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupObjectsRecord
     */
    public SetupObjectsRecord() {
        super(SetupObjects.SETUP_OBJECTS);
    }

    /**
     * Create a detached, initialised SetupObjectsRecord
     */
    public SetupObjectsRecord(SetupObjectsObjectType objectType, String objectSchema, String objectName, SetupObjectsEnabled enabled, SetupObjectsTimed timed) {
        super(SetupObjects.SETUP_OBJECTS);

        set(0, objectType);
        set(1, objectSchema);
        set(2, objectName);
        set(3, enabled);
        set(4, timed);
    }
}
