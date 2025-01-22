package org.example.equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        // Overriding both equals() and hashCode()
        Equals ob1 = new Equals(16,"Krishna");
        Equals ob2 = new Equals(16,"Krishna");

        if(ob1.hashCode() == ob2.hashCode()) {
            if(ob1.equals(ob2)) {
                System.out.println("Both are equal");
            }
            else{
                System.out.println("Both are not equal");
            }
        }
        else
            System.out.println("Both are not equal (even hashcode)");

        // Overriding only equals()
        EqualOverride h1 = new EqualOverride(16,"Krishna");
        EqualOverride h2 = new EqualOverride(16,"Krishna");
        Map<EqualOverride,String> m = new HashMap<EqualOverride,String>();
        m.put(h1,"first");
        m.put(h2,"second");

        for(EqualOverride h : m.keySet()) {
            System.out.println(m.get(h));
        }

        // Overriding only hashCode()
        HashCodeOverride h3 = new HashCodeOverride(16,"Krishna");
        HashCodeOverride h4 = new HashCodeOverride(16,"Krishna");
        Map<HashCodeOverride,String> m2 = new HashMap<HashCodeOverride,String>();
        m2.put(h3,"first");
        m2.put(h4,"second");

        for(HashCodeOverride h : m2.keySet()) {
            System.out.println(m2.get(h));
        }
    }
}
