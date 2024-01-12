package com.telran.springbeansconfiguration;

import com.telran.springbeansconfiguration.beans.Country;
import com.telran.springbeansconfiguration.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
//@ComponentScan(basePackages = "com.telran.springbeansconfiguration.beans")
//@PropertySource("classpath:application.properties")
@SpringBootApplication
public class AppConfig {

//    @Bean(name = "helloWorld", initMethod = "defaultMessage", destroyMethod = "sayGoodbye")
//    public HelloWorld helloWorld(){
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setMessage("Hello World!");
//        return helloWorld;
//    }

//    @Bean
//    public Country france(){
//        Country country = new Country();
//        country.setName("France");
//        country.setCode("FR");
//        return country;
//    }

//    @Bean
//    public Country germany(){
//        Country country = new Country();
//        country.setName("Germany");
//        country.setCode("GE");
//        return country;
//    }


    @Autowired
    private Country country;

    @Bean
    public Person person1(){
        Person person = new Person();
        person.setAge(23);
        person.setName("Tom");
        person.setCountry(country);
        return person;
    }

    @Bean
    public Person person2(){
        Person person = new Person();
        person.setAge(23);
        person.setName("Bob");
        person.setCountry(country);
        return person;
    }


}
