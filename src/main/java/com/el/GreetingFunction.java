package com.el;

import javax.inject.Inject;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    @Inject
    GreetingService service;

    @Funq
    public String greet() {
       return service.hello();
    }
}
