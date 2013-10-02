package com.jamesrosko.patterns.wrapper;


public class CupImpl implements Cup {

    boolean hasLiquid;

    @Override
    public void fill() {
        hasLiquid = true;
    }

    @Override
    public void drink() {
        hasLiquid = false;

    }

    @Override
    public boolean isEmpty() {
        return !hasLiquid;
    }

}
