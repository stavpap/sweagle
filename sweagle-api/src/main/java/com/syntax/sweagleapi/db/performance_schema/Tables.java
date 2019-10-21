/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema;


import com.syntax.sweagleapi.db.performance_schema.tables.Accounts;
import com.syntax.sweagleapi.db.performance_schema.tables.CondInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.DataLockWaits;
import com.syntax.sweagleapi.db.performance_schema.tables.DataLocks;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByAccountByError;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByHostByError;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByThreadByError;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByUserByError;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryGlobalByError;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesCurrent;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesHistory;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesHistoryLong;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByAccountByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByHostByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByThreadByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByUserByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryGlobalByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsCurrent;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistogramByDigest;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistogramGlobal;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistory;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistoryLong;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByAccountByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByDigest;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByHostByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByProgram;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByThreadByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByUserByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsCurrent;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsHistory;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsHistoryLong;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByHostByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsCurrent;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsHistory;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsHistoryLong;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByAccountByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByHostByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByInstance;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByThreadByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByUserByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryGlobalByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.FileInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.FileSummaryByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.FileSummaryByInstance;
import com.syntax.sweagleapi.db.performance_schema.tables.GlobalStatus;
import com.syntax.sweagleapi.db.performance_schema.tables.GlobalVariables;
import com.syntax.sweagleapi.db.performance_schema.tables.HostCache;
import com.syntax.sweagleapi.db.performance_schema.tables.Hosts;
import com.syntax.sweagleapi.db.performance_schema.tables.KeyringKeys;
import com.syntax.sweagleapi.db.performance_schema.tables.LogStatus;
import com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByAccountByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByHostByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByThreadByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByUserByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryGlobalByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.MetadataLocks;
import com.syntax.sweagleapi.db.performance_schema.tables.MutexInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.ObjectsSummaryGlobalByType;
import com.syntax.sweagleapi.db.performance_schema.tables.PerformanceTimers;
import com.syntax.sweagleapi.db.performance_schema.tables.PersistedVariables;
import com.syntax.sweagleapi.db.performance_schema.tables.PreparedStatementsInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierConfiguration;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierFilters;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierGlobalFilters;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatus;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatusByCoordinator;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatusByWorker;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationConnectionConfiguration;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationConnectionStatus;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationGroupMemberStats;
import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationGroupMembers;
import com.syntax.sweagleapi.db.performance_schema.tables.RwlockInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.SessionAccountConnectAttrs;
import com.syntax.sweagleapi.db.performance_schema.tables.SessionConnectAttrs;
import com.syntax.sweagleapi.db.performance_schema.tables.SessionStatus;
import com.syntax.sweagleapi.db.performance_schema.tables.SessionVariables;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupActors;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupConsumers;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupInstruments;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupObjects;
import com.syntax.sweagleapi.db.performance_schema.tables.SetupThreads;
import com.syntax.sweagleapi.db.performance_schema.tables.SocketInstances;
import com.syntax.sweagleapi.db.performance_schema.tables.SocketSummaryByEventName;
import com.syntax.sweagleapi.db.performance_schema.tables.SocketSummaryByInstance;
import com.syntax.sweagleapi.db.performance_schema.tables.StatusByAccount;
import com.syntax.sweagleapi.db.performance_schema.tables.StatusByHost;
import com.syntax.sweagleapi.db.performance_schema.tables.StatusByThread;
import com.syntax.sweagleapi.db.performance_schema.tables.StatusByUser;
import com.syntax.sweagleapi.db.performance_schema.tables.TableHandles;
import com.syntax.sweagleapi.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage;
import com.syntax.sweagleapi.db.performance_schema.tables.TableIoWaitsSummaryByTable;
import com.syntax.sweagleapi.db.performance_schema.tables.TableLockWaitsSummaryByTable;
import com.syntax.sweagleapi.db.performance_schema.tables.Threads;
import com.syntax.sweagleapi.db.performance_schema.tables.UserDefinedFunctions;
import com.syntax.sweagleapi.db.performance_schema.tables.UserVariablesByThread;
import com.syntax.sweagleapi.db.performance_schema.tables.Users;
import com.syntax.sweagleapi.db.performance_schema.tables.VariablesByThread;
import com.syntax.sweagleapi.db.performance_schema.tables.VariablesInfo;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in performance_schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>performance_schema.accounts</code>.
     */
    public static final Accounts ACCOUNTS = com.syntax.sweagleapi.db.performance_schema.tables.Accounts.ACCOUNTS;

    /**
     * The table <code>performance_schema.cond_instances</code>.
     */
    public static final CondInstances COND_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.CondInstances.COND_INSTANCES;

    /**
     * The table <code>performance_schema.data_lock_waits</code>.
     */
    public static final DataLockWaits DATA_LOCK_WAITS = com.syntax.sweagleapi.db.performance_schema.tables.DataLockWaits.DATA_LOCK_WAITS;

    /**
     * The table <code>performance_schema.data_locks</code>.
     */
    public static final DataLocks DATA_LOCKS = com.syntax.sweagleapi.db.performance_schema.tables.DataLocks.DATA_LOCKS;

    /**
     * The table <code>performance_schema.events_errors_summary_by_account_by_error</code>.
     */
    public static final EventsErrorsSummaryByAccountByError EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR = com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByAccountByError.EVENTS_ERRORS_SUMMARY_BY_ACCOUNT_BY_ERROR;

    /**
     * The table <code>performance_schema.events_errors_summary_by_host_by_error</code>.
     */
    public static final EventsErrorsSummaryByHostByError EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR = com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByHostByError.EVENTS_ERRORS_SUMMARY_BY_HOST_BY_ERROR;

    /**
     * The table <code>performance_schema.events_errors_summary_by_thread_by_error</code>.
     */
    public static final EventsErrorsSummaryByThreadByError EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR = com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByThreadByError.EVENTS_ERRORS_SUMMARY_BY_THREAD_BY_ERROR;

    /**
     * The table <code>performance_schema.events_errors_summary_by_user_by_error</code>.
     */
    public static final EventsErrorsSummaryByUserByError EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR = com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryByUserByError.EVENTS_ERRORS_SUMMARY_BY_USER_BY_ERROR;

    /**
     * The table <code>performance_schema.events_errors_summary_global_by_error</code>.
     */
    public static final EventsErrorsSummaryGlobalByError EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR = com.syntax.sweagleapi.db.performance_schema.tables.EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR;

    /**
     * The table <code>performance_schema.events_stages_current</code>.
     */
    public static final EventsStagesCurrent EVENTS_STAGES_CURRENT = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesCurrent.EVENTS_STAGES_CURRENT;

    /**
     * The table <code>performance_schema.events_stages_history</code>.
     */
    public static final EventsStagesHistory EVENTS_STAGES_HISTORY = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesHistory.EVENTS_STAGES_HISTORY;

    /**
     * The table <code>performance_schema.events_stages_history_long</code>.
     */
    public static final EventsStagesHistoryLong EVENTS_STAGES_HISTORY_LONG = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesHistoryLong.EVENTS_STAGES_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_stages_summary_by_account_by_event_name</code>.
     */
    public static final EventsStagesSummaryByAccountByEventName EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByAccountByEventName.EVENTS_STAGES_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_host_by_event_name</code>.
     */
    public static final EventsStagesSummaryByHostByEventName EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByHostByEventName.EVENTS_STAGES_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStagesSummaryByThreadByEventName EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByThreadByEventName.EVENTS_STAGES_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_by_user_by_event_name</code>.
     */
    public static final EventsStagesSummaryByUserByEventName EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryByUserByEventName.EVENTS_STAGES_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_stages_summary_global_by_event_name</code>.
     */
    public static final EventsStagesSummaryGlobalByEventName EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStagesSummaryGlobalByEventName.EVENTS_STAGES_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_current</code>.
     */
    public static final EventsStatementsCurrent EVENTS_STATEMENTS_CURRENT = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsCurrent.EVENTS_STATEMENTS_CURRENT;

    /**
     * The table <code>performance_schema.events_statements_histogram_by_digest</code>.
     */
    public static final EventsStatementsHistogramByDigest EVENTS_STATEMENTS_HISTOGRAM_BY_DIGEST = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistogramByDigest.EVENTS_STATEMENTS_HISTOGRAM_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_histogram_global</code>.
     */
    public static final EventsStatementsHistogramGlobal EVENTS_STATEMENTS_HISTOGRAM_GLOBAL = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistogramGlobal.EVENTS_STATEMENTS_HISTOGRAM_GLOBAL;

    /**
     * The table <code>performance_schema.events_statements_history</code>.
     */
    public static final EventsStatementsHistory EVENTS_STATEMENTS_HISTORY = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistory.EVENTS_STATEMENTS_HISTORY;

    /**
     * The table <code>performance_schema.events_statements_history_long</code>.
     */
    public static final EventsStatementsHistoryLong EVENTS_STATEMENTS_HISTORY_LONG = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsHistoryLong.EVENTS_STATEMENTS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_statements_summary_by_account_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByAccountByEventName EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByAccountByEventName.EVENTS_STATEMENTS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_digest</code>.
     */
    public static final EventsStatementsSummaryByDigest EVENTS_STATEMENTS_SUMMARY_BY_DIGEST = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByDigest.EVENTS_STATEMENTS_SUMMARY_BY_DIGEST;

    /**
     * The table <code>performance_schema.events_statements_summary_by_host_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByHostByEventName EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByHostByEventName.EVENTS_STATEMENTS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_program</code>.
     */
    public static final EventsStatementsSummaryByProgram EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByProgram.EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM;

    /**
     * The table <code>performance_schema.events_statements_summary_by_thread_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByThreadByEventName EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByThreadByEventName.EVENTS_STATEMENTS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_by_user_by_event_name</code>.
     */
    public static final EventsStatementsSummaryByUserByEventName EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryByUserByEventName.EVENTS_STATEMENTS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_statements_summary_global_by_event_name</code>.
     */
    public static final EventsStatementsSummaryGlobalByEventName EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsStatementsSummaryGlobalByEventName.EVENTS_STATEMENTS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_current</code>.
     */
    public static final EventsTransactionsCurrent EVENTS_TRANSACTIONS_CURRENT = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT;

    /**
     * The table <code>performance_schema.events_transactions_history</code>.
     */
    public static final EventsTransactionsHistory EVENTS_TRANSACTIONS_HISTORY = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsHistory.EVENTS_TRANSACTIONS_HISTORY;

    /**
     * The table <code>performance_schema.events_transactions_history_long</code>.
     */
    public static final EventsTransactionsHistoryLong EVENTS_TRANSACTIONS_HISTORY_LONG = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_account_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByAccountByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByAccountByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_host_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByHostByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByHostByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_thread_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByThreadByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByThreadByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_by_user_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryByUserByEventName EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryByUserByEventName.EVENTS_TRANSACTIONS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_transactions_summary_global_by_event_name</code>.
     */
    public static final EventsTransactionsSummaryGlobalByEventName EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsTransactionsSummaryGlobalByEventName.EVENTS_TRANSACTIONS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_current</code>.
     */
    public static final EventsWaitsCurrent EVENTS_WAITS_CURRENT = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsCurrent.EVENTS_WAITS_CURRENT;

    /**
     * The table <code>performance_schema.events_waits_history</code>.
     */
    public static final EventsWaitsHistory EVENTS_WAITS_HISTORY = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsHistory.EVENTS_WAITS_HISTORY;

    /**
     * The table <code>performance_schema.events_waits_history_long</code>.
     */
    public static final EventsWaitsHistoryLong EVENTS_WAITS_HISTORY_LONG = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsHistoryLong.EVENTS_WAITS_HISTORY_LONG;

    /**
     * The table <code>performance_schema.events_waits_summary_by_account_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByAccountByEventName EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByAccountByEventName.EVENTS_WAITS_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_host_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByHostByEventName EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByHostByEventName.EVENTS_WAITS_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_instance</code>.
     */
    public static final EventsWaitsSummaryByInstance EVENTS_WAITS_SUMMARY_BY_INSTANCE = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByInstance.EVENTS_WAITS_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.events_waits_summary_by_thread_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByThreadByEventName EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByThreadByEventName.EVENTS_WAITS_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_by_user_by_event_name</code>.
     */
    public static final EventsWaitsSummaryByUserByEventName EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryByUserByEventName.EVENTS_WAITS_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.events_waits_summary_global_by_event_name</code>.
     */
    public static final EventsWaitsSummaryGlobalByEventName EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.EventsWaitsSummaryGlobalByEventName.EVENTS_WAITS_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_instances</code>.
     */
    public static final FileInstances FILE_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.FileInstances.FILE_INSTANCES;

    /**
     * The table <code>performance_schema.file_summary_by_event_name</code>.
     */
    public static final FileSummaryByEventName FILE_SUMMARY_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.FileSummaryByEventName.FILE_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.file_summary_by_instance</code>.
     */
    public static final FileSummaryByInstance FILE_SUMMARY_BY_INSTANCE = com.syntax.sweagleapi.db.performance_schema.tables.FileSummaryByInstance.FILE_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.global_status</code>.
     */
    public static final GlobalStatus GLOBAL_STATUS = com.syntax.sweagleapi.db.performance_schema.tables.GlobalStatus.GLOBAL_STATUS;

    /**
     * The table <code>performance_schema.global_variables</code>.
     */
    public static final GlobalVariables GLOBAL_VARIABLES = com.syntax.sweagleapi.db.performance_schema.tables.GlobalVariables.GLOBAL_VARIABLES;

    /**
     * The table <code>performance_schema.host_cache</code>.
     */
    public static final HostCache HOST_CACHE = com.syntax.sweagleapi.db.performance_schema.tables.HostCache.HOST_CACHE;

    /**
     * The table <code>performance_schema.hosts</code>.
     */
    public static final Hosts HOSTS = com.syntax.sweagleapi.db.performance_schema.tables.Hosts.HOSTS;

    /**
     * The table <code>performance_schema.keyring_keys</code>.
     */
    public static final KeyringKeys KEYRING_KEYS = com.syntax.sweagleapi.db.performance_schema.tables.KeyringKeys.KEYRING_KEYS;

    /**
     * The table <code>performance_schema.log_status</code>.
     */
    public static final LogStatus LOG_STATUS = com.syntax.sweagleapi.db.performance_schema.tables.LogStatus.LOG_STATUS;

    /**
     * The table <code>performance_schema.memory_summary_by_account_by_event_name</code>.
     */
    public static final MemorySummaryByAccountByEventName MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByAccountByEventName.MEMORY_SUMMARY_BY_ACCOUNT_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_host_by_event_name</code>.
     */
    public static final MemorySummaryByHostByEventName MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByHostByEventName.MEMORY_SUMMARY_BY_HOST_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_thread_by_event_name</code>.
     */
    public static final MemorySummaryByThreadByEventName MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByThreadByEventName.MEMORY_SUMMARY_BY_THREAD_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_by_user_by_event_name</code>.
     */
    public static final MemorySummaryByUserByEventName MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryByUserByEventName.MEMORY_SUMMARY_BY_USER_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.memory_summary_global_by_event_name</code>.
     */
    public static final MemorySummaryGlobalByEventName MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.MemorySummaryGlobalByEventName.MEMORY_SUMMARY_GLOBAL_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.metadata_locks</code>.
     */
    public static final MetadataLocks METADATA_LOCKS = com.syntax.sweagleapi.db.performance_schema.tables.MetadataLocks.METADATA_LOCKS;

    /**
     * The table <code>performance_schema.mutex_instances</code>.
     */
    public static final MutexInstances MUTEX_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.MutexInstances.MUTEX_INSTANCES;

    /**
     * The table <code>performance_schema.objects_summary_global_by_type</code>.
     */
    public static final ObjectsSummaryGlobalByType OBJECTS_SUMMARY_GLOBAL_BY_TYPE = com.syntax.sweagleapi.db.performance_schema.tables.ObjectsSummaryGlobalByType.OBJECTS_SUMMARY_GLOBAL_BY_TYPE;

    /**
     * The table <code>performance_schema.performance_timers</code>.
     */
    public static final PerformanceTimers PERFORMANCE_TIMERS = com.syntax.sweagleapi.db.performance_schema.tables.PerformanceTimers.PERFORMANCE_TIMERS;

    /**
     * The table <code>performance_schema.persisted_variables</code>.
     */
    public static final PersistedVariables PERSISTED_VARIABLES = com.syntax.sweagleapi.db.performance_schema.tables.PersistedVariables.PERSISTED_VARIABLES;

    /**
     * The table <code>performance_schema.prepared_statements_instances</code>.
     */
    public static final PreparedStatementsInstances PREPARED_STATEMENTS_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.PreparedStatementsInstances.PREPARED_STATEMENTS_INSTANCES;

    /**
     * The table <code>performance_schema.replication_applier_configuration</code>.
     */
    public static final ReplicationApplierConfiguration REPLICATION_APPLIER_CONFIGURATION = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierConfiguration.REPLICATION_APPLIER_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_applier_filters</code>.
     */
    public static final ReplicationApplierFilters REPLICATION_APPLIER_FILTERS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierFilters.REPLICATION_APPLIER_FILTERS;

    /**
     * The table <code>performance_schema.replication_applier_global_filters</code>.
     */
    public static final ReplicationApplierGlobalFilters REPLICATION_APPLIER_GLOBAL_FILTERS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierGlobalFilters.REPLICATION_APPLIER_GLOBAL_FILTERS;

    /**
     * The table <code>performance_schema.replication_applier_status</code>.
     */
    public static final ReplicationApplierStatus REPLICATION_APPLIER_STATUS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatus.REPLICATION_APPLIER_STATUS;

    /**
     * The table <code>performance_schema.replication_applier_status_by_coordinator</code>.
     */
    public static final ReplicationApplierStatusByCoordinator REPLICATION_APPLIER_STATUS_BY_COORDINATOR = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatusByCoordinator.REPLICATION_APPLIER_STATUS_BY_COORDINATOR;

    /**
     * The table <code>performance_schema.replication_applier_status_by_worker</code>.
     */
    public static final ReplicationApplierStatusByWorker REPLICATION_APPLIER_STATUS_BY_WORKER = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationApplierStatusByWorker.REPLICATION_APPLIER_STATUS_BY_WORKER;

    /**
     * The table <code>performance_schema.replication_connection_configuration</code>.
     */
    public static final ReplicationConnectionConfiguration REPLICATION_CONNECTION_CONFIGURATION = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationConnectionConfiguration.REPLICATION_CONNECTION_CONFIGURATION;

    /**
     * The table <code>performance_schema.replication_connection_status</code>.
     */
    public static final ReplicationConnectionStatus REPLICATION_CONNECTION_STATUS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationConnectionStatus.REPLICATION_CONNECTION_STATUS;

    /**
     * The table <code>performance_schema.replication_group_member_stats</code>.
     */
    public static final ReplicationGroupMemberStats REPLICATION_GROUP_MEMBER_STATS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS;

    /**
     * The table <code>performance_schema.replication_group_members</code>.
     */
    public static final ReplicationGroupMembers REPLICATION_GROUP_MEMBERS = com.syntax.sweagleapi.db.performance_schema.tables.ReplicationGroupMembers.REPLICATION_GROUP_MEMBERS;

    /**
     * The table <code>performance_schema.rwlock_instances</code>.
     */
    public static final RwlockInstances RWLOCK_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.RwlockInstances.RWLOCK_INSTANCES;

    /**
     * The table <code>performance_schema.session_account_connect_attrs</code>.
     */
    public static final SessionAccountConnectAttrs SESSION_ACCOUNT_CONNECT_ATTRS = com.syntax.sweagleapi.db.performance_schema.tables.SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_connect_attrs</code>.
     */
    public static final SessionConnectAttrs SESSION_CONNECT_ATTRS = com.syntax.sweagleapi.db.performance_schema.tables.SessionConnectAttrs.SESSION_CONNECT_ATTRS;

    /**
     * The table <code>performance_schema.session_status</code>.
     */
    public static final SessionStatus SESSION_STATUS = com.syntax.sweagleapi.db.performance_schema.tables.SessionStatus.SESSION_STATUS;

    /**
     * The table <code>performance_schema.session_variables</code>.
     */
    public static final SessionVariables SESSION_VARIABLES = com.syntax.sweagleapi.db.performance_schema.tables.SessionVariables.SESSION_VARIABLES;

    /**
     * The table <code>performance_schema.setup_actors</code>.
     */
    public static final SetupActors SETUP_ACTORS = com.syntax.sweagleapi.db.performance_schema.tables.SetupActors.SETUP_ACTORS;

    /**
     * The table <code>performance_schema.setup_consumers</code>.
     */
    public static final SetupConsumers SETUP_CONSUMERS = com.syntax.sweagleapi.db.performance_schema.tables.SetupConsumers.SETUP_CONSUMERS;

    /**
     * The table <code>performance_schema.setup_instruments</code>.
     */
    public static final SetupInstruments SETUP_INSTRUMENTS = com.syntax.sweagleapi.db.performance_schema.tables.SetupInstruments.SETUP_INSTRUMENTS;

    /**
     * The table <code>performance_schema.setup_objects</code>.
     */
    public static final SetupObjects SETUP_OBJECTS = com.syntax.sweagleapi.db.performance_schema.tables.SetupObjects.SETUP_OBJECTS;

    /**
     * The table <code>performance_schema.setup_threads</code>.
     */
    public static final SetupThreads SETUP_THREADS = com.syntax.sweagleapi.db.performance_schema.tables.SetupThreads.SETUP_THREADS;

    /**
     * The table <code>performance_schema.socket_instances</code>.
     */
    public static final SocketInstances SOCKET_INSTANCES = com.syntax.sweagleapi.db.performance_schema.tables.SocketInstances.SOCKET_INSTANCES;

    /**
     * The table <code>performance_schema.socket_summary_by_event_name</code>.
     */
    public static final SocketSummaryByEventName SOCKET_SUMMARY_BY_EVENT_NAME = com.syntax.sweagleapi.db.performance_schema.tables.SocketSummaryByEventName.SOCKET_SUMMARY_BY_EVENT_NAME;

    /**
     * The table <code>performance_schema.socket_summary_by_instance</code>.
     */
    public static final SocketSummaryByInstance SOCKET_SUMMARY_BY_INSTANCE = com.syntax.sweagleapi.db.performance_schema.tables.SocketSummaryByInstance.SOCKET_SUMMARY_BY_INSTANCE;

    /**
     * The table <code>performance_schema.status_by_account</code>.
     */
    public static final StatusByAccount STATUS_BY_ACCOUNT = com.syntax.sweagleapi.db.performance_schema.tables.StatusByAccount.STATUS_BY_ACCOUNT;

    /**
     * The table <code>performance_schema.status_by_host</code>.
     */
    public static final StatusByHost STATUS_BY_HOST = com.syntax.sweagleapi.db.performance_schema.tables.StatusByHost.STATUS_BY_HOST;

    /**
     * The table <code>performance_schema.status_by_thread</code>.
     */
    public static final StatusByThread STATUS_BY_THREAD = com.syntax.sweagleapi.db.performance_schema.tables.StatusByThread.STATUS_BY_THREAD;

    /**
     * The table <code>performance_schema.status_by_user</code>.
     */
    public static final StatusByUser STATUS_BY_USER = com.syntax.sweagleapi.db.performance_schema.tables.StatusByUser.STATUS_BY_USER;

    /**
     * The table <code>performance_schema.table_handles</code>.
     */
    public static final TableHandles TABLE_HANDLES = com.syntax.sweagleapi.db.performance_schema.tables.TableHandles.TABLE_HANDLES;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_index_usage</code>.
     */
    public static final TableIoWaitsSummaryByIndexUsage TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE = com.syntax.sweagleapi.db.performance_schema.tables.TableIoWaitsSummaryByIndexUsage.TABLE_IO_WAITS_SUMMARY_BY_INDEX_USAGE;

    /**
     * The table <code>performance_schema.table_io_waits_summary_by_table</code>.
     */
    public static final TableIoWaitsSummaryByTable TABLE_IO_WAITS_SUMMARY_BY_TABLE = com.syntax.sweagleapi.db.performance_schema.tables.TableIoWaitsSummaryByTable.TABLE_IO_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.table_lock_waits_summary_by_table</code>.
     */
    public static final TableLockWaitsSummaryByTable TABLE_LOCK_WAITS_SUMMARY_BY_TABLE = com.syntax.sweagleapi.db.performance_schema.tables.TableLockWaitsSummaryByTable.TABLE_LOCK_WAITS_SUMMARY_BY_TABLE;

    /**
     * The table <code>performance_schema.threads</code>.
     */
    public static final Threads THREADS = com.syntax.sweagleapi.db.performance_schema.tables.Threads.THREADS;

    /**
     * The table <code>performance_schema.user_defined_functions</code>.
     */
    public static final UserDefinedFunctions USER_DEFINED_FUNCTIONS = com.syntax.sweagleapi.db.performance_schema.tables.UserDefinedFunctions.USER_DEFINED_FUNCTIONS;

    /**
     * The table <code>performance_schema.user_variables_by_thread</code>.
     */
    public static final UserVariablesByThread USER_VARIABLES_BY_THREAD = com.syntax.sweagleapi.db.performance_schema.tables.UserVariablesByThread.USER_VARIABLES_BY_THREAD;

    /**
     * The table <code>performance_schema.users</code>.
     */
    public static final Users USERS = com.syntax.sweagleapi.db.performance_schema.tables.Users.USERS;

    /**
     * The table <code>performance_schema.variables_by_thread</code>.
     */
    public static final VariablesByThread VARIABLES_BY_THREAD = com.syntax.sweagleapi.db.performance_schema.tables.VariablesByThread.VARIABLES_BY_THREAD;

    /**
     * The table <code>performance_schema.variables_info</code>.
     */
    public static final VariablesInfo VARIABLES_INFO = com.syntax.sweagleapi.db.performance_schema.tables.VariablesInfo.VARIABLES_INFO;
}
