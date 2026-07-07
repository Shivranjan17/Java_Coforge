package com.coforge;

public class StudentReportMain {

    public static void main(String[] args) {

        Student students[] = new Student[3];

        students[0] = new Student(
                101,
                "Shivranjan",
                80, 70, 90,
                "9876543210",
                "shiv@gmail.com",
                "CSE");

        students[1] = null;

        students[2] = new Student(
                102,
                "Sahil",
                75, 85, 95,
                "9123456789",
                "sahil@gmail.com",
                "IT");

        try {

            // 1 ArithmeticException
            int total = 300;
            int subjectCount = 0;
            System.out.println(total / subjectCount);

        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        }

        try {

            // 2 NullPointerException
            students[1].generateReport();

        }
        catch (NullPointerException e) {
            System.out.println("Student Object is Null");
        }

        try {

            // 3 ArrayIndexOutOfBoundsException
            students[5].generateReport();

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Student Index");
        }

        try {

            // 4 StringIndexOutOfBoundsException
            String branch = "CSE";

            System.out.println(branch.charAt(10));

        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds");
        }

        try {

            // 5 IllegalArgumentException
            Thread.sleep(-1000);

        }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument Exception");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {

            // 6 NumberFormatException
            int mobile = Integer.parseInt("ABC123");

        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Number Format");
        }

        try {

            // 7 ClassCastException
            Object obj = "Shivranjan";

            Integer num = (Integer) obj;

        }
        catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
        }

        System.out.println("\nValid Student Reports");

        for(Student s : students) {

            if(s != null) {
                s.generateReport();
            }
        }
    }
}