/*
    1.Write a program to reverse a given List of strings.



    2.Write a Java program that calculates the sum of all even numbers
      present in an ArrayList of integers.

*/

//Author : Manmohan 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1 - Reverse List of Strings
        // reverseListOfStrings(sc);

        // Question 2 - Calculate sum of all even numbers present in an ArrayList of integers
        calculateSumOfEven(sc);

        sc.close(); // Close the scanner to prevent resource leak
    }

    /**
     * Calculates the sum of all even numbers present in an ArrayList of integers.
     *
     */
    private static void calculateSumOfEven(Scanner sc) {
        System.out.println("Enter the size of the ArrayList: ");
        int size = sc.nextInt();

        List<Integer> array = new ArrayList<Integer>(size);
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            array.add(temp);
            if (temp % 2 == 0) {
                sum += temp;
            }
        }
        System.out.println("Given array: ");
        System.out.println(array);
        System.out.println("Sum of even numbers: " + sum);
    }

    /**
     * Reverses a given List of Strings.
     * 
     */
    private static void reverseListOfStrings(Scanner sc) {
        System.out.println("Enter the size of the List of Strings: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline character

        List<String> strings = new ArrayList<String>(size);

        for (int i = 0; i < size; i++) {
            strings.add(sc.nextLine());
        }

        System.out.println("\nGiven List of String: ");
        System.out.println(strings);

        for (int i = size - 1; i >= 0; i--) {
            String original = strings.get(i);
            String reversed = new StringBuilder(original).reverse().toString();
            strings.set(i, reversed);
        }

        System.out.println("\nReversed List of String:");
        System.out.println(strings);
    }
}
//OUTPUT: 
/*
----------------1------------------
    Enter the size of the List of Strings : 
    5
    This is the test case
    one 
    two
    three
    four

Given List of String : 
[, This is the test case, one , two, three, four]

Reversed List of String :
[esac tset eht si sihT,  eno, owt, eerht, ruof]


----------------2------------------
    Enter the size of the ArrayList : 
    5
    1 2 3 4 5
    Given array : 
    [1, 2, 3, 4, 5]
    sum of even numbers : 6
    
    
*/


