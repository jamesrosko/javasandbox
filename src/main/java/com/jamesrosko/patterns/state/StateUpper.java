package com.jamesrosko.patterns.state;

public class StateUpper implements State {

    @Override
    public String writeName(StateContext stateContext, String name) {
        stateContext.setState(new StateLower());
        return name.toUpperCase();
    }

}
