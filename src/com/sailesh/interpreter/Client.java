package com.sailesh.interpreter;

public class Client {

    public InterpreterContext ic;

    public Client(InterpreterContext i){
        this.ic=i;
    }

    public String interpret(String str){
        Expression exp = null;
        int subString = Integer.parseInt(str.substring(0, str.indexOf(" ")));
        if(str.contains("Hexadecimal")){
            exp=new IntToHex(subString);
        }else if(str.contains("Binary")){
            exp=new IntToBinary(subString);
        }
        return exp.interpret(ic);
    }

    public static void main(String args[]){
        String str1 = "49 in Binary";
        String str2 = "89 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(str1+"= "+client.interpret(str1));
        System.out.println(str2+"= "+client.interpret(str2));

    }
}
