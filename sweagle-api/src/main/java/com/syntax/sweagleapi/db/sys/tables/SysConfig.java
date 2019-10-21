/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.tables;


import com.syntax.sweagleapi.db.sys.Indexes;
import com.syntax.sweagleapi.db.sys.Keys;
import com.syntax.sweagleapi.db.sys.Sys;
import com.syntax.sweagleapi.db.sys.tables.records.SysConfigRecord;

import java.sql.Timestamp;
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
public class SysConfig extends TableImpl<SysConfigRecord> {

    private static final long serialVersionUID = -588247650;

    /**
     * The reference instance of <code>sys.sys_config</code>
     */
    public static final SysConfig SYS_CONFIG = new SysConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SysConfigRecord> getRecordType() {
        return SysConfigRecord.class;
    }

    /**
     * The column <code>sys.sys_config.variable</code>.
     */
    public final TableField<SysConfigRecord, String> VARIABLE = createField("variable", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>sys.sys_config.value</code>.
     */
    public final TableField<SysConfigRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>sys.sys_config.set_time</code>.
     */
    public final TableField<SysConfigRecord, Timestamp> SET_TIME = createField("set_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>sys.sys_config.set_by</code>.
     */
    public final TableField<SysConfigRecord, String> SET_BY = createField("set_by", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * Create a <code>sys.sys_config</code> table reference
     */
    public SysConfig() {
        this(DSL.name("sys_config"), null);
    }

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    public SysConfig(String alias) {
        this(DSL.name(alias), SYS_CONFIG);
    }

    /**
     * Create an aliased <code>sys.sys_config</code> table reference
     */
    public SysConfig(Name alias) {
        this(alias, SYS_CONFIG);
    }

    private SysConfig(Name alias, Table<SysConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private SysConfig(Name alias, Table<SysConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SysConfig(Table<O> child, ForeignKey<O, SysConfigRecord> key) {
        super(child, key, SYS_CONFIG);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SysConfigRecord> getPrimaryKey() {
        return Keys.KEY_SYS_CONFIG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SysConfigRecord>> getKeys() {
        return Arrays.<UniqueKey<SysConfigRecord>>asList(Keys.KEY_SYS_CONFIG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfig as(String alias) {
        return new SysConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysConfig as(Name alias) {
        return new SysConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(String name) {
        return new SysConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SysConfig rename(Name name) {
        return new SysConfig(name, null);
    }
}
