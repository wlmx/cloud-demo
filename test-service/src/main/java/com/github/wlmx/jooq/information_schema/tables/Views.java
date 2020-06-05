/*
 * This file is generated by jOOQ.
 */
package com.github.wlmx.jooq.information_schema.tables;


import com.github.wlmx.jooq.information_schema.InformationSchema;
import com.github.wlmx.jooq.information_schema.tables.records.ViewsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Views extends TableImpl<ViewsRecord> {

    private static final long serialVersionUID = 1046806494;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.VIEWS</code>
     */
    public static final Views VIEWS = new Views();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewsRecord> getRecordType() {
        return ViewsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.TABLE_CATALOG</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.TABLE_SCHEMA</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.TABLE_NAME</code>.
     */
    public final TableField<ViewsRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.VIEW_DEFINITION</code>.
     */
    public final TableField<ViewsRecord, String> VIEW_DEFINITION = createField(DSL.name("VIEW_DEFINITION"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.CHECK_OPTION</code>.
     */
    public final TableField<ViewsRecord, String> CHECK_OPTION = createField(DSL.name("CHECK_OPTION"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.IS_UPDATABLE</code>.
     */
    public final TableField<ViewsRecord, String> IS_UPDATABLE = createField(DSL.name("IS_UPDATABLE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.STATUS</code>.
     */
    public final TableField<ViewsRecord, String> STATUS = createField(DSL.name("STATUS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.REMARKS</code>.
     */
    public final TableField<ViewsRecord, String> REMARKS = createField(DSL.name("REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.VIEWS.ID</code>.
     */
    public final TableField<ViewsRecord, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.VIEWS</code> table reference
     */
    public Views() {
        this(DSL.name("VIEWS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.VIEWS</code> table reference
     */
    public Views(String alias) {
        this(DSL.name(alias), VIEWS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.VIEWS</code> table reference
     */
    public Views(Name alias) {
        this(alias, VIEWS);
    }

    private Views(Name alias, Table<ViewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Views(Name alias, Table<ViewsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Views(Table<O> child, ForeignKey<O, ViewsRecord> key) {
        super(child, key, VIEWS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Views as(String alias) {
        return new Views(DSL.name(alias), this);
    }

    @Override
    public Views as(Name alias) {
        return new Views(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(String name) {
        return new Views(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Views rename(Name name) {
        return new Views(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}