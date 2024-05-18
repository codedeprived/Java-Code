/*
    Questions: 
    1.Write a Java program to associate the specified value with the 
      specified key in a HashMap.

    2.Write a Java program to check whether a HashMap contains key-value
      mappings (empty) or not.

*/

//Author : Manmohan
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        question1(); // Call question1 method
        question2(); // Call question2 method
    }

    // Method to demonstrate associating values with keys in a HashMap
    private static void question1() {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Associate a value with a key
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);
    }

    // Method to demonstrate checking if a HashMap is empty
    private static void question2() {
        // Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Check if the HashMap is empty
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }

        // Add some key-value mappings
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Check again
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            // Display the HashMap contents if not empty
            System.out.println("HashMap is not empty" + " contains: " + hashMap);
        }
    }
}

//OUTPUT:

/*
------------------1------------------
    HashMap: {1=One, 2=Two, 3=Three}

------------------2-------------------
    HashMap is empty
    HashMap is not empty contains : {1=One, 2=Two}

*/

