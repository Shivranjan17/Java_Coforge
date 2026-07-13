package com.coforge.Day_13_07_26_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.Day_13_07_26_Assignment.beans.Department;
import com.coforge.Day_13_07_26_Assignment.config.AppConfig;

public class App1 {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class);

        Department dept =
                context.getBean(Department.class);

        System.out.println(dept);
    }
}