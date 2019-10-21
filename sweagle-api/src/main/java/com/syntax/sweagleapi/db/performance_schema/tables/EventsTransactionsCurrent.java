/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables;


import com.syntax.sweagleapi.db.performance_schema.Indexes;
import com.syntax.sweagleapi.db.performance_schema.Keys;
import com.syntax.sweagleapi.db.performance_schema.PerformanceSchema;
import com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentAccessMode;
import com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentAutocommit;
import com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentNestingEventType;
import com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentState;
import com.syntax.sweagleapi.db.performance_schema.tables.records.EventsTransactionsCurrentRecord;

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
public class EventsTransactionsCurrent extends TableImpl<EventsTransactionsCurrentRecord> {

    private static final long serialVersionUID = 1780627971;

    /**
     * The reference instance of <code>performance_schema.events_transactions_current</code>
     */
    public static final EventsTransactionsCurrent EVENTS_TRANSACTIONS_CURRENT = new EventsTransactionsCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsTransactionsCurrentRecord> getRecordType() {
        return EventsTransactionsCurrentRecord.class;
    }

    /**
     * The column <code>performance_schema.events_transactions_current.THREAD_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> EVENT_ID = createField("EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> END_EVENT_ID = createField("END_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.EVENT_NAME</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> EVENT_NAME = createField("EVENT_NAME", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.STATE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentState> STATE = createField("STATE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentState.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TRX_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TRX_ID = createField("TRX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.GTID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> GTID = createField("GTID", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_FORMAT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, Integer> XID_FORMAT_ID = createField("XID_FORMAT_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_GTRID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XID_GTRID = createField("XID_GTRID", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XID_BQUAL</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XID_BQUAL = createField("XID_BQUAL", org.jooq.impl.SQLDataType.VARCHAR(130), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.XA_STATE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> XA_STATE = createField("XA_STATE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.SOURCE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> SOURCE = createField("SOURCE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_START</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_START = createField("TIMER_START", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_END</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_END = createField("TIMER_END", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> TIMER_WAIT = createField("TIMER_WAIT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.ACCESS_MODE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentAccessMode> ACCESS_MODE = createField("ACCESS_MODE", org.jooq.impl.SQLDataType.VARCHAR(10).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentAccessMode.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.ISOLATION_LEVEL</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, String> ISOLATION_LEVEL = createField("ISOLATION_LEVEL", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.AUTOCOMMIT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentAutocommit> AUTOCOMMIT = createField("AUTOCOMMIT", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentAutocommit.class), this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_SAVEPOINTS</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_SAVEPOINTS = createField("NUMBER_OF_SAVEPOINTS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_ROLLBACK_TO_SAVEPOINT = createField("NUMBER_OF_ROLLBACK_TO_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NUMBER_OF_RELEASE_SAVEPOINT = createField("NUMBER_OF_RELEASE_SAVEPOINT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, ULong> NESTING_EVENT_ID = createField("NESTING_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_transactions_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsTransactionsCurrentRecord, EventsTransactionsCurrentNestingEventType> NESTING_EVENT_TYPE = createField("NESTING_EVENT_TYPE", org.jooq.impl.SQLDataType.VARCHAR(11).asEnumDataType(com.syntax.sweagleapi.db.performance_schema.enums.EventsTransactionsCurrentNestingEventType.class), this, "");

    /**
     * Create a <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent() {
        this(DSL.name("events_transactions_current"), null);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent(String alias) {
        this(DSL.name(alias), EVENTS_TRANSACTIONS_CURRENT);
    }

    /**
     * Create an aliased <code>performance_schema.events_transactions_current</code> table reference
     */
    public EventsTransactionsCurrent(Name alias) {
        this(alias, EVENTS_TRANSACTIONS_CURRENT);
    }

    private EventsTransactionsCurrent(Name alias, Table<EventsTransactionsCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsTransactionsCurrent(Name alias, Table<EventsTransactionsCurrentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventsTransactionsCurrent(Table<O> child, ForeignKey<O, EventsTransactionsCurrentRecord> key) {
        super(child, key, EVENTS_TRANSACTIONS_CURRENT);
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
        return Arrays.<Index>asList(Indexes.EVENTS_TRANSACTIONS_CURRENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EventsTransactionsCurrentRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_TRANSACTIONS_CURRENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EventsTransactionsCurrentRecord>> getKeys() {
        return Arrays.<UniqueKey<EventsTransactionsCurrentRecord>>asList(Keys.KEY_EVENTS_TRANSACTIONS_CURRENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsCurrent as(String alias) {
        return new EventsTransactionsCurrent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EventsTransactionsCurrent as(Name alias) {
        return new EventsTransactionsCurrent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsCurrent rename(String name) {
        return new EventsTransactionsCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsTransactionsCurrent rename(Name name) {
        return new EventsTransactionsCurrent(name, null);
    }
}
