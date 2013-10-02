package com.jamesrosko.patterns.adapter;


public class Adapter {

    public EasyToUseClient adapt(final HardToUseAdaptee adaptee) {
        return new AdapterToClientAdapter(adaptee);
    }
}
