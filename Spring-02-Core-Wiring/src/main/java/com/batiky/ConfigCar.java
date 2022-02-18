package com.batiky;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {


@Bean
    Car car(){
    Car c = new Car();
    c.setMake("Honda");
    return c;


}

    //Direct Wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Chris");
//        p.setCar(car());
//        return p;
//    }

//Autowiring
@Bean
Person person(Car car){
    Person p = new Person();
    p.setName("Something");
    p.setCar(car);
    return p;
}
}
