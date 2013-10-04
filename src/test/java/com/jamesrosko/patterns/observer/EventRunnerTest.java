package com.jamesrosko.patterns.observer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EventRunnerTest {

    private EventRunner eventRunner;

    @Before
    public void setup() {
        eventRunner = new EventRunner();
    }

    @Test
    public void notifyOneObserver() {
        EventObserver observer1 = new EventObserver("a");
        eventRunner.addObserver(observer1);

        // act
        eventRunner.notifyObservers();

        assertThat(observer1.getCount(), is(1));
    }

    @Test
    public void notifyManyObservers() {

        EventObserver observer1 = new EventObserver("a");
        EventObserver observer2 = new EventObserver("b");
        EventObserver observer3 = new EventObserver("c");

        eventRunner.addObserver(observer1);
        eventRunner.addObserver(observer2);
        eventRunner.addObserver(observer3);

        // act
        eventRunner.notifyObservers();
        eventRunner.notifyObservers();

        assertThat(observer1.getCount(), is(2));
        assertThat(observer2.getCount(), is(2));
        assertThat(observer3.getCount(), is(2));
    }
}
