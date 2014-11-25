package com.jamesrosko.patterns.visitor;

import org.apache.log4j.Logger;

public class ServiceA implements Service {

    private static Logger log = Logger.getLogger(ServiceB.class);

    public void visit(Car car) {
        log.info("service a visit with car: " + car.getName());
        car.setType("type a");
    }
}
