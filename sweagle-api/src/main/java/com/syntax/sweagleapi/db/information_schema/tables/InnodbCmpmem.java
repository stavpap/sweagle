/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables;


import com.syntax.sweagleapi.db.information_schema.InformationSchema;
import com.syntax.sweagleapi.db.information_schema.tables.records.InnodbCmpmemRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class InnodbCmpmem extends TableImpl<InnodbCmpmemRecord> {

    private static final long serialVersionUID = -619115901;

    /**
     * The reference instance of <code>information_schema.INNODB_CMPMEM</code>
     */
    public static final InnodbCmpmem INNODB_CMPMEM = new InnodbCmpmem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCmpmemRecord> getRecordType() {
        return InnodbCmpmemRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_CMPMEM.page_size</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGE_SIZE = createField("page_size", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.buffer_pool_instance</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> BUFFER_POOL_INSTANCE = createField("buffer_pool_instance", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_used</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_USED = createField("pages_used", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.pages_free</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> PAGES_FREE = createField("pages_free", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_ops</code>.
     */
    public final TableField<InnodbCmpmemRecord, Long> RELOCATION_OPS = createField("relocation_ops", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_CMPMEM.relocation_time</code>.
     */
    public final TableField<InnodbCmpmemRecord, Integer> RELOCATION_TIME = createField("relocation_time", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public InnodbCmpmem() {
        this(DSL.name("INNODB_CMPMEM"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public InnodbCmpmem(String alias) {
        this(DSL.name(alias), INNODB_CMPMEM);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CMPMEM</code> table reference
     */
    public InnodbCmpmem(Name alias) {
        this(alias, INNODB_CMPMEM);
    }

    private InnodbCmpmem(Name alias, Table<InnodbCmpmemRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCmpmem(Name alias, Table<InnodbCmpmemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbCmpmem(Table<O> child, ForeignKey<O, InnodbCmpmemRecord> key) {
        super(child, key, INNODB_CMPMEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmem as(String alias) {
        return new InnodbCmpmem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbCmpmem as(Name alias) {
        return new InnodbCmpmem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmem rename(String name) {
        return new InnodbCmpmem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCmpmem rename(Name name) {
        return new InnodbCmpmem(name, null);
    }
}
