package com.github.wlmx;

import com.github.wlmx.jooq.public_.Tables;
import com.github.wlmx.jooq.public_.tables.records.TestRecord;
import com.github.wlmx.jpa.AnotherEntity;
import com.github.wlmx.jpa.TestEntity;
import com.github.wlmx.jpa.TestEntityJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TestJpaDao {

    private final TestEntityJpaRepository testEntityJpaRepository;


    public String test(Integer id) {
        List<TestEntity> entityList = testEntityJpaRepository.findByIdAndNameIsNullOrderByIdDesc(1);
        TestEntity one = testEntityJpaRepository.getOne(id);
        List<AnotherEntity> anotherEntity = one.getAnotherEntity();;
        return one.getName();
    }

    public void add() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(12345);
        testEntity.setName("name");
        ArrayList<AnotherEntity> anotherEntity = new ArrayList<>();
        anotherEntity.add(new AnotherEntity());
        testEntity.setAnotherEntity(anotherEntity);
        testEntityJpaRepository.save(testEntity);
    }


}
