package com.github.wlmx;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestDatabaseService {

    private final TestJooqDao testJooqDao;
    private final TestJpaDao testJpaDao;
    private final TestJdbcDao testJdbcDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String jooq() {
        return testJooqDao.test(1);
    }

    @Transactional
    public String jpa() {
        return testJpaDao.test(1);
    }

    @Transactional
    public String jdbc() {
        return testJdbcDao.test(1);
    }
}
