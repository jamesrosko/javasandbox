package com.jamesrosko.patterns.strategy;

public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int i, int j) {
        return strategy.execute(i, j);
    }

}
