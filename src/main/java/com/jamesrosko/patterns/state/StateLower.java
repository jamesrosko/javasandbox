package com.jamesrosko.patterns.state;

public class StateLower implements State {

    private int count = 0;

    @Override
    public String writeName(StateContext stateContext, String name) {
        toggleState(stateContext);
        return name.toLowerCase();
    }

    private void toggleState(StateContext stateContext) {
        count++;
        if (count > 1) {
            stateContext.setState(new StateUpper());
            count = 0;
        }
    }

}
