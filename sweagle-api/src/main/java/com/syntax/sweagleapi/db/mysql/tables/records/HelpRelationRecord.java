/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.mysql.tables.records;


import com.syntax.sweagleapi.db.mysql.tables.HelpRelation;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * keyword-topic relation
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpRelationRecord extends UpdatableRecordImpl<HelpRelationRecord> implements Record2<UInteger, UInteger> {

    private static final long serialVersionUID = 597919791;

    /**
     * Setter for <code>mysql.help_relation.help_topic_id</code>.
     */
    public void setHelpTopicId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql.help_relation.help_topic_id</code>.
     */
    public UInteger getHelpTopicId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.help_relation.help_keyword_id</code>.
     */
    public void setHelpKeywordId(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql.help_relation.help_keyword_id</code>.
     */
    public UInteger getHelpKeywordId() {
        return (UInteger) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<UInteger, UInteger> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, UInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, UInteger> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return HelpRelation.HELP_RELATION.HELP_TOPIC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return HelpRelation.HELP_RELATION.HELP_KEYWORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getHelpTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component2() {
        return getHelpKeywordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getHelpTopicId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getHelpKeywordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpRelationRecord value1(UInteger value) {
        setHelpTopicId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpRelationRecord value2(UInteger value) {
        setHelpKeywordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HelpRelationRecord values(UInteger value1, UInteger value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelpRelationRecord
     */
    public HelpRelationRecord() {
        super(HelpRelation.HELP_RELATION);
    }

    /**
     * Create a detached, initialised HelpRelationRecord
     */
    public HelpRelationRecord(UInteger helpTopicId, UInteger helpKeywordId) {
        super(HelpRelation.HELP_RELATION);

        set(0, helpTopicId);
        set(1, helpKeywordId);
    }
}
