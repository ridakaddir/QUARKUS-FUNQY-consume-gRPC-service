package com.el;

import javax.enterprise.context.ApplicationScoped;
import hello.HelloServiceGrpc;
import hello.Hello.HelloRequest;
import io.quarkus.grpc.GrpcClient;

@ApplicationScoped
public class GreetingService {
    
    @GrpcClient("hello")
    HelloServiceGrpc.HelloServiceBlockingStub hello;

    public String hello() {
        return hello.sayHello(HelloRequest.newBuilder().setGreeting("Hello").build()).getReply();
    }
}
