/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum EventsIntervalField implements EnumType {

    YEAR("YEAR"),

    QUARTER("QUARTER"),

    MONTH("MONTH"),

    DAY("DAY"),

    HOUR("HOUR"),

    MINUTE("MINUTE"),

    WEEK("WEEK"),

    SECOND("SECOND"),

    MICROSECOND("MICROSECOND"),

    YEAR_MONTH("YEAR_MONTH"),

    DAY_HOUR("DAY_HOUR"),

    DAY_MINUTE("DAY_MINUTE"),

    DAY_SECOND("DAY_SECOND"),

    HOUR_MINUTE("HOUR_MINUTE"),

    HOUR_SECOND("HOUR_SECOND"),

    MINUTE_SECOND("MINUTE_SECOND"),

    DAY_MICROSECOND("DAY_MICROSECOND"),

    HOUR_MICROSECOND("HOUR_MICROSECOND"),

    MINUTE_MICROSECOND("MINUTE_MICROSECOND"),

    SECOND_MICROSECOND("SECOND_MICROSECOND");

    private final String literal;

    private EventsIntervalField(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "EVENTS_INTERVAL_FIELD";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
