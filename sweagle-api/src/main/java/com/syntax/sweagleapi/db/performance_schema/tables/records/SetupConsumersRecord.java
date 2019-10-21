/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.enums.SetupConsumersEnabled;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupConsumers;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class SetupConsumersRecord extends UpdatableRecordImpl<SetupConsumersRecord> implements Record2<String, SetupConsumersEnabled> {

    private static final long serialVersionUID = -385416019;

    /**
     * Setter for <code>performance_schema.setup_consumers.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.setup_consumers.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_consumers.ENABLED</code>.
     */
    public void setEnabled(SetupConsumersEnabled value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.setup_consumers.ENABLED</code>.
     */
    public SetupConsumersEnabled getEnabled() {
        return (SetupConsumersEnabled) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, SetupConsumersEnabled> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, SetupConsumersEnabled> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SetupConsumers.SETUP_CONSUMERS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupConsumersEnabled> field2() {
        return SetupConsumers.SETUP_CONSUMERS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupConsumersEnabled component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupConsumersEnabled value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupConsumersRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupConsumersRecord value2(SetupConsumersEnabled value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupConsumersRecord values(String value1, SetupConsumersEnabled value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupConsumersRecord
     */
    public SetupConsumersRecord() {
        super(SetupConsumers.SETUP_CONSUMERS);
    }

    /**
     * Create a detached, initialised SetupConsumersRecord
     */
    public SetupConsumersRecord(String name, SetupConsumersEnabled enabled) {
        super(SetupConsumers.SETUP_CONSUMERS);

        set(0, name);
        set(1, enabled);
    }
}
