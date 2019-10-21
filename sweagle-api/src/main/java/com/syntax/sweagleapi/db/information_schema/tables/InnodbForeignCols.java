/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables;


import com.syntax.sweagleapi.db.information_schema.InformationSchema;
import com.syntax.sweagleapi.db.information_schema.tables.records.InnodbForeignColsRecord;

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
public class InnodbForeignCols extends TableImpl<InnodbForeignColsRecord> {

    private static final long serialVersionUID = 1180133940;

    /**
     * The reference instance of <code>information_schema.INNODB_FOREIGN_COLS</code>
     */
    public static final InnodbForeignCols INNODB_FOREIGN_COLS = new InnodbForeignCols();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbForeignColsRecord> getRecordType() {
        return InnodbForeignColsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.ID</code>.
     */
    public final TableField<InnodbForeignColsRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.FOR_COL_NAME</code>.
     */
    public final TableField<InnodbForeignColsRecord, String> FOR_COL_NAME = createField("FOR_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.REF_COL_NAME</code>.
     */
    public final TableField<InnodbForeignColsRecord, String> REF_COL_NAME = createField("REF_COL_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN_COLS.POS</code>.
     */
    public final TableField<InnodbForeignColsRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * Create a <code>information_schema.INNODB_FOREIGN_COLS</code> table reference
     */
    public InnodbForeignCols() {
        this(DSL.name("INNODB_FOREIGN_COLS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN_COLS</code> table reference
     */
    public InnodbForeignCols(String alias) {
        this(DSL.name(alias), INNODB_FOREIGN_COLS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN_COLS</code> table reference
     */
    public InnodbForeignCols(Name alias) {
        this(alias, INNODB_FOREIGN_COLS);
    }

    private InnodbForeignCols(Name alias, Table<InnodbForeignColsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbForeignCols(Name alias, Table<InnodbForeignColsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbForeignCols(Table<O> child, ForeignKey<O, InnodbForeignColsRecord> key) {
        super(child, key, INNODB_FOREIGN_COLS);
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
    public InnodbForeignCols as(String alias) {
        return new InnodbForeignCols(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbForeignCols as(Name alias) {
        return new InnodbForeignCols(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeignCols rename(String name) {
        return new InnodbForeignCols(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeignCols rename(Name name) {
        return new InnodbForeignCols(name, null);
    }
}
