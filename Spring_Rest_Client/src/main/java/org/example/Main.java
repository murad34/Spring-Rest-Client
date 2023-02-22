package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(16);
        System.out.println(empById);

//        Employee newEmployee = new Employee("Sveta", "Sokolova", "Films", 990);
//        communication.saveEmployee(newEmployee);

//        Employee oldEmployee = new Employee("Nihad", "Esgerli", "IT", 550);
//        oldEmployee.setId(17);
//        communication.saveEmployee(oldEmployee);

//        communication.deleteEmployee(16);

    }

}
