package com.jamesrosko.patterns.state;

public class StateContext {
    
    private State state;
    
    public StateContext() {
        this.state = new StateUpper();
    }
    
    void setState(final State state){
        this.state = state;
    }

    public String writeName(String name) {
        return state.writeName(this,name);
    }

}
