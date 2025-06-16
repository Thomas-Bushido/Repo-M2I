package org.example.demospring.service;

@service("greetings")
@profile
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String greet(){
        return "hello world from greeting service";
    }

}
