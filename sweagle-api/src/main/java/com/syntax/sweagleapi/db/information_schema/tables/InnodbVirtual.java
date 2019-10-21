/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables;


import com.syntax.sweagleapi.db.information_schema.InformationSchema;
import com.syntax.sweagleapi.db.information_schema.tables.records.InnodbVirtualRecord;

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
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class InnodbVirtual extends TableImpl<InnodbVirtualRecord> {

    private static final long serialVersionUID = 187138510;

    /**
     * The reference instance of <code>information_schema.INNODB_VIRTUAL</code>
     */
    public static final InnodbVirtual INNODB_VIRTUAL = new InnodbVirtual();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbVirtualRecord> getRecordType() {
        return InnodbVirtualRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.TABLE_ID</code>.
     */
    public final TableField<InnodbVirtualRecord, ULong> TABLE_ID = createField("TABLE_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.POS</code>.
     */
    public final TableField<InnodbVirtualRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_VIRTUAL.BASE_POS</code>.
     */
    public final TableField<InnodbVirtualRecord, UInteger> BASE_POS = createField("BASE_POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_VIRTUAL</code> table reference
     */
    public InnodbVirtual() {
        this(DSL.name("INNODB_VIRTUAL"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table reference
     */
    public InnodbVirtual(String alias) {
        this(DSL.name(alias), INNODB_VIRTUAL);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_VIRTUAL</code> table reference
     */
    public InnodbVirtual(Name alias) {
        this(alias, INNODB_VIRTUAL);
    }

    private InnodbVirtual(Name alias, Table<InnodbVirtualRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbVirtual(Name alias, Table<InnodbVirtualRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbVirtual(Table<O> child, ForeignKey<O, InnodbVirtualRecord> key) {
        super(child, key, INNODB_VIRTUAL);
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
    public InnodbVirtual as(String alias) {
        return new InnodbVirtual(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbVirtual as(Name alias) {
        return new InnodbVirtual(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbVirtual rename(String name) {
        return new InnodbVirtual(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbVirtual rename(Name name) {
        return new InnodbVirtual(name, null);
    }
}
