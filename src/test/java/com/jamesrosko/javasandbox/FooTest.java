package com.jamesrosko.javasandbox;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FooTest {

    @Test
    public void test() {
        Foo foo = new Foo();
        String result = foo.bar();
        assertThat(result, is("test"));
    }

}
