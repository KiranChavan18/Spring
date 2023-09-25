package com.example1.config;

import com.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

    @Configuration
    public class ProjectConfig {

        /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */

        @Bean(name="AudiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean(value = "HondaVehicle")
        Vehicle vehicle2() {
            var veh = new Vehicle();
            veh.setName("Honda");
            return veh;
        }
        @Bean("FerrariVehicle")
        Vehicle vehicle3() {
            var veh = new Vehicle();
            veh.setName("Ferrari");
            return veh;
        }
}
