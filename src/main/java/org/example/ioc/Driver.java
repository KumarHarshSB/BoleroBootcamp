package org.example.ioc;

public class Driver {
    public static void main(String[] args) {
        Sim sim = SimFactory.getSim("Airtel");
        sim.calling();
        Sim sim2 = SimFactory.getSim("Jio");
        sim2.calling();
    }
}
