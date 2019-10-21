/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.sys.routines;


import com.syntax.sweagleapi.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 * Description
 * -----------
 * 
 * Shows all currently enabled Performance Schema configuration.
 * 
 * Parameters
 * -----------
 * 
 * in_show_instruments (BOOLEAN):
 *   Whether to print enabled instruments (can print many items)
 * 
 * in_show_threads (BOOLEAN):
 *   Whether to print enabled threads
 * 
 * Example
 * -----------
 * 
 * mysql&gt; CALL sys.ps_setup_show_enabled(TRUE, TRUE);
 * +----------------------------+
 * | performance_schema_enabled |
 * +----------------------------+
 * |                          1 |
 * +----------------------------+
 * 1 row in set (0.00 sec)
 * 
 * +---------------+
 * | enabled_users |
 * +---------------+
 * | '%'@'%'       |
 * +---------------+
 * 1 row in set (0.01 sec)
 * 
 * +-------------+---------+---------+-------+
 * | object_type | objects | enabled | timed |
 * +-------------+---------+---------+-------+
 * | EVENT       | %.%     | YES     | YES   |
 * | FUNCTION    | %.%     | YES     | YES   |
 * | PROCEDURE   | %.%     | YES     | YES   |
 * | TABLE       | %.%     | YES     | YES   |
 * | TRIGGER     | %.%     | YES     | YES   |
 * +-------------+---------+---------+-------+
 * 5 rows in set (0.01 sec)
 * 
 * +---------------------------+
 * | enabled_consumers         |
 * +---------------------------+
 * | events_statements_current |
 * | global_instrumentation    |
 * | thread_instrumentation    |
 * | statements_digest         |
 * +---------------------------+
 * 4 rows in set (0.05 sec)
 * 
 * +---------------------------------+-------------+
 * | enabled_threads                 | thread_type |
 * +---------------------------------+-------------+
 * | sql/main                        | BACKGROUND  |
 * | sql/thread_timer_notifier       | BACKGROUND  |
 * | innodb/io_ibuf_thread           | BACKGROUND  |
 * | innodb/io_log_thread            | BACKGROUND  |
 * | innodb/io_read_thread           | BACKGROUND  |
 * | innodb/io_read_thread           | BACKGROUND  |
 * | innodb/io_write_thread          | BACKGROUND  |
 * | innodb/io_write_thread          | BACKGROUND  |
 * | innodb/page_cleaner_thread      | BACKGROUND  |
 * | innodb/srv_lock_timeout_thread  | BACKGROUND  |
 * | innodb/srv_error_monitor_thread | BACKGROUND  |
 * | innodb/srv_monitor_thread       | BACKGROUND  |
 * | innodb/srv_master_thread        | BACKGROUND  |
 * | innodb/srv_purge_thread         | BACKGROUND  |
 * | innodb/srv_worker_thread        | BACKGROUND  |
 * | innodb/srv_worker_thread        | BACKGROUND  |
 * | innodb/srv_worker_thread        | BACKGROUND  |
 * | innodb/buf_dump_thread          | BACKGROUND  |
 * | innodb/dict_stats_thread        | BACKGROUND  |
 * | sql/signal_handler              | BACKGROUND  |
 * | sql/compress_gtid_table         | FOREGROUND  |
 * | root@localhost                  | FOREGROUND  |
 * +---------------------------------+-------------+
 * 22 rows in set (0.01 sec)
 * 
 * +-------------------------------------+-------+
 * | enabled_instruments                 | timed |
 * +-------------------------------------+-------+
 * | wait/io/file/sql/map                | YES   |
 * | wait/io/file/sql/binlog             | YES   |
 * ...
 * | statement/com/Error                 | YES   |
 * | statement/com/                      | YES   |
 * | idle                                | YES   |
 * +-------------------------------------+-------+
 * 210 rows in set (0.08 sec)
 * 
 * Query OK, 0 rows affected (0.89 sec)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsSetupShowEnabled extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1541940132;

    /**
     * The parameter <code>sys.ps_setup_show_enabled.in_show_instruments</code>.
     */
    public static final Parameter<Byte> IN_SHOW_INSTRUMENTS = createParameter("in_show_instruments", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * The parameter <code>sys.ps_setup_show_enabled.in_show_threads</code>.
     */
    public static final Parameter<Byte> IN_SHOW_THREADS = createParameter("in_show_threads", org.jooq.impl.SQLDataType.TINYINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PsSetupShowEnabled() {
        super("ps_setup_show_enabled", Sys.SYS);

        addInParameter(IN_SHOW_INSTRUMENTS);
        addInParameter(IN_SHOW_THREADS);
    }

    /**
     * Set the <code>in_show_instruments</code> parameter IN value to the routine
     */
    public void setInShowInstruments(Byte value) {
        setValue(IN_SHOW_INSTRUMENTS, value);
    }

    /**
     * Set the <code>in_show_threads</code> parameter IN value to the routine
     */
    public void setInShowThreads(Byte value) {
        setValue(IN_SHOW_THREADS, value);
    }
}
