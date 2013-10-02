package com.jamesrosko.patterns.adapter;

public class AdapterToClientAdapter implements EasyToUseClient {

    private final HardToUseAdaptee adaptee;

    public AdapterToClientAdapter(final HardToUseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String format(String input) {
        String complicated = adaptee.complicated(input);
        return complicated.toUpperCase();
    }

}
