package com.coforge;

class StockOutOfException extends Exception {

    public StockOutOfException(String msg) {
        super(msg);
    }
}

public class ProductMain {

    public static void main(String[] args) {

        int stock = 5;
        int orderQty = 10;

        try {

            if(orderQty > stock) {
                throw new StockOutOfException(
                        "Stock Not Available");
            }

            System.out.println("Order Placed Successfully");

        }
        catch(StockOutOfException e) {

            System.out.println(e.getMessage());

        }
    }
}