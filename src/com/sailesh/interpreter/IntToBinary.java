package com.sailesh.interpreter;

public class IntToBinary implements Expression{

    private  int i;

    public IntToBinary(int i) {
        this.i = i;
    }
    @Override
    public String interpret(InterpreterContext interpreterContext) {
        return interpreterContext.getBinary(this.i);
    }
}
