package com.jamesrosko.patterns.facade;

import java.util.Collections;
import java.util.List;

public class DrivingFacade {

    private Car car;

    public DrivingFacade() {
        car = new Car();
    }

    public void driveToWork() {
        car.start();
        car.goStraight();
        car.turnLeft();
        car.goStraight();
        car.turnRight();
        car.goStraight();
        car.turnRight();
        car.stop();
        car.shutOff();
    }

    public List<String> getDrivingHistory() {
        return Collections.unmodifiableList(car.getHistory());
    }

}
