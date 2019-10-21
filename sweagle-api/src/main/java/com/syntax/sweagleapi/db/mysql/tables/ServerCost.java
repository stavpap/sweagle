/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.mysql.tables;


import com.syntax.sweagleapi.db.mysql.Indexes;
import com.syntax.sweagleapi.db.mysql.Keys;
import com.syntax.sweagleapi.db.mysql.Mysql;
import com.syntax.sweagleapi.db.mysql.tables.records.ServerCostRecord;

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
public class ServerCost extends TableImpl<ServerCostRecord> {

    private static final long serialVersionUID = -1414400493;

    /**
     * The reference instance of <code>mysql.server_cost</code>
     */
    public static final ServerCost SERVER_COST = new ServerCost();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ServerCostRecord> getRecordType() {
        return ServerCostRecord.class;
    }

    /**
     * The column <code>mysql.server_cost.cost_name</code>.
     */
    public final TableField<ServerCostRecord, String> COST_NAME = createField("cost_name", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>mysql.server_cost.cost_value</code>.
     */
    public final TableField<ServerCostRecord, Double> COST_VALUE = createField("cost_value", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>mysql.server_cost.last_update</code>.
     */
    public final TableField<ServerCostRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>mysql.server_cost.comment</code>.
     */
    public final TableField<ServerCostRecord, String> COMMENT = createField("comment", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column <code>mysql.server_cost.default_value</code>.
     */
    public final TableField<ServerCostRecord, Double> DEFAULT_VALUE = createField("default_value", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>mysql.server_cost</code> table reference
     */
    public ServerCost() {
        this(DSL.name("server_cost"), null);
    }

    /**
     * Create an aliased <code>mysql.server_cost</code> table reference
     */
    public ServerCost(String alias) {
        this(DSL.name(alias), SERVER_COST);
    }

    /**
     * Create an aliased <code>mysql.server_cost</code> table reference
     */
    public ServerCost(Name alias) {
        this(alias, SERVER_COST);
    }

    private ServerCost(Name alias, Table<ServerCostRecord> aliased) {
        this(alias, aliased, null);
    }

    private ServerCost(Name alias, Table<ServerCostRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ServerCost(Table<O> child, ForeignKey<O, ServerCostRecord> key) {
        super(child, key, SERVER_COST);
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
        return Arrays.<Index>asList(Indexes.SERVER_COST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ServerCostRecord> getPrimaryKey() {
        return Keys.KEY_SERVER_COST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ServerCostRecord>> getKeys() {
        return Arrays.<UniqueKey<ServerCostRecord>>asList(Keys.KEY_SERVER_COST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerCost as(String alias) {
        return new ServerCost(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServerCost as(Name alias) {
        return new ServerCost(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ServerCost rename(String name) {
        return new ServerCost(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ServerCost rename(Name name) {
        return new ServerCost(name, null);
    }
}
