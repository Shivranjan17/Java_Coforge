package com.coforge;

class PasswordMismatchException extends Exception {

    public PasswordMismatchException(String msg) {
        super(msg);
    }
}

public class PasswordMain {

    public static void main(String[] args) {

        String password = "admin123";
        String confirmPassword = "admin12";

        try {

            if(!password.equals(confirmPassword)) {
                throw new PasswordMismatchException(
                        "Password Mismatch");
            }

            System.out.println("Password Matched");

        }
        catch(PasswordMismatchException e) {

            System.out.println(e.getMessage());

        }
    }
}