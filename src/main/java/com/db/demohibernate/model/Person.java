package com.db.demohibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Entity
@Table(name = "PERSONS")
@Data
public class Person {


    @Id
    @GeneratedValue
    private long id;
    @Transient
    private int age;

    @OneToMany(mappedBy = "owner",orphanRemoval = true)
    private List<Event> events;
















}
