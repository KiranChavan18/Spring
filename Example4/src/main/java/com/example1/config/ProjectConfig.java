package com.example1.config;

import com.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
    public class ProjectConfig {
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

    /*
    When you have multiple beans of the same kind inside the Spring context,
    you can make one of them primary by using @Primary annotation. Primary bean is
    the one which Spring will choose if it has multiple options and you don’t specify a name.
    In other words, it is the default bean that Spring Context will consider in case of
    confusion due to multiple beans present of same type.
    * */
        @Primary
        @Bean("FerrariVehicle")
        Vehicle vehicle3() {
            var veh = new Vehicle();
            veh.setName("Ferrari");
            return veh;
        }
}
