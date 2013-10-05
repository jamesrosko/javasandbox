package com.jamesrosko.patterns.abstractfactory;

public interface Car {

    CarType getCarType();

    String getMaker();

    void setMaker(String maker);
    
    int getCargoVolume();

}
