/*
 * This file is generated by jOOQ.
 */
package com.github.wlmx.jooq.information_schema.tables.records;


import com.github.wlmx.jooq.information_schema.tables.Columns;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsRecord extends TableRecordImpl<ColumnsRecord> {

    private static final long serialVersionUID = -1802389827;

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_CATALOG</code>.
     */
    public void setDomainCatalog(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_CATALOG</code>.
     */
    public String getDomainCatalog() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_SCHEMA</code>.
     */
    public void setDomainSchema(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_SCHEMA</code>.
     */
    public String getDomainSchema() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_NAME</code>.
     */
    public void setDomainName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DOMAIN_NAME</code>.
     */
    public String getDomainName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public void setColumnDefault(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_DEFAULT</code>.
     */
    public String getColumnDefault() {
        return (String) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>.
     */
    public void setIsNullable(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_NULLABLE</code>.
     */
    public String getIsNullable() {
        return (String) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>.
     */
    public void setDataType(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DATA_TYPE</code>.
     */
    public Integer getDataType() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public void setCharacterMaximumLength(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Integer getCharacterMaximumLength() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public void setCharacterOctetLength(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Integer getCharacterOctetLength() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public void setNumericPrecision(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>.
     */
    public void setNumericPrecisionRadix(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_PRECISION_RADIX</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>.
     */
    public void setNumericScale(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.DATETIME_PRECISION</code>.
     */
    public void setDatetimePrecision(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.DATETIME_PRECISION</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_TYPE</code>.
     */
    public void setIntervalType(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_TYPE</code>.
     */
    public String getIntervalType() {
        return (String) get(17);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_PRECISION</code>.
     */
    public void setIntervalPrecision(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.INTERVAL_PRECISION</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public void setCharacterSetName(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>.
     */
    public void setCollationName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.TYPE_NAME</code>.
     */
    public void setTypeName(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.TYPE_NAME</code>.
     */
    public String getTypeName() {
        return (String) get(21);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.NULLABLE</code>.
     */
    public void setNullable(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.NULLABLE</code>.
     */
    public Integer getNullable() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.IS_COMPUTED</code>.
     */
    public void setIsComputed(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_COMPUTED</code>.
     */
    public Boolean getIsComputed() {
        return (Boolean) get(23);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.SELECTIVITY</code>.
     */
    public void setSelectivity(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.SELECTIVITY</code>.
     */
    public Integer getSelectivity() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.CHECK_CONSTRAINT</code>.
     */
    public void setCheckConstraint(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.CHECK_CONSTRAINT</code>.
     */
    public String getCheckConstraint() {
        return (String) get(25);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.SEQUENCE_NAME</code>.
     */
    public void setSequenceName(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.SEQUENCE_NAME</code>.
     */
    public String getSequenceName() {
        return (String) get(26);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(27);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.SOURCE_DATA_TYPE</code>.
     */
    public void setSourceDataType(Short value) {
        set(28, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.SOURCE_DATA_TYPE</code>.
     */
    public Short getSourceDataType() {
        return (Short) get(28);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_TYPE</code>.
     */
    public void setColumnType(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_TYPE</code>.
     */
    public String getColumnType() {
        return (String) get(29);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_ON_UPDATE</code>.
     */
    public void setColumnOnUpdate(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.COLUMN_ON_UPDATE</code>.
     */
    public String getColumnOnUpdate() {
        return (String) get(30);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.COLUMNS.IS_VISIBLE</code>.
     */
    public void setIsVisible(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.COLUMNS.IS_VISIBLE</code>.
     */
    public String getIsVisible() {
        return (String) get(31);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsRecord
     */
    public ColumnsRecord() {
        super(Columns.COLUMNS);
    }

    /**
     * Create a detached, initialised ColumnsRecord
     */
    public ColumnsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, Integer ordinalPosition, String domainCatalog, String domainSchema, String domainName, String columnDefault, String isNullable, Integer dataType, Integer characterMaximumLength, Integer characterOctetLength, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, String characterSetName, String collationName, String typeName, Integer nullable, Boolean isComputed, Integer selectivity, String checkConstraint, String sequenceName, String remarks, Short sourceDataType, String columnType, String columnOnUpdate, String isVisible) {
        super(Columns.COLUMNS);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, columnName);
        set(4, ordinalPosition);
        set(5, domainCatalog);
        set(6, domainSchema);
        set(7, domainName);
        set(8, columnDefault);
        set(9, isNullable);
        set(10, dataType);
        set(11, characterMaximumLength);
        set(12, characterOctetLength);
        set(13, numericPrecision);
        set(14, numericPrecisionRadix);
        set(15, numericScale);
        set(16, datetimePrecision);
        set(17, intervalType);
        set(18, intervalPrecision);
        set(19, characterSetName);
        set(20, collationName);
        set(21, typeName);
        set(22, nullable);
        set(23, isComputed);
        set(24, selectivity);
        set(25, checkConstraint);
        set(26, sequenceName);
        set(27, remarks);
        set(28, sourceDataType);
        set(29, columnType);
        set(30, columnOnUpdate);
        set(31, isVisible);
    }
}
