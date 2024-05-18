/*
1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. 
Subclasses extend the superclass and override its location() and famousFor() method.
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.
As it refers to the base class object and the base class method overrides the superclass method;
the base class method is invoked at runtime. ii.call the location() and famousFor() method by the
all subclass’,and print accordingly.

---------------------------------------------------------------------

2.Write a Java program that demonstrates method overriding by creating a superclass
called Animal and two subclasses called Dog and Cat. ● The Animal class should have a method called
makeSound(), which simply prints "The animal makes a sound." ● The Dog and Cat classes should override
this method to print "TheCat/The dog meows/barks" respectively. ● The program should allow the user to create and 
display objects of each class.

-----------------------------------------------------------------------

*/


/*
Author : Manmohan 
*/

// Abstract class representing hill stations
abstract class HillStations {

    // Abstract methods to be implemented by subclasses
    public abstract String getLocation();

    public abstract String famousFor();

    public abstract String HillStationName();
}

// Concrete subclass representing Manali
class Manali extends HillStations {

    @Override
    public String getLocation() {
        return " Himachal Pradesh";
    }

    @Override
    public String famousFor() {
        return "Nature , Beautiful Mountains , Adventure Sports";
    }

    @Override
    public String HillStationName() {
        return "Manali";
    }

}

// Concrete subclass representing Mussoorie
class Mussoorie extends HillStations {

    @Override
    public String getLocation() {

        return "Dehradun";
    }

    @Override
    public String famousFor() {

        return "Resorts , holiday homes ,  Beautiful waterfalls";
    }

    @Override
    public String HillStationName() {
        return "mussoorie";
    }

}

// Concrete subclass representing Gulmarg
class Gulmarg extends HillStations {

    @Override
    public String getLocation() {

        return "Jammu and Kashmir";
    }

    @Override
    public String famousFor() {

        return "Highest Golf course , Temples , Beautiful snow ";
    }

    @Override
    public String HillStationName() {

        return "Gulmarg";
    }
}

/* QUESTION #2 
//==============================================================================
*/

// Abstract superclass Animal
abstract class Animal {
    // Abstract method makeSound
    public abstract void makeSound();
}

// Subclass Dog
class Dog extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}


public class Test {

    public static void main(String[] args) {

        // Create an array of HillStations objects
        HillStations hillStations[] = new HillStations[3];

        // Initialize array elements with instances of subclasses
        hillStations[0] = new Manali();
        hillStations[1] = new Mussoorie();
        hillStations[2] = new Gulmarg();
        
        System.out.println("1st Question OUTPUT");
        // Loop through the array and print information about each hill station
        for (HillStations hs : hillStations) {
            System.out.println("HillStation " + hs.HillStationName());
            System.out.println("Famours For " + hs.famousFor());
            System.out.println("Location : " + hs.getLocation());
            System.out.println("----------------------------------------");
        }
        
        //2nd Program 
        System.out.println("2nd Question OUTPUT ");
        // Create an array of Animal objects
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Display the sound of each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}

/*OUTPUT*/

/*

1st Question OUTPUT
HillStation Manali
Famours For Nature , Beautiful Mountains , Adventure Sports
Location :  Himachal Pradesh
----------------------------------------
HillStation mussoorie
Famours For Resorts , holiday homes ,  Beautiful waterfalls
Location : Dehradun
----------------------------------------
HillStation Gulmarg
Famours For Highest Golf course , Temples , Beautiful snow 
Location : Jammu and Kashmir
----------------------------------------

2nd Question OUTPUT 
The dog barks.
The cat meows.

*/



