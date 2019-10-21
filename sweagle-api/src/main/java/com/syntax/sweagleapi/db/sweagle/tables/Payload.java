/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sweagle.tables;


import com.syntax.sweagleapi.db.sweagle.Indexes;
import com.syntax.sweagleapi.db.sweagle.Keys;
import com.syntax.sweagleapi.db.sweagle.Sweagle;
import com.syntax.sweagleapi.db.sweagle.tables.records.PayloadRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Payload extends TableImpl<PayloadRecord> {

    private static final long serialVersionUID = 538809949;

    /**
     * The reference instance of <code>sweagle.payload</code>
     */
    public static final Payload PAYLOAD = new Payload();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PayloadRecord> getRecordType() {
        return PayloadRecord.class;
    }

    /**
     * The column <code>sweagle.payload.id</code>.
     */
    public final TableField<PayloadRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>sweagle.payload.create_date</code>.
     */
    public final TableField<PayloadRecord, Timestamp> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sweagle.payload.update_date</code>.
     */
    public final TableField<PayloadRecord, Timestamp> UPDATE_DATE = createField("update_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sweagle.payload.data</code>.
     */
    public final TableField<PayloadRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>sweagle.payload.dataset_id</code>.
     */
    public final TableField<PayloadRecord, Long> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>sweagle.payload</code> table reference
     */
    public Payload() {
        this(DSL.name("payload"), null);
    }

    /**
     * Create an aliased <code>sweagle.payload</code> table reference
     */
    public Payload(String alias) {
        this(DSL.name(alias), PAYLOAD);
    }

    /**
     * Create an aliased <code>sweagle.payload</code> table reference
     */
    public Payload(Name alias) {
        this(alias, PAYLOAD);
    }

    private Payload(Name alias, Table<PayloadRecord> aliased) {
        this(alias, aliased, null);
    }

    private Payload(Name alias, Table<PayloadRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Payload(Table<O> child, ForeignKey<O, PayloadRecord> key) {
        super(child, key, PAYLOAD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sweagle.SWEAGLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PAYLOAD_DATASET_ID, Indexes.PAYLOAD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<PayloadRecord, Long> getIdentity() {
        return Keys.IDENTITY_PAYLOAD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PayloadRecord> getPrimaryKey() {
        return Keys.KEY_PAYLOAD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PayloadRecord>> getKeys() {
        return Arrays.<UniqueKey<PayloadRecord>>asList(Keys.KEY_PAYLOAD_PRIMARY, Keys.KEY_PAYLOAD_DATASET_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PayloadRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PayloadRecord, ?>>asList(Keys.PAYLOAD_IBFK_1);
    }

    public Dataset dataset() {
        return new Dataset(this, Keys.PAYLOAD_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payload as(String alias) {
        return new Payload(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Payload as(Name alias) {
        return new Payload(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Payload rename(String name) {
        return new Payload(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Payload rename(Name name) {
        return new Payload(name, null);
    }
}
