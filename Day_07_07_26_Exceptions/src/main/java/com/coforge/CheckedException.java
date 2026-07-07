package com.coforge;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedException {

    public static void main(String[] args) {

        // IOException
        try {

            FileReader fr = new FileReader("student.txt");

        }
        catch(IOException e) {

            System.out.println("IOException Occurred");
            e.printStackTrace();
        }

        // InterruptedException
        try {

            Thread.sleep(2000);

        }
        catch(InterruptedException e) {

            System.out.println("Interrupted Exception Occurred");
            e.printStackTrace();
        }

        // ParseException
        try {

            SimpleDateFormat sdf =
                    new SimpleDateFormat("dd/MM/yyyy");

            sdf.parse("ABC");

        }
        catch(ParseException e) {

            System.out.println("Parse Exception Occurred");
            e.printStackTrace();
        }

        System.out.println("Program Ended Successfully");
    }
}