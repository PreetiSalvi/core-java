package edu.java.core;

import java.util.Set;

public class SetClass {
    int id;
    String name;

    public SetClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SetClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof SetClass)) {
            return false;
        }

        SetClass user = (SetClass) obj;

        return user.name.equals(name) &&
                user.id == id ;
    }
}
