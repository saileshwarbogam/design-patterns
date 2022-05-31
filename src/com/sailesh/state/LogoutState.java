package com.sailesh.state;

public class LogoutState implements InstagramAccountState{
    @Override
    public void doTask(Context context) {
        System.out.println("User is in logged-out state");
        context.setState(this);
    }

    public String toString() {
        return "Logout State";
    }
}
