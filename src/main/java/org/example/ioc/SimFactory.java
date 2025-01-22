package org.example.ioc;

// works like a bean factory
public class SimFactory {
    public static Sim getSim(String type) {
        if ("Airtel".equalsIgnoreCase(type)) {
            return new Airtel();
        } else if ("Jio".equalsIgnoreCase(type)) {
            return new Jio();
        }
        throw new IllegalArgumentException("Unknown SIM type: " + type);
    }
}
