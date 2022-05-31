package com.sailesh.state;

public class Context {
    private InstagramAccountState state;

    public Context() {
        state = null;

    }

    public InstagramAccountState getState() {
        return state;
    }

    public void setState(InstagramAccountState state) {
        this.state = state;
    }
}
