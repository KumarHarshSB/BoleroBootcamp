package org.example.solidprinciples.openclosed;

abstract class Payment {
    Payment(double amount){
        this.amount = amount;
    }
    double amount;
    abstract void pay();
}
