/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.tables.KeyringKeys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class KeyringKeysRecord extends TableRecordImpl<KeyringKeysRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 75452445;

    /**
     * Setter for <code>performance_schema.keyring_keys.KEY_ID</code>.
     */
    public void setKeyId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.keyring_keys.KEY_ID</code>.
     */
    public String getKeyId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.keyring_keys.KEY_OWNER</code>.
     */
    public void setKeyOwner(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.keyring_keys.KEY_OWNER</code>.
     */
    public String getKeyOwner() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.keyring_keys.BACKEND_KEY_ID</code>.
     */
    public void setBackendKeyId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.keyring_keys.BACKEND_KEY_ID</code>.
     */
    public String getBackendKeyId() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return KeyringKeys.KEYRING_KEYS.KEY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return KeyringKeys.KEYRING_KEYS.KEY_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return KeyringKeys.KEYRING_KEYS.BACKEND_KEY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getKeyOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBackendKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getKeyOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBackendKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringKeysRecord value1(String value) {
        setKeyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringKeysRecord value2(String value) {
        setKeyOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringKeysRecord value3(String value) {
        setBackendKeyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyringKeysRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyringKeysRecord
     */
    public KeyringKeysRecord() {
        super(KeyringKeys.KEYRING_KEYS);
    }

    /**
     * Create a detached, initialised KeyringKeysRecord
     */
    public KeyringKeysRecord(String keyId, String keyOwner, String backendKeyId) {
        super(KeyringKeys.KEYRING_KEYS);

        set(0, keyId);
        set(1, keyOwner);
        set(2, backendKeyId);
    }
}
