package org.example.solidprinciples.openclosed;

public class CreditCardPayment extends Payment {
    CreditCardPayment(double amount) {
        super(amount);
    }
    @Override
    void pay(){
        System.out.println("Credit card pays " + amount + " rupee");
    }
}
