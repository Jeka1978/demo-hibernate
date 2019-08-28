package com.db.demohibernate.dao;

import com.db.demohibernate.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class PersonDaoImpl implements PersonDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void savePerson(Person person) {
        Query query = entityManager.createQuery("* from Person where age>:age");


    }
}
