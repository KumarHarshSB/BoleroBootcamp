package org.example.solidprinciples.openclosed;

public class Driver {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment(10);
        creditCardPayment.pay();
        UPIPayment upiPayment = new UPIPayment(100);
        upiPayment.pay();
    }

}
