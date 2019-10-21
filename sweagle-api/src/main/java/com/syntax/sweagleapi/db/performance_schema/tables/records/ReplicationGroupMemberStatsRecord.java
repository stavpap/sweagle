/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.performance_schema.tables.records;


import com.syntax.sweagleapi.db.performance_schema.tables.ReplicationGroupMemberStats;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;
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
public class ReplicationGroupMemberStatsRecord extends TableRecordImpl<ReplicationGroupMemberStatsRecord> implements Record13<String, String, String, ULong, ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong> {

    private static final long serialVersionUID = -312779465;

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
     */
    public void setChannelName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
     */
    public void setViewId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.VIEW_ID</code>.
     */
    public String getViewId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
     */
    public void setMemberId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.MEMBER_ID</code>.
     */
    public String getMemberId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
     */
    public void setCountTransactionsInQueue(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE</code>.
     */
    public ULong getCountTransactionsInQueue() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
     */
    public void setCountTransactionsChecked(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED</code>.
     */
    public ULong getCountTransactionsChecked() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
     */
    public void setCountConflictsDetected(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_CONFLICTS_DETECTED</code>.
     */
    public ULong getCountConflictsDetected() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING</code>.
     */
    public void setCountTransactionsRowsValidating(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING</code>.
     */
    public ULong getCountTransactionsRowsValidating() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
     */
    public void setTransactionsCommittedAllMembers(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS</code>.
     */
    public String getTransactionsCommittedAllMembers() {
        return (String) get(7);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
     */
    public void setLastConflictFreeTransaction(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION</code>.
     */
    public String getLastConflictFreeTransaction() {
        return (String) get(8);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE</code>.
     */
    public void setCountTransactionsRemoteInApplierQueue(ULong value) {
        set(9, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE</code>.
     */
    public ULong getCountTransactionsRemoteInApplierQueue() {
        return (ULong) get(9);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED</code>.
     */
    public void setCountTransactionsRemoteApplied(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED</code>.
     */
    public ULong getCountTransactionsRemoteApplied() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED</code>.
     */
    public void setCountTransactionsLocalProposed(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED</code>.
     */
    public ULong getCountTransactionsLocalProposed() {
        return (ULong) get(11);
    }

    /**
     * Setter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK</code>.
     */
    public void setCountTransactionsLocalRollback(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>performance_schema.replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK</code>.
     */
    public ULong getCountTransactionsLocalRollback() {
        return (ULong) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, ULong, ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, ULong, ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.CHANNEL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.VIEW_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.MEMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_IN_QUEUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field6() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_CONFLICTS_DETECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field7() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_ROWS_VALIDATING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.TRANSACTIONS_COMMITTED_ALL_MEMBERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.LAST_CONFLICT_FREE_TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field10() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field11() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_REMOTE_APPLIED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field12() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_LOCAL_PROPOSED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field13() {
        return ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS.COUNT_TRANSACTIONS_LOCAL_ROLLBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getViewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component4() {
        return getCountTransactionsInQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getCountTransactionsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component6() {
        return getCountConflictsDetected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component7() {
        return getCountTransactionsRowsValidating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTransactionsCommittedAllMembers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLastConflictFreeTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component10() {
        return getCountTransactionsRemoteInApplierQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component11() {
        return getCountTransactionsRemoteApplied();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component12() {
        return getCountTransactionsLocalProposed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component13() {
        return getCountTransactionsLocalRollback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getChannelName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getViewId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMemberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value4() {
        return getCountTransactionsInQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getCountTransactionsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value6() {
        return getCountConflictsDetected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value7() {
        return getCountTransactionsRowsValidating();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTransactionsCommittedAllMembers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLastConflictFreeTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value10() {
        return getCountTransactionsRemoteInApplierQueue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value11() {
        return getCountTransactionsRemoteApplied();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value12() {
        return getCountTransactionsLocalProposed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value13() {
        return getCountTransactionsLocalRollback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value1(String value) {
        setChannelName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value2(String value) {
        setViewId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value3(String value) {
        setMemberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value4(ULong value) {
        setCountTransactionsInQueue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value5(ULong value) {
        setCountTransactionsChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value6(ULong value) {
        setCountConflictsDetected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value7(ULong value) {
        setCountTransactionsRowsValidating(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value8(String value) {
        setTransactionsCommittedAllMembers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value9(String value) {
        setLastConflictFreeTransaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value10(ULong value) {
        setCountTransactionsRemoteInApplierQueue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value11(ULong value) {
        setCountTransactionsRemoteApplied(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value12(ULong value) {
        setCountTransactionsLocalProposed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord value13(ULong value) {
        setCountTransactionsLocalRollback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReplicationGroupMemberStatsRecord values(String value1, String value2, String value3, ULong value4, ULong value5, ULong value6, ULong value7, String value8, String value9, ULong value10, ULong value11, ULong value12, ULong value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReplicationGroupMemberStatsRecord
     */
    public ReplicationGroupMemberStatsRecord() {
        super(ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS);
    }

    /**
     * Create a detached, initialised ReplicationGroupMemberStatsRecord
     */
    public ReplicationGroupMemberStatsRecord(String channelName, String viewId, String memberId, ULong countTransactionsInQueue, ULong countTransactionsChecked, ULong countConflictsDetected, ULong countTransactionsRowsValidating, String transactionsCommittedAllMembers, String lastConflictFreeTransaction, ULong countTransactionsRemoteInApplierQueue, ULong countTransactionsRemoteApplied, ULong countTransactionsLocalProposed, ULong countTransactionsLocalRollback) {
        super(ReplicationGroupMemberStats.REPLICATION_GROUP_MEMBER_STATS);

        set(0, channelName);
        set(1, viewId);
        set(2, memberId);
        set(3, countTransactionsInQueue);
        set(4, countTransactionsChecked);
        set(5, countConflictsDetected);
        set(6, countTransactionsRowsValidating);
        set(7, transactionsCommittedAllMembers);
        set(8, lastConflictFreeTransaction);
        set(9, countTransactionsRemoteInApplierQueue);
        set(10, countTransactionsRemoteApplied);
        set(11, countTransactionsLocalProposed);
        set(12, countTransactionsLocalRollback);
    }
}
