package com.coforge;

class InvalidEmailException extends Exception {

    public InvalidEmailException(String msg) {
        super(msg);
    }
}

public class EmailMain {

    public static void main(String[] args) {

        String email = "shivgmail.com";

        try {

            if(!email.contains("@")) {
                throw new InvalidEmailException(
                        "Invalid Email Address");
            }

            System.out.println("Valid Email");

        }
        catch(InvalidEmailException e) {

            System.out.println(e.getMessage());

        }
    }
}