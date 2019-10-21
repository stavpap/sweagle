/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables;


import com.syntax.sweagleapi.db.performance_schema.Indexes;
import com.syntax.sweagleapi.db.performance_schema.Keys;
import com.syntax.sweagleapi.db.performance_schema.PerformanceSchema;
import com.syntax.sweagleapi.db.performance_schema.tables.records.PersistedVariablesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class PersistedVariables extends TableImpl<PersistedVariablesRecord> {

    private static final long serialVersionUID = 1336771658;

    /**
     * The reference instance of <code>performance_schema.persisted_variables</code>
     */
    public static final PersistedVariables PERSISTED_VARIABLES = new PersistedVariables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersistedVariablesRecord> getRecordType() {
        return PersistedVariablesRecord.class;
    }

    /**
     * The column <code>performance_schema.persisted_variables.VARIABLE_NAME</code>.
     */
    public final TableField<PersistedVariablesRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.persisted_variables.VARIABLE_VALUE</code>.
     */
    public final TableField<PersistedVariablesRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * Create a <code>performance_schema.persisted_variables</code> table reference
     */
    public PersistedVariables() {
        this(DSL.name("persisted_variables"), null);
    }

    /**
     * Create an aliased <code>performance_schema.persisted_variables</code> table reference
     */
    public PersistedVariables(String alias) {
        this(DSL.name(alias), PERSISTED_VARIABLES);
    }

    /**
     * Create an aliased <code>performance_schema.persisted_variables</code> table reference
     */
    public PersistedVariables(Name alias) {
        this(alias, PERSISTED_VARIABLES);
    }

    private PersistedVariables(Name alias, Table<PersistedVariablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PersistedVariables(Name alias, Table<PersistedVariablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PersistedVariables(Table<O> child, ForeignKey<O, PersistedVariablesRecord> key) {
        super(child, key, PERSISTED_VARIABLES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PERSISTED_VARIABLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PersistedVariablesRecord> getPrimaryKey() {
        return Keys.KEY_PERSISTED_VARIABLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PersistedVariablesRecord>> getKeys() {
        return Arrays.<UniqueKey<PersistedVariablesRecord>>asList(Keys.KEY_PERSISTED_VARIABLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersistedVariables as(String alias) {
        return new PersistedVariables(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersistedVariables as(Name alias) {
        return new PersistedVariables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistedVariables rename(String name) {
        return new PersistedVariables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistedVariables rename(Name name) {
        return new PersistedVariables(name, null);
    }
}
