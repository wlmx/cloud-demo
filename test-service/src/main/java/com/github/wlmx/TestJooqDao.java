package com.github.wlmx;

import com.github.wlmx.jooq.public_.Tables;
import com.github.wlmx.jooq.public_.tables.records.TestRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.Cursor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestJooqDao {

    private final DSLContext dslContext;

    public String test(Integer id) {
        Cursor<TestRecord> testRecords = dslContext
                .selectFrom(Tables.TEST)
                .where(Tables.TEST.ID.eq(id).and(Tables.TEST.NAME.isNull()))
                .orderBy(Tables.TEST.ID.desc())
                .forUpdate()
                .skipLocked()
                .fetchLazy();
        TestRecord testRecord = testRecords.fetchNext();
        if (testRecord != null) {
            return testRecord.toString();
        } else {
            return "empty";
        }
    }

    public void add() {
        TestRecord testRecord = dslContext.newRecord(Tables.TEST);
        testRecord.setId(111);
        testRecord.setName("name");
        testRecord.store();
    }
}
