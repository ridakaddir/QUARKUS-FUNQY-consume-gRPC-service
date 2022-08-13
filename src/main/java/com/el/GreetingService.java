package com.el;

import javax.enterprise.context.ApplicationScoped;

import hello.HelloService;
import hello.Hello.HelloRequest;
import hello.Hello.HelloResponse;
import io.quarkus.grpc.GrpcClient;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class GreetingService {
    
    @GrpcClient("hello")
    HelloService hello;

    public Uni<String> hello() {
        
        return hello.sayHello(HelloRequest.newBuilder().setGreeting("from grpcb.in").build()).onItem().transform(HelloResponse::getReply);
    }
}
