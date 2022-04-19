package com.at.lambda.service;

import com.at.lambda.config.DefaultPersons;
import com.at.lambda.model.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class PersonService {
    private final List<Person> persons = Collections.synchronizedList(new ArrayList<Person>());
    private final Random rand = new Random();

    DefaultPersons defaultConfig;

    public PersonService(DefaultPersons defaultConfig) {
        this.defaultConfig = defaultConfig;
        defaultConfig.persons().stream().forEach(p->persons.add(new Person(p.name())));
    }

    public String getName(Person person){
        if(person == null || person.getName() == null)
            person =  persons.get(rand.nextInt(persons.size()));
        return person.getName();
    }
}
