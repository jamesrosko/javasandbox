package com.jamesrosko.patterns.strategy;

public class MultiplyStrategy implements Strategy {

    public int execute(int i, int j) {
        return i * j;
    }

}
