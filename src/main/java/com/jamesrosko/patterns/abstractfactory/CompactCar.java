package com.jamesrosko.patterns.abstractfactory;

public class CompactCar implements Car {

    private String maker;
    private CarType carType = CarType.COMPACT;

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
        return 100;
    }
}
