package com.jamesrosko.patterns.abstractfactory;

public enum CarType {
    MID_SIZE, COMPACT;

    public Car buildCar() {
        switch (this) {
        case MID_SIZE:
            return new MidSizeCar();
        case COMPACT:
            return new CompactCar();
        }
        return null;
    }

}
