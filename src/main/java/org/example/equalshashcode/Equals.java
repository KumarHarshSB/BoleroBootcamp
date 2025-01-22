package org.example.equalshashcode;

import java.util.Objects;

public class Equals extends Base {
    public Equals(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean equals(Object o) {
        // checks if same object is there Ex. ob1.equals(ob1)
        if (this == o)
            return true;

        // checks if instance of same class
        // avoid using if(!(o is instance of Equals)) - it become true even for subclass
        if(o!=null && this.getClass()!=o.getClass())
            return false;

        // type casting needed as its initially of type object
        Equals equals = (Equals) o;

        // compares based on field so that 2 diff objs ob1 & ob2 with same fields are considered equal
        return (equals.id == this.id && Objects.equals(equals.name, this.name));
    }

    // hashCode() must be overridden in every class that overrides equals
    @Override
    public int hashCode() {
        return this.id;
    }
}