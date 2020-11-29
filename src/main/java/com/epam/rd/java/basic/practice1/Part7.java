package com.epam.rd.java.basic.practice1;

public class Part7 {
    public final static String[] arr = new String[]{"A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA"};

    public static void main(String[] args) {
        for (String s : arr) {
            System.out.println(s + " ==> " + str2int(s) + " ==> " + int2str(str2int(s)));
        }
    }


    public static int str2int(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++)
        {
            result *= 26;
            result += number.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static String int2str(int number) {
        StringBuilder columnName = new StringBuilder();

        while (number > 0) {
            int rem = number % 26;

            if (rem == 0) {
                columnName.append("Z");
                number = (number / 26) - 1;
            }
            else
            {
                columnName.append((char)((rem - 1) + 'A'));
                number = number / 26;
            }
        }return columnName.reverse().toString();


    }

    public static String rightColumn(String number) {

        return int2str(str2int(number) + 1);

    }
}
