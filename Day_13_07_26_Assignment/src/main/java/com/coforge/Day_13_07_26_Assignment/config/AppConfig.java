package com.coforge.Day_13_07_26_Assignment.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.coforge.Day_13_07_26_Assignment.beans.Department;
import com.coforge.Day_13_07_26_Assignment.beans.Employee;

@Configuration
@PropertySource("classpath:info.properties")
public class AppConfig {

    @Value("${dept.id}")
    private int deptId;

    @Value("${dept.name}")
    private String deptName;

    @Value("${dept.loc}")
    private String deptLoc;


@Bean
public Employee emp1() {

    Employee e = new Employee();

    e.setId(1001);
    e.setName("Karan");
    e.setSalary(45000);
    e.setMobile("9999999999");
    e.setEmail("karan@gmail.com");

    return e;
}


@Bean
public Employee emp2() {

    Employee e = new Employee();

    e.setId(1002);
    e.setName("Priya");
    e.setSalary(55000);
    e.setMobile("8888888888");
    e.setEmail("priya@gmail.com");

    return e;
}


@Bean
public Employee emp3() {

    Employee e = new Employee();

    e.setId(1003);
    e.setName("Rahul");
    e.setSalary(65000);
    e.setMobile("7777777777");
    e.setEmail("rahul@gmail.com");

    return e;
}

    @Bean
    public Department department() {

        return new Department(
                deptId,
                deptName,
                deptLoc,
                Arrays.asList(
                        emp1(),
                        emp2(),
                        emp3()));
    }
}