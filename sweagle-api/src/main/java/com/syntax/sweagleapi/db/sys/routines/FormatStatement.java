/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.routines;


import com.syntax.sweagleapi.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 * Description
 * -----------
 * 
 * Formats a normalized statement, truncating it if it is &gt; 64 characters 
 * long by default.
 * 
 * To configure the length to truncate the statement to by default, update 
 * the `statement_truncate_len`
 * variable with `sys_config` table to a different value. Alternatively, to 
 * change it just for just 
 * your particular session, use `SET @sys.statement_truncate_len := &lt;some 
 * new value&gt;`.
 * 
 * Useful for printing statement related data from Performance Schema from 
 * 
 * the command line.
 * 
 * Parameters
 * -----------
 * 
 * statement (LONGTEXT): 
 *   The statement to format.
 * 
 * Returns
 * -----------
 * 
 * LONGTEXT
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT sys.format_statement(digest_text)
 *     -&gt;   FROM performance_schema.events_statements_summary_by_digest
 *     -&gt;  ORDER by sum_timer_wait DESC limit 5;
 * +-------------------------------------------------------------------+
 * | sys.format_statement(digest_text)                                 |
 * +-------------------------------------------------------------------+
 * | CREATE SQL SECURITY INVOKER VI ... KE ? AND `variable_value` &gt; ?  
 * |
 * | CREATE SQL SECURITY INVOKER VI ... ait` IS NOT NULL , `esc` . ... |
 * | CREATE SQL SECURITY INVOKER VI ... ait` IS NOT NULL , `sys` . ... |
 * | CREATE SQL SECURITY INVOKER VI ...  , `compressed_size` ) ) DESC  |
 * | CREATE SQL SECURITY INVOKER VI ... LIKE ? ORDER BY `timer_start`  |
 * +-------------------------------------------------------------------+
 * 5 rows in set (0.00 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FormatStatement extends AbstractRoutine<String> {

    private static final long serialVersionUID = -1573522906;

    /**
     * The parameter <code>sys.format_statement.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>sys.format_statement.statement</code>.
     */
    public static final Parameter<String> STATEMENT = createParameter("statement", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public FormatStatement() {
        super("format_statement", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(STATEMENT);
    }

    /**
     * Set the <code>statement</code> parameter IN value to the routine
     */
    public void setStatement(String value) {
        setValue(STATEMENT, value);
    }

    /**
     * Set the <code>statement</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setStatement(Field<String> field) {
        setField(STATEMENT, field);
    }
}
