/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.enums.SetupInstrumentsEnabled;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupInstrumentsTimed;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupInstruments;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class SetupInstrumentsRecord extends UpdatableRecordImpl<SetupInstrumentsRecord> implements Record6<String, SetupInstrumentsEnabled, SetupInstrumentsTimed, String, Integer, String> {

    private static final long serialVersionUID = 1293091284;

    /**
     * Setter for <code>performance_schema.setup_instruments.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.ENABLED</code>.
     */
    public void setEnabled(SetupInstrumentsEnabled value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.ENABLED</code>.
     */
    public SetupInstrumentsEnabled getEnabled() {
        return (SetupInstrumentsEnabled) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.TIMED</code>.
     */
    public void setTimed(SetupInstrumentsTimed value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.TIMED</code>.
     */
    public SetupInstrumentsTimed getTimed() {
        return (SetupInstrumentsTimed) get(2);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.PROPERTIES</code>.
     */
    public void setProperties(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.PROPERTIES</code>.
     */
    public String getProperties() {
        return (String) get(3);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.VOLATILITY</code>.
     */
    public void setVolatility(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.VOLATILITY</code>.
     */
    public Integer getVolatility() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>performance_schema.setup_instruments.DOCUMENTATION</code>.
     */
    public void setDocumentation(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.setup_instruments.DOCUMENTATION</code>.
     */
    public String getDocumentation() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, SetupInstrumentsEnabled, SetupInstrumentsTimed, String, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, SetupInstrumentsEnabled, SetupInstrumentsTimed, String, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SetupInstruments.SETUP_INSTRUMENTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupInstrumentsEnabled> field2() {
        return SetupInstruments.SETUP_INSTRUMENTS.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<SetupInstrumentsTimed> field3() {
        return SetupInstruments.SETUP_INSTRUMENTS.TIMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SetupInstruments.SETUP_INSTRUMENTS.PROPERTIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return SetupInstruments.SETUP_INSTRUMENTS.VOLATILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SetupInstruments.SETUP_INSTRUMENTS.DOCUMENTATION;
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
    public SetupInstrumentsEnabled component2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsTimed component3() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProperties();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getVolatility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDocumentation();
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
    public SetupInstrumentsEnabled value2() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsTimed value3() {
        return getTimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProperties();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getVolatility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDocumentation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value2(SetupInstrumentsEnabled value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value3(SetupInstrumentsTimed value) {
        setTimed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value4(String value) {
        setProperties(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value5(Integer value) {
        setVolatility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord value6(String value) {
        setDocumentation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupInstrumentsRecord values(String value1, SetupInstrumentsEnabled value2, SetupInstrumentsTimed value3, String value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupInstrumentsRecord
     */
    public SetupInstrumentsRecord() {
        super(SetupInstruments.SETUP_INSTRUMENTS);
    }

    /**
     * Create a detached, initialised SetupInstrumentsRecord
     */
    public SetupInstrumentsRecord(String name, SetupInstrumentsEnabled enabled, SetupInstrumentsTimed timed, String properties, Integer volatility, String documentation) {
        super(SetupInstruments.SETUP_INSTRUMENTS);

        set(0, name);
        set(1, enabled);
        set(2, timed);
        set(3, properties);
        set(4, volatility);
        set(5, documentation);
    }
}
