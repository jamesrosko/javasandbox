package com.jamesrosko.patterns.singleton;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.jamesrosko.singleton.CannotMockMeSingleton;

public class CannotMockMeSingletonTest {

    @Test
    public void getInstanceNotNull() {
        CannotMockMeSingleton first = CannotMockMeSingleton.getInstance();

        assertThat(first, notNullValue());
    }

    @Test
    public void getInstanceSame() {
        CannotMockMeSingleton first = CannotMockMeSingleton.getInstance();
        CannotMockMeSingleton second = CannotMockMeSingleton.getInstance();

        assertThat(second, is(first));
    }

    @Test
    public void valueSame() {
        CannotMockMeSingleton first = CannotMockMeSingleton.getInstance();
        first.setValue("test1");
        CannotMockMeSingleton second = CannotMockMeSingleton.getInstance();

        assertThat(second.getValue(), is(first.getValue()));
    }

}
