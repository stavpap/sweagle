/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables;


import com.syntax.sweagleapi.db.performance_schema.Indexes;
import com.syntax.sweagleapi.db.performance_schema.Keys;
import com.syntax.sweagleapi.db.performance_schema.PerformanceSchema;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsEnabled;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsObjectType;
import com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsTimed;
import com.syntax.sweagleapi.db.performance_schema.tables.records.SetupObjectsRecord;

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
public class SetupObjects extends TableImpl<SetupObjectsRecord> {

    private static final long serialVersionUID = 2050549580;

    /**
     * The reference instance of <code>performance_schema.setup_objects</code>
     */
    public static final SetupObjects SETUP_OBJECTS = new SetupObjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupObjectsRecord> getRecordType() {
        return SetupObjectsRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_TYPE</code>.
     */
    public final TableField<SetupObjectsRecord, SetupObjectsObjectType> OBJECT_TYPE = createField("OBJECT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false).defaultValue(org.jooq.impl.DSL.inline("TABLE", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsObjectType.class), this, "");

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_SCHEMA</code>.
     */
    public final TableField<SetupObjectsRecord, String> OBJECT_SCHEMA = createField("OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).defaultValue(org.jooq.impl.DSL.inline("%", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_objects.OBJECT_NAME</code>.
     */
    public final TableField<SetupObjectsRecord, String> OBJECT_NAME = createField("OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false).defaultValue(org.jooq.impl.DSL.inline("%", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>performance_schema.setup_objects.ENABLED</code>.
     */
    public final TableField<SetupObjectsRecord, SetupObjectsEnabled> ENABLED = createField("ENABLED", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("YES", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsEnabled.class), this, "");

    /**
     * The column <code>performance_schema.setup_objects.TIMED</code>.
     */
    public final TableField<SetupObjectsRecord, SetupObjectsTimed> TIMED = createField("TIMED", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("YES", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.SetupObjectsTimed.class), this, "");

    /**
     * Create a <code>performance_schema.setup_objects</code> table reference
     */
    public SetupObjects() {
        this(DSL.name("setup_objects"), null);
    }

    /**
     * Create an aliased <code>performance_schema.setup_objects</code> table reference
     */
    public SetupObjects(String alias) {
        this(DSL.name(alias), SETUP_OBJECTS);
    }

    /**
     * Create an aliased <code>performance_schema.setup_objects</code> table reference
     */
    public SetupObjects(Name alias) {
        this(alias, SETUP_OBJECTS);
    }

    private SetupObjects(Name alias, Table<SetupObjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupObjects(Name alias, Table<SetupObjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SetupObjects(Table<O> child, ForeignKey<O, SetupObjectsRecord> key) {
        super(child, key, SETUP_OBJECTS);
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
        return Arrays.<Index>asList(Indexes.SETUP_OBJECTS_OBJECT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SetupObjectsRecord>> getKeys() {
        return Arrays.<UniqueKey<SetupObjectsRecord>>asList(Keys.KEY_SETUP_OBJECTS_OBJECT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjects as(String alias) {
        return new SetupObjects(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SetupObjects as(Name alias) {
        return new SetupObjects(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupObjects rename(String name) {
        return new SetupObjects(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupObjects rename(Name name) {
        return new SetupObjects(name, null);
    }
}
