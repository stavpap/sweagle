/*
 * This file is generated by jOOQ.
 */
package com.syntax.sweagleapi.db.information_schema.tables.records;


import com.syntax.sweagleapi.db.information_schema.tables.Partitions;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;
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
public class PartitionsRecord extends TableRecordImpl<PartitionsRecord> {

    private static final long serialVersionUID = 1315441583;

    /**
     * Setter for <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    public void setPartitionName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    public String getPartitionName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    public void setSubpartitionName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    public String getSubpartitionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    public void setPartitionOrdinalPosition(UInteger value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    public UInteger getPartitionOrdinalPosition() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    public void setSubpartitionOrdinalPosition(UInteger value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    public UInteger getSubpartitionOrdinalPosition() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    public void setPartitionMethod(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    public String getPartitionMethod() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    public void setSubpartitionMethod(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    public String getSubpartitionMethod() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    public void setPartitionExpression(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    public String getPartitionExpression() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    public void setSubpartitionExpression(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    public String getSubpartitionExpression() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    public void setPartitionDescription(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    public String getPartitionDescription() {
        return (String) get(11);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    public void setTableRows(ULong value) {
        set(12, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    public ULong getTableRows() {
        return (ULong) get(12);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    public void setAvgRowLength(ULong value) {
        set(13, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    public ULong getAvgRowLength() {
        return (ULong) get(13);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    public void setDataLength(ULong value) {
        set(14, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    public ULong getDataLength() {
        return (ULong) get(14);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    public void setMaxDataLength(ULong value) {
        set(15, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    public ULong getMaxDataLength() {
        return (ULong) get(15);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    public void setIndexLength(ULong value) {
        set(16, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    public ULong getIndexLength() {
        return (ULong) get(16);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    public void setDataFree(ULong value) {
        set(17, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    public ULong getDataFree() {
        return (ULong) get(17);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    public void setCreateTime(Timestamp value) {
        set(18, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(19, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    public void setCheckTime(Timestamp value) {
        set(20, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    public Timestamp getCheckTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    public void setChecksum(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    public Long getChecksum() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    public void setPartitionComment(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    public String getPartitionComment() {
        return (String) get(22);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    public void setNodegroup(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    public String getNodegroup() {
        return (String) get(23);
    }

    /**
     * Setter for <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    public void setTablespaceName(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return (String) get(24);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PartitionsRecord
     */
    public PartitionsRecord() {
        super(Partitions.PARTITIONS);
    }

    /**
     * Create a detached, initialised PartitionsRecord
     */
    public PartitionsRecord(String tableCatalog, String tableSchema, String tableName, String partitionName, String subpartitionName, UInteger partitionOrdinalPosition, UInteger subpartitionOrdinalPosition, String partitionMethod, String subpartitionMethod, String partitionExpression, String subpartitionExpression, String partitionDescription, ULong tableRows, ULong avgRowLength, ULong dataLength, ULong maxDataLength, ULong indexLength, ULong dataFree, Timestamp createTime, Timestamp updateTime, Timestamp checkTime, Long checksum, String partitionComment, String nodegroup, String tablespaceName) {
        super(Partitions.PARTITIONS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, partitionName);
        set(4, subpartitionName);
        set(5, partitionOrdinalPosition);
        set(6, subpartitionOrdinalPosition);
        set(7, partitionMethod);
        set(8, subpartitionMethod);
        set(9, partitionExpression);
        set(10, subpartitionExpression);
        set(11, partitionDescription);
        set(12, tableRows);
        set(13, avgRowLength);
        set(14, dataLength);
        set(15, maxDataLength);
        set(16, indexLength);
        set(17, dataFree);
        set(18, createTime);
        set(19, updateTime);
        set(20, checkTime);
        set(21, checksum);
        set(22, partitionComment);
        set(23, nodegroup);
        set(24, tablespaceName);
    }
}
