/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.mysql.tables;


import com.syntax.sweagleapi.db.mysql.Indexes;
import com.syntax.sweagleapi.db.mysql.Keys;
import com.syntax.sweagleapi.db.mysql.Mysql;
import com.syntax.sweagleapi.db.mysql.tables.records.ComponentRecord;

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
import org.jooq.types.UInteger;


/**
 * Components
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Component extends TableImpl<ComponentRecord> {

    private static final long serialVersionUID = -781928965;

    /**
     * The reference instance of <code>mysql.component</code>
     */
    public static final Component COMPONENT = new Component();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComponentRecord> getRecordType() {
        return ComponentRecord.class;
    }

    /**
     * The column <code>mysql.component.component_id</code>.
     */
    public final TableField<ComponentRecord, UInteger> COMPONENT_ID = createField("component_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>mysql.component.component_group_id</code>.
     */
    public final TableField<ComponentRecord, UInteger> COMPONENT_GROUP_ID = createField("component_group_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.component.component_urn</code>.
     */
    public final TableField<ComponentRecord, String> COMPONENT_URN = createField("component_urn", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>mysql.component</code> table reference
     */
    public Component() {
        this(DSL.name("component"), null);
    }

    /**
     * Create an aliased <code>mysql.component</code> table reference
     */
    public Component(String alias) {
        this(DSL.name(alias), COMPONENT);
    }

    /**
     * Create an aliased <code>mysql.component</code> table reference
     */
    public Component(Name alias) {
        this(alias, COMPONENT);
    }

    private Component(Name alias, Table<ComponentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Component(Name alias, Table<ComponentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Components"));
    }

    public <O extends Record> Component(Table<O> child, ForeignKey<O, ComponentRecord> key) {
        super(child, key, COMPONENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Mysql.MYSQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMPONENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ComponentRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_COMPONENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ComponentRecord> getPrimaryKey() {
        return Keys.KEY_COMPONENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ComponentRecord>> getKeys() {
        return Arrays.<UniqueKey<ComponentRecord>>asList(Keys.KEY_COMPONENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Component as(String alias) {
        return new Component(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Component as(Name alias) {
        return new Component(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Component rename(String name) {
        return new Component(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Component rename(Name name) {
        return new Component(name, null);
    }
}
