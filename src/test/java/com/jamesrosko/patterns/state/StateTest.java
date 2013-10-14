package com.jamesrosko.patterns.state;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StateTest {

    private StateContext stateContext;

    @Before
    public void setup() {
        stateContext = new StateContext();
    }

    @Test
    public void firstUpper() {
        String upperName1 = stateContext.writeName("tester");
        assertThat(upperName1, is("TESTER"));
    }

    @Test
    public void firstLower() {
        String upperName1 = stateContext.writeName("tester");
        assertThat(upperName1, is("TESTER"));
        String lowerName1 = stateContext.writeName("tester");
        assertThat(lowerName1, is("tester"));
    }

    @Test
    public void secondLower() {
        String upperName1 = stateContext.writeName("tester");
        assertThat(upperName1, is("TESTER"));
        String lowerName1 = stateContext.writeName("tester");
        assertThat(lowerName1, is("tester"));
        String lowerName2 = stateContext.writeName("tester");
        assertThat(lowerName2, is("tester"));
    }

    @Test
    public void secondUpper() {
        String upperName1 = stateContext.writeName("tester");
        assertThat(upperName1, is("TESTER"));
        String lowerName1 = stateContext.writeName("tester");
        assertThat(lowerName1, is("tester"));
        String lowerName2 = stateContext.writeName("tester");
        assertThat(lowerName2, is("tester"));
        String upperName2 = stateContext.writeName("tester");
        assertThat(upperName2, is("TESTER"));
    }
}
