package br.com.stream.model;

import java.util.List;

public class Wife {

    private String name;
    private List<Child> child;

    public Wife() {
    }

    public Wife(String name, List<Child> child) {
        this.name = name;
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", child=" + child +
                '}';
    }
}
