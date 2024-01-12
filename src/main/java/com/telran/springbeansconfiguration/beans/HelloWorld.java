package com.telran.springbeansconfiguration.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class HelloWorld {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @PostConstruct
    public void defaultMessage(){
        System.out.println(this.getClass() + " bean init method");
        message = "Default Greeting Message";
    }

    @PreDestroy
    public void sayGoodbye() {
        System.out.println(this.getClass() + " bean destroy method");
        System.out.println("Bean will be destroyed. Good bye!");
    }

}
