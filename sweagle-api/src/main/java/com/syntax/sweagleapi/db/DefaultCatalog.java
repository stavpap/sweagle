/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db;


import com.syntax.sweagleapi.db.information_schema.InformationSchema;
import com.syntax.sweagleapi.db.mysql.Mysql;
import com.syntax.sweagleapi.db.performance_schema.PerformanceSchema;
import com.syntax.sweagleapi.db.sweagle.Sweagle;
import com.syntax.sweagleapi.db.sys.Sys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1790610230;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>mysql</code>.
     */
    public final Mysql MYSQL = com.syntax.sweagleapi.db.mysql.Mysql.MYSQL;

    /**
     * The schema <code>information_schema</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = com.syntax.sweagleapi.db.information_schema.InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>performance_schema</code>.
     */
    public final PerformanceSchema PERFORMANCE_SCHEMA = com.syntax.sweagleapi.db.performance_schema.PerformanceSchema.PERFORMANCE_SCHEMA;

    /**
     * The schema <code>sys</code>.
     */
    public final Sys SYS = com.syntax.sweagleapi.db.sys.Sys.SYS;

    /**
     * The schema <code>sweagle</code>.
     */
    public final Sweagle SWEAGLE = com.syntax.sweagleapi.db.sweagle.Sweagle.SWEAGLE;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            Mysql.MYSQL,
            InformationSchema.INFORMATION_SCHEMA,
            PerformanceSchema.PERFORMANCE_SCHEMA,
            Sys.SYS,
            Sweagle.SWEAGLE);
    }
}
