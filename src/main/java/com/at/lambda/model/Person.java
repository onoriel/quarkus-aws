package com.at.lambda.model;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
