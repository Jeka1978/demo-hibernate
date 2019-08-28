package com.db.demohibernate.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author Evgeny Borisov
 */
@Entity
public class Event {
    @ManyToOne()
    private Person owner;
}
