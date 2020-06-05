package com.github.wlmx.jpa;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class AnotherEntity {

    @Id
    private Integer id;

    private String name;
}
