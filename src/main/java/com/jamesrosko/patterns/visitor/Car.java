package com.jamesrosko.patterns.visitor;

public class Car {

    private String name;
    private String type;

    public void accept(Service service) {
        service.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
