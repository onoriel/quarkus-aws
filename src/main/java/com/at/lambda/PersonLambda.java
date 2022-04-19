package com.at.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.at.lambda.model.Person;
import com.at.lambda.service.PersonService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.inject.Named;

@Named("personLambda")
public class PersonLambda implements RequestHandler<Person, String> {
    @Inject
    PersonService personService;

    @ConfigProperty(name = "greeting.prefix")
    String prefixGreeting;

    @Override
    public String handleRequest(Person input, Context context) {
        return prefixGreeting + " " +  personService.getName(input);
    }
}
