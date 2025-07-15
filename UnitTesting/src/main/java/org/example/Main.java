package org.example;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.divide(30,15);

        if (result == 2)
            System.out.println("Passed");
        else System.out.println("failed");
    }
}