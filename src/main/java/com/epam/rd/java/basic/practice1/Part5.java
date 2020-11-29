package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.print(sum); 
    }
	
}
