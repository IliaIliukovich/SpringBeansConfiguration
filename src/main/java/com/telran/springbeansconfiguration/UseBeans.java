package com.telran.springbeansconfiguration;

import com.telran.springbeansconfiguration.beans.Country;
import com.telran.springbeansconfiguration.beans.HelloWorld;
import com.telran.springbeansconfiguration.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UseBeans {

//    @Autowired
    private final HelloWorld helloWorld;

//    @Autowired
    private final Country country;

//    @Autowired
//    @Qualifier("person1")
    private final Person person;

    @Autowired
    public UseBeans(HelloWorld helloWorld, Country country, @Qualifier("person1") Person person) {
        this.helloWorld = helloWorld;
        this.country = country;
        this.person = person;
    }

//    @Autowired
//    public void setHelloWorld(HelloWorld helloWorld) {
//        this.helloWorld = helloWorld;
//    }
//
//    @Autowired
//    public void setCountry(Country country) {
//        this.country = country;
//    }
////
//    @Autowired
//    @Qualifier("person1")
//    public void setPerson(Person person) {
//        this.person = person;
//    }

    public void doSomething(){
        System.out.println("doSomething: " + helloWorld.getMessage());
        System.out.println("doSomething: " + country.getName());
    }


}
