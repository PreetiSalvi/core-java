package edu.java.core;

import java.util.Objects;

public class People implements Comparable<People> {
    int id;
    String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return id == people.id &&
                Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(People o) {

        if(id > o.id){
            return 1;
        }else if (id < o.id){
            return -1;
        }

        return 0;
    }
}
