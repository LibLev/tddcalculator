package com.codecool;

public class Calculator {

    public Calculator() {
    }

    public int addition(int num1, int num2) {
        return num1+num2;
    }

    public int subtraction(int num1, int num2) {
        return num1-num2;
    }

    public int multiplication(int num1, int num2) {
        return num1*num2;
    }

    public int division(int num1, int num2) throws Exception {
        int result = 0;
        try {
            result = num1/num2;
        }catch (Exception e){
            System.out.println("Division by zero is not acceptable");
        }
        return result;
    }
}
