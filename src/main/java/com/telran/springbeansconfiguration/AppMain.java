package com.telran.springbeansconfiguration;

import com.telran.springbeansconfiguration.beans.Country;
import com.telran.springbeansconfiguration.beans.HelloWorld;
import com.telran.springbeansconfiguration.beans.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        System.out.println("Main start");
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class, args);
        System.out.println("Context created");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.setMessage("Hello World!");

        System.out.println(helloWorld.getMessage());

        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.setMessage("Another message");
        System.out.println(helloWorld2.getMessage());
        System.out.println(helloWorld == helloWorld2);

        Country country = (Country) context.getBean("germany");
        Country country2 = (Country) context.getBean("germany");
        System.out.println(country == country2);

        Person personOne = (Person) context.getBean("person1");
        Person personTwo = (Person) context.getBean("person2");

        System.out.println(country);
        System.out.println(personOne);
        System.out.println(personTwo);
        System.out.println(personOne.getCountry() == personTwo.getCountry());

        // Usual Java logic without spring context
//        AppConfig config = new AppConfig();
//        Person person1 = config.person1();
//        Person person2 = config.person2();
//        System.out.println(person1.getCountry() == person2.getCountry());

        context.close();

//        HelloWorld helloWorld3 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println("Main end");
    }


}
