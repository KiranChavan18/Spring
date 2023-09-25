package com.example1.config;

import com.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
    @Configuration
    public class ProjectConfig {
    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean
        Vehicle vehicle2() {
            var veh = new Vehicle();
            veh.setName("Honda");
            return veh;
        }
        @Bean
        Vehicle vehicle3() {
            var veh = new Vehicle();
            veh.setName("Ferrari");
            return veh;
        }
}
