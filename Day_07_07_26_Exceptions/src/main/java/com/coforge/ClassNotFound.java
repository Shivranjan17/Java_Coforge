package com.coforge;

public class ClassNotFound {

    public static void main(String[] args) {

        try {

            Class.forName("com.coforge.Student123");

        }
        catch(ClassNotFoundException e) {

            System.out.println("Class Not Found Exception");
            e.printStackTrace();
        }
    }
}