package com.github.wlmx.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.LockModeType;
import java.util.List;

public interface TestEntityJpaRepository extends JpaRepository<TestEntity, Integer> {

    List<TestEntity> findByIdAndNameIsNullOrderByIdDesc(Integer id);

    @Query("select t from TestEntity t where t.id = ?1 and t.name is null order by t.id desc")
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<TestEntity> _findByIdAndNameIsNullOrderByIdDesc(Integer id);


}
