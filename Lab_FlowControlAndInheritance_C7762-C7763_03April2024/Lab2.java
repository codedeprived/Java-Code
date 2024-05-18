/*
 * Attempt any two question:-

1.  Write a program to check whether a number is a 
Strong number or not. Strong number is a special number 
whose sum of factorial of digits is equal to the original 
number. For example: 145 is a strong number. 
Since, 1! + 4! + 5! = 145.

2.Write a program to check leap year using if else. 
How to check whether a given year is a leap year or not. 
[Hint:Take an input of any number. Store it in some variable say year. 
If a year is exactly divisible by 4 and not divisible by 100, 
then it is a leap year. Or if a year is exactly divisible by 400 then it is a leap year.]
 */

/*
 * Author: Manmohan
 */

import java.util.Scanner; // Importing Scanner class to read input from the user

public class Lab2 {
    public static void main(String[] args) {

        // Question 1: Check for Strong Number
        checkStrong();

        // Question 2: Check for Leap Year
        checkLeapYear();
    }

    // Function to check if a number is a Strong number
    static void checkStrong() {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input
        System.out.println("Enter the number : ");
        int num = sc.nextInt(); // Reading the number from the user
        int factorialSum = 0; // Initializing variable to store the sum of factorials of digits
        int temp = num; // Creating a copy of the number

        // Loop to calculate the sum of factorials of digits
        while (temp > 0) {
            int remainder = 0;
            remainder = temp % 10; // Extracting the rightmost digit

            int factorial = 1;
            temp /= 10; // Removing the rightmost digit
            for (int i = remainder; i > 0; i--) {
                factorial *= i; // Calculating factorial of the digit
            }
            factorialSum += factorial; // Adding factorial to the sum
        }

        // Checking if the sum of factorials is equal to the original number
        if (factorialSum == num)
            System.out.println(num + " is a Strong number ");
        else
            System.out.println(num + " is not a Strong number");
    }

    // Function to check if a year is a Leap Year
    static void checkLeapYear() {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input
        System.out.println("Enter the year to check Leap or not : ");
        int year = sc.nextInt(); // Reading the year from the user

        // Checking if the year is a leap year
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Year is a leap year ");
        } else {
            System.out.println(year + " Year is not a leap year ");
        }
    }
}

//OUTPUT:
/*
 * 
 *  Enter the number : 
 *  145
 *  145 is a Strong number 
 *  Enter the year to check Leap or not : 
 *  2004
 *  2004 Year is a leap year 
*/