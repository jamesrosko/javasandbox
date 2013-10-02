package com.jamesrosko.patterns.javasandbox;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.jamesrosko.patterns.javasandbox.Foo;

public class FooTest {

    @Test
    public void test() {
        Foo foo = new Foo();
        String result = foo.bar();
        assertThat(result, is("test"));
    }

}
