package com.jamesrosko.patterns.wrapper;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CupWrapperTest {

    @Test
    public void fill() {
        CupWrapper cupWrapper = new CupWrapper(new CupImpl());
        cupWrapper.fill();
        assertThat(cupWrapper.isEmpty(), is(false));
    }

    @Test
    public void defaultIsEmpty() {
        CupWrapper cupWrapper = new CupWrapper(new CupImpl());
        assertThat(cupWrapper.isEmpty(), is(true));
    }

    @Test
    public void drink() {
        CupWrapper cupWrapper = new CupWrapper(new CupImpl());
        cupWrapper.drink();
        assertThat(cupWrapper.isEmpty(), is(true));

    }

    @Test
    public void drinkFillDrink() {
        CupWrapper cupWrapper = new CupWrapper(new CupImpl());
        cupWrapper.drink();
        assertThat(cupWrapper.isEmpty(), is(true));

        cupWrapper.fill();
        assertThat(cupWrapper.isEmpty(), is(false));

        cupWrapper.drink();
        assertThat(cupWrapper.isEmpty(), is(true));
    }

}
