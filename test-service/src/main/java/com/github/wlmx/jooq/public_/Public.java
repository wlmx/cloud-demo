/*
 * This file is generated by jOOQ.
 */
package com.github.wlmx.jooq.public_;


import com.github.wlmx.jooq.DefaultCatalog;
import com.github.wlmx.jooq.public_.tables.Test;
import com.github.wlmx.jooq.public_.tables.Test_2;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1960276823;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.TEST</code>.
     */
    public final Test TEST = Test.TEST;

    /**
     * The table <code>PUBLIC.TEST_2</code>.
     */
    public final Test_2 TEST_2 = Test_2.TEST_2;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Test.TEST,
            Test_2.TEST_2);
    }
}