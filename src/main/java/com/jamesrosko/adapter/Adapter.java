package com.jamesrosko.adapter;

public class Adapter {

    public EasyToUseClient adapt(final HardToUseAdaptee adaptee) {
        return new AdapterToClientAdapter(adaptee);
    }
}
