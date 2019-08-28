package com.db.demohibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional(timeout = 1000)
public class PersonService {
    @Autowired
    private PersonService2 personService2;

    public void transferMoney() {
        personService2.abc();
    }
}
