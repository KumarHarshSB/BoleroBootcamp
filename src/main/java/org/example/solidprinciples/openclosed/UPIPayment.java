package org.example.solidprinciples.openclosed;

public class UPIPayment extends Payment {
    UPIPayment(double amount) {
        super(amount);
    }
    @Override
    void pay(){
        System.out.println("UPI pays " + amount + " rupee");
    }
}
