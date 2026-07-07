package com.coforge;

class InvalidMarksException extends Exception {

    public InvalidMarksException(String msg) {
        super(msg);
    }
}

public class StudentMain {

    public static void main(String[] args) {

        int marks = 120;

        try {

            if(marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                        "Marks should be between 0 and 100");
            }

            System.out.println("Valid Marks");

        }
        catch(InvalidMarksException e) {

            System.out.println(e.getMessage());

        }
    }
}