/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.routines;


import com.syntax.sweagleapi.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.impl.AbstractRoutine;


/**
 * 
 * Description
 * -----------
 * 
 * Shows all currently disabled instruments.
 * 
 * Parameters
 * -----------
 * 
 * None
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_show_disabled_instruments();
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowDisabledInstruments extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1351124914;

    /**
     * Create a new routine call instance
     */
    public PsSetupShowDisabledInstruments() {
        super("ps_setup_show_disabled_instruments", Sys.SYS);
    }
}
