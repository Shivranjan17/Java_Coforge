package com.coforge.Day_13_07_26_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.Day_13_07_26_Assignment.beans.Department;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "department-bean.xml");

        Department dept =
                (Department) context.getBean("dept");

        System.out.println(dept);
    }
}