package com.jamesrosko.patterns.strategy;

public class MultiplyStrategy implements Strategy {

    @Override
    public int execute(int i, int j) {
        return i * j;
    }

}
