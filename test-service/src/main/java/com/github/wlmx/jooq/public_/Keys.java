/*
 * This file is generated by jOOQ.
 */
package com.github.wlmx.jooq.public_;


import com.github.wlmx.jooq.public_.tables.Test;
import com.github.wlmx.jooq.public_.tables.Test_2;
import com.github.wlmx.jooq.public_.tables.records.TestRecord;
import com.github.wlmx.jooq.public_.tables.records.Test_2Record;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TestRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
    public static final UniqueKey<Test_2Record> CONSTRAINT_9 = UniqueKeys0.CONSTRAINT_9;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<TestRecord> CONSTRAINT_2 = Internal.createUniqueKey(Test.TEST, "CONSTRAINT_2", new TableField[] { Test.TEST.ID }, true);
        public static final UniqueKey<Test_2Record> CONSTRAINT_9 = Internal.createUniqueKey(Test_2.TEST_2, "CONSTRAINT_9", new TableField[] { Test_2.TEST_2.ID }, true);
    }
}
