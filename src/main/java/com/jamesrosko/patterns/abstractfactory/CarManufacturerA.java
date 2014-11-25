package com.jamesrosko.patterns.abstractfactory;

public class CarManufacturerA implements CarManufacturer {

    private static final String MANUFACTURER_NAME = "maker a";

    public Car produce(CarType carType) {

        Car car = null;
        switch (carType) {
        case MID_SIZE:
            MidSizeCar midSizeCar = new MidSizeCar();
            midSizeCar.setMaker(MANUFACTURER_NAME);
            car = midSizeCar;
            break;
        case COMPACT:
            CompactCar compactCar = new CompactCar();
            compactCar.setMaker(MANUFACTURER_NAME);
            car = compactCar;
            break;
        }
        return car;
    }

}
