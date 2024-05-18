
/*
    1.Write a Java program to append the specified element to the end of a HashSet.

    [Hint:Add elements in the Set using add() method]

    Expected Output

    2.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from

    stack and display it.
*/


//Author : Manmohan

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class SetAndStack {
    public static void main(String[] args) {
        // question1();

        question2();
    }

    private static void question1() {
        // Creating a HashSet
        HashSet<String> hs = new HashSet<String>();

        // Adding elements to the HashSet
        hs.add("one");
        hs.add("two");
        hs.add("Three");

        // Displaying the original HashSet
        System.out.println("Original HashSet : " + hs);

        // Adding a new element to the HashSet
        hs.add("last");
        System.out.println("After adding 'last':\nHashSet : " + hs);
    }

    private static void question2() {
        // Creating a Stack
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements to the Stack :");

        // Adding 10 elements to the Stack
        for (int i = 0; i < 10; i++) {
            st.add(sc.nextInt());
        }

        // Displaying the Stack
        System.out.println("Stack Contains : \n" + st);

        // Removing 4 elements from the Stack
        for (int i = 0; i < 4; i++) {
            st.pop();
        }

        // Displaying the Stack after removing 4 elements
        System.out.println("Stack after removing 4 elements :\n" + st);

        sc.close(); // Closing the Scanner
    }
}
//OUTPUT

/*------------2---------------
 * Enter 10 elements to the Stack : 
 * 1 2 3 4 5 6 7 8 9 10 
 * Stack Contains : [1, 2,3, 4, 5, 6, 7, 8, 9, 10] 
 * Stack after removing 4 elements : [1, 2, 3, 4, 5, 6]
 * 
 * 
 * -----------1---------------
 * original HashSet : [one, two, Three]
 * after adding last 
 * HashSet :[last, one, two, Three]
 * 
 */