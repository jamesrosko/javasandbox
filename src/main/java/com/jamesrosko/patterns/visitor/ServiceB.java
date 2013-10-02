package com.jamesrosko.patterns.visitor;

import org.apache.log4j.Logger;

public class ServiceB implements Service {

    private static Logger log = Logger.getLogger(ServiceB.class);

    @Override
    public void visit(Car car) {
        log.info("service b visit with car: " + car.getName());
        car.setType("type b");
    }

}
