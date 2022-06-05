package com.sailesh.interpreter;

public class InterpreterContext {

    public String getBinary(int i) {
        return Integer.toBinaryString(i);
    }

    public String getHexadecimal(int i) {
        return Integer.toHexString(i);

    }
}
