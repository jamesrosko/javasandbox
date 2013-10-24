package com.jamesrosko.patterns.strategy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StrategyTest {

    @Test
    public void addTest() {
        StrategyContext context = new StrategyContext(new AddStrategy());
        int actual = context.executeStrategy(5, 3);
        assertThat(actual, is(8));
    }

    @Test
    public void addTestAnother() {
        StrategyContext context = new StrategyContext(new AddStrategy());
        int actual = context.executeStrategy(12, 2);
        assertThat(actual, is(14));
    }

    @Test
    public void multiplyTest() {
        StrategyContext context = new StrategyContext(new MultiplyStrategy());
        int actual = context.executeStrategy(5, 3);
        assertThat(actual, is(15));
    }

    @Test
    public void multiplyTestAnother() {
        StrategyContext context = new StrategyContext(new MultiplyStrategy());
        int actual = context.executeStrategy(12, 2);
        assertThat(actual, is(24));
    }
}
