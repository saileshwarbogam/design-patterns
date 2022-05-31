package com.sailesh.state;

public class LoginState implements InstagramAccountState{
    @Override
    public void doTask(Context context) {
        System.out.println("User is in logged-in state");
        context.setState(this);
    }

    public String toString() {
        return "Login State";
    }
}
