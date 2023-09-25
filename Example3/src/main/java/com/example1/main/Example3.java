package com.example1.main;

import com.example1.beans.Vehicle;
import com.example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean("AudiVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("HondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("FerrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());




    }
}


