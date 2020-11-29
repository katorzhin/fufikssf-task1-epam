package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static int addition(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.print(sum);
    }

}
