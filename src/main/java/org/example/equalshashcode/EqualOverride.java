package org.example.equalshashcode;

public class EqualOverride extends Base {
    public EqualOverride(int id, String name) {
        super(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        EqualOverride equalOverride = (EqualOverride) o;
        return (this.id == equalOverride.id && this.name.equals(equalOverride.name));
    }
}
