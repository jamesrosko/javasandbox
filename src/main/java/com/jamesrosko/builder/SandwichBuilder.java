package com.jamesrosko.builder;

public class SandwichBuilder {

    private Sandwich sandwich;

    public SandwichBuilder() {
        sandwich = new Sandwich();
    }

    public Sandwich build() {
        return sandwich;
    }

    public void withWhiteBread() {
        sandwich.setBread("white");
    }

    public void withAmericanCheese() {
        sandwich.setCheese("american");
    }

    public void withHam() {
        sandwich.setMeat("ham");
    }

    public void withMayo() {
        sandwich.setHasMayo(true);
    }

    public void withWheatBread() {
        sandwich.setBread("wheat");
    }

    public void withCheddarCheese() {
        sandwich.setCheese("cheddar");
    }

    public void withTurkey() {
        sandwich.setMeat("turkey");
    }

}
