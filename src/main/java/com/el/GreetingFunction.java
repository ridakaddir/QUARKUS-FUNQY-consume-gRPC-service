package com.el;

import javax.inject.Inject;

import io.quarkus.funqy.Funq;
import io.smallrye.mutiny.Uni;

public class GreetingFunction {

    @Inject
    GreetingService service;

    @Funq
    public Uni<String> greet() {
       return service.hello();
    }
}
