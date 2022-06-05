package com.sailesh.interpreter;

public class IntToHex implements Expression{
    private int i;

    public IntToHex(int i){
        this.i = i;
    }

    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getHexadecimal(i);
    }
}
