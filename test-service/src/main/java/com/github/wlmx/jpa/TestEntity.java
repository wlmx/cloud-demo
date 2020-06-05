package com.github.wlmx.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class TestEntity {

    @Id
    private Integer id;

    private String name;

    @OneToMany
    @JoinColumn(name = "another_entity_id")
    private List<AnotherEntity> anotherEntity;


}
