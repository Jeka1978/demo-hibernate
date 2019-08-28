package com.db.demohibernate.dao;

import com.db.demohibernate.model.Person;

/**
 * @author Evgeny Borisov
 */
public interface PersonDao {
    void savePerson(Person person);
}
