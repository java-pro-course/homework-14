package com.elizaveta.example.sum;

public class UserSum {
    private int FirstNumber;
    private int SecondNumber;
    private int sum_user;


    public UserSum(int firstNumber, int secondNumber) {
        FirstNumber = firstNumber;
        SecondNumber = secondNumber;
        this.sum_user = firstNumber + secondNumber;
    }

    public void setFirstNumber(int firstNumber) {
        FirstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        SecondNumber = secondNumber;
    }

    public void setSum(int sum_user) {
        this.sum_user = sum_user;
    }

    public int getFirstNumber() {
        return FirstNumber;
    }

    public int getSecondNumber() {
        return SecondNumber;
    }

    public int getSum() {
        return sum_user;
    }
}
