package com.coforge;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class BankMain {

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawAmount = 10000;

        try {

            if(withdrawAmount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient Balance");
            }

            System.out.println("Transaction Successful");

        }
        catch(InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }
    }
}