package com.jamesrosko.patterns.builder;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import com.jamesrosko.patterns.builder.SandwichBuilder;

public class SandwichBuilderTest {

    @Test
    public void build() {
        SandwichBuilder builder = new SandwichBuilder();
        Sandwich result = builder.build();
        assertThat(result, notNullValue());
    }

    @Test
    public void buildWithEverything() {
        SandwichBuilder builder = new SandwichBuilder();
        builder.withWhiteBread();
        builder.withAmericanCheese();
        builder.withHam();
        builder.withMayo();

        Sandwich result = builder.build();

        assertThat(result.getBread(), is("white"));
        assertThat(result.getCheese(), is("american"));
        assertThat(result.getMeat(), is("ham"));
        assertThat(result.isHasMayo(), is(true));
    }

    @Test
    public void buildWithEverythingElse() {
        SandwichBuilder builder = new SandwichBuilder();
        builder.withWheatBread();
        builder.withCheddarCheese();
        builder.withTurkey();

        Sandwich result = builder.build();

        assertThat(result.getBread(), is("wheat"));
        assertThat(result.getCheese(), is("cheddar"));
        assertThat(result.getMeat(), is("turkey"));
        assertThat(result.isHasMayo(), is(false));
    }

    @Test
    public void buildForVegitarian() {
        SandwichBuilder builder = new SandwichBuilder();
        builder.withWheatBread();
        builder.withCheddarCheese();

        Sandwich result = builder.build();

        assertThat(result.getBread(), is("wheat"));
        assertThat(result.getCheese(), is("cheddar"));
        assertThat(result.getMeat(), nullValue());
        assertThat(result.isHasMayo(), is(false));
    }
}
