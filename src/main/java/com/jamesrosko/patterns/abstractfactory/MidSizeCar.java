package com.jamesrosko.patterns.abstractfactory;

public class MidSizeCar implements Car {

    private String maker;
    private CarType carType = CarType.MID_SIZE;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public int getCargoVolume() {
        return 110;
    }
}
