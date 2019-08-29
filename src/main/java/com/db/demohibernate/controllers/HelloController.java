package com.db.demohibernate.controllers;

import com.db.demohibernate.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.hibernate.annotations.SortNatural;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @PostMapping("/person")
    public Person printPerson(@RequestBody Person person) {
        System.out.println(person);
        return person.withAge(120).withName("John");
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello spring MVC";
    }

    @GetMapping("/hi/{name}/{id}")
    public String helloWithName(@PathVariable int id, @PathVariable("name") String s){
        return s.toUpperCase()+" "+id;
    }

    @GetMapping("/stas")
    public String stas(@RequestParam("age") int age){
        return "STAS "+age;
    }


    @SneakyThrows
    public static void main(String[] args) {
        Person stepa = Person.builder().age(12).name("Stepa").build();
        String json = new ObjectMapper().writeValueAsString(stepa);
        System.out.println(json);
    }






}
