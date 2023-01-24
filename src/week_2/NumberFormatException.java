package week_2;


import java.util.Scanner;

public class NumberFormatException {

    public static void main(String args[]) {

        try {
            int a = Integer.parseInt("1a");
            System.out.println(a);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("NumberFormat Exception: invalid input string");
        }

        System.out.println("Continuing execution...");

        /**
         The NumberFormatException is an exception in Java, and therefore can be handled using try-catch blocks using the following steps:

         Surround the statements that can throw an NumberFormatException in try-catch blocks
         Catch the NumberFormatException
         Depending on the requirements of the application, take necessary action. For example, log the exception with an appropriate message.
         */

        int number;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any valid number");
            try {
                number = Integer.parseInt(input.next());
                System.out.println("You entered: "
                        + number);
                break;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("NumberFormatException occurred");
            }


        }
    }
}

/*
There can be various cases related to improper string format for conversion to numeric values. Some of them are:

Null input string
Integer.parseInt(null);

Empty input string
Integer.parseInt("");

Input string with leading/trailing whitespaces
Integer myInt = new Integer(" 123  ");

Input string with inappropriate symbols
Float.parseFloat("1,234");

Input string with non-numeric data
Integer.parseInt("Twenty Two");

Alphanumeric input string
Integer.parseInt("Twenty 2");

Input string exceeding the range of the target data type
Integer.parseInt("12345678901");

Mismatch of data type between input string and the target data type
Integer.parseInt("12.34");
 */
