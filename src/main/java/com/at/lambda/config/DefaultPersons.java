package com.at.lambda.config;


import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

import java.util.List;
@StaticInitSafe
@ConfigMapping(prefix = "person")
public interface DefaultPersons {
    List<Person> persons();
    interface Person{
        String name();
    }
}
