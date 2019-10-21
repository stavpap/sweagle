/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys;


import com.syntax.sweagleapi.db.sys.tables.SysConfig;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>sys</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index SYS_CONFIG_PRIMARY = Indexes0.SYS_CONFIG_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index SYS_CONFIG_PRIMARY = Internal.createIndex("PRIMARY", SysConfig.SYS_CONFIG, new OrderField[] { SysConfig.SYS_CONFIG.VARIABLE }, true);
    }
}
