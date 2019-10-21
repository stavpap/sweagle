/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.routines;


import com.syntax.sweagleapi.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.types.ULong;


/**
 * 
 * Description
 * -----------
 * 
 * Return the Performance Schema THREAD_ID for the specified connection ID.
 * 
 * Parameters
 * -----------
 * 
 * in_connection_id (BIGINT UNSIGNED):
 *   The id of the connection to return the thread id for. If NULL, the current
 *   connection thread id is returned.
 * 
 * Example
 * -----------
 * 
 * mysql&gt; SELECT sys.ps_thread_id(79);
 * +----------------------+
 * | sys.ps_thread_id(79) |
 * +----------------------+
 * |                   98 |
 * +----------------------+
 * 1 row in set (0.00 sec)
 * 
 * mysql&gt; SELECT sys.ps_thread_id(CONNECTION_ID());
 * +-----------------------------------+
 * | sys.ps_thread_id(CONNECTION_ID()) |
 * +-----------------------------------+
 * |                                98 |
 * +-----------------------------------+
 * 1 row in set (0.00 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsThreadId extends AbstractRoutine<ULong> {

    private static final long serialVersionUID = -103114406;

    /**
     * The parameter <code>sys.ps_thread_id.RETURN_VALUE</code>.
     */
    public static final Parameter<ULong> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, false, false);

    /**
     * The parameter <code>sys.ps_thread_id.in_connection_id</code>.
     */
    public static final Parameter<ULong> IN_CONNECTION_ID = createParameter("in_connection_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, false, false);

    /**
     * Create a new routine call instance
     */
    public PsThreadId() {
        super("ps_thread_id", Sys.SYS, org.jooq.impl.SQLDataType.BIGINTUNSIGNED);

        setReturnParameter(RETURN_VALUE);
        addInParameter(IN_CONNECTION_ID);
    }

    /**
     * Set the <code>in_connection_id</code> parameter IN value to the routine
     */
    public void setInConnectionId(ULong value) {
        setValue(IN_CONNECTION_ID, value);
    }

    /**
     * Set the <code>in_connection_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setInConnectionId(Field<ULong> field) {
        setField(IN_CONNECTION_ID, field);
    }
}
