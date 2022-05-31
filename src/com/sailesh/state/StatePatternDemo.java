package com.sailesh.state;

public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        LoginState loginState = new LoginState();

        loginState.doTask(context);

        System.out.println(context.getState().toString());

        LogoutState logoutState = new LogoutState();

        logoutState.doTask(context);

        System.out.println(context.getState().toString());
    }


}
