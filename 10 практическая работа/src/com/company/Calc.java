package com.company;

public class Calc {
    public int calc (int x1,String op, int x2){

        int res =0;
        switch (op)
        {
            case "+":
                res = x1+x2;
                break;
            case "-":
                res = x1-x2;
                break;
            case "*":
                res=x1*x2;
                break;
            case "/":
                res =x1/x2;
                break;
            default:
                res =0;
                break;
        }
        return res;
    }
}
