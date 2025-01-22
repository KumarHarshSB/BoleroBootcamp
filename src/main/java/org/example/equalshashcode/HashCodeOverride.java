package org.example.equalshashcode;

public class HashCodeOverride extends Base{
    public HashCodeOverride(int id, String name) {
        super(id, name);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
