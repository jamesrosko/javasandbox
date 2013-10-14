package com.jamesrosko.patterns.state;

public interface State {
    
    String writeName(StateContext stateContext, String name);
    
}
