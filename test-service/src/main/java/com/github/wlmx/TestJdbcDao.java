package com.github.wlmx;

import com.github.wlmx.jpa.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestJdbcDao {

    private final NamedParameterJdbcOperations namedParameterJdbcOperations;

    public String test(Integer id) {
        TestEntity result = namedParameterJdbcOperations.queryForObject(
                "select * from test t where t.id = :id and t.name is not null",
                new MapSqlParameterSource().addValue("id", id), (rs, rowNum) -> {
                    int _id = rs.getInt("id");
                    String _name = rs.getString("name");
                    TestEntity testEntity = new TestEntity();
                    testEntity.setId(_id);
                    testEntity.setName(_name);
                    return testEntity;
                });
        return result != null ? result.getName() : "";
    }

    public void add() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId(12345);
        testEntity.setName("name");
        namedParameterJdbcOperations.update("insert into test (id, name) values (:id, :name)",
                new MapSqlParameterSource()
                        .addValue("id", testEntity.getId())
                        .addValue("name", testEntity.getName()));

    }
}
