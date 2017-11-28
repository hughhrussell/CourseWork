/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 * This class is designed to test the MyClone class
 * @author Hugh Russell
 */
public class MyCloneTest {
    
    private String message = "Hello James de Wilson! Welcome to the Virtual World!";
    private String noentry = "[no entry]";
    private String invalidentry = "[invalid entry]";
    
    public void testContructors() {
    // Creates an empty intance of MyClone and tests setters and getters
    
    MyClone testA = new MyClone();
    
    // Prints variables from MyClone for review
    System.out.println("%nThese are the variables from the empty contructor");
    System.out.printf("Lastname: %s %n", testA.getLastName());
    System.out.printf("Fistname: %s %n", testA.getFirstName());
    System.out.printf("Favorite Movie: %s %n", testA.getFaveMovieType());
    
    //Prints assessment of the contructor based on variables
    if (testA.getFirstName().equals(noentry) && testA.getLastName().equals(noentry) &&
            testA.getFaveMovieType().equals(noentry)) {
        System.out.printf("Contructor Passed %n %n");
        } else {
        System.out.printf("Contructor didn't work %n %n");
        }

    
    MyClone testB = new MyClone("Joseph", "Dodge","horror");

    // Prints variables from MyClone for review
    System.out.println("These are the variables from the contructor"
            + " with 3 variables passed");
    System.out.printf("Lastname: %s %n", testB.getLastName());
    System.out.printf("Fistname: %s %n", testB.getFirstName());
    System.out.printf("Favorite Movie: %s %n", testB.getFaveMovieType());
    
    //Prints assessment of the contructor based on variables
    if (testB.getFirstName().equals("Joseph") && 
            testB.getLastName().equals("Dodge") &&
            testB.getFaveMovieType().equals("horror")) {
        System.out.printf("Contructor Passed %n %n");
        } else {
        System.out.printf("contructor didn't work %n %n");
        }
    
    MyClone testC = new MyClone("Robert", "James");

    // Prints variables from MyClone for review
    System.out.println("These are the variables from the contructor"
            + " with 2 variables passed");
    System.out.printf("Lastname: %s %n", testC.getLastName());
    System.out.printf("Fistname: %s %n", testC.getFirstName());
    System.out.printf("Favorite Movie: %s %n", testC.getFaveMovieType());
    
    //Prints assessment of the contructor based on variables
    if (testC.getFirstName().equals("Robert") && 
            testC.getLastName().equals("James") &&
            testC.getFaveMovieType().equals(noentry)) {
        System.out.printf("Contructor Passed %n %n");
        } else {
        System.out.printf("contructor didn't work %n %n");
        } 
       
    }    
    
    public void testSettersGetters() {
        
        // Creates Instance of myclone for testing and the instance is
        // empty variables are set to noentry
        MyClone setTest = new MyClone();
        
        // Displaying what we are doing
        System.out.printf("Will be testing MyClone setters and getters %n");
        
        // Will verity Lastname setters and getters
        setTest.setLastName("Test Last");
        setTest.setFirstName("Test First");
        setTest.setFaveMovieType("Jazz");
        
        if (setTest.getLastName().equals("Test Last") && 
                setTest.getFirstName().equals("Test First") &&
                setTest.getFaveMovieType().equals("Jazz")) {
            System.out.printf("Setters and Getters Passed %n %n");
            } else {
            System.out.printf("Setters and Getters Failed %n %n");
                    
        }
    }
    
    // Testing Introduction method now
    
    public void testIntro() {
        MyClone testIntro = new MyClone("James", "de Wilson"); // Instance of class for this test
        
        System.out.printf("Now we will test the introduction method from MyClone %n");
        System.out.printf("This is the message created: %s%n", message);
        //Comparison statement so we know the outcome
        if (testIntro.giveIntro().equals(message)){
            System.out.printf("The intro method Passed %n %n"); 
        } else {
            System.out.printf("The intro method Failed %n %n");
        }
    }
    
}
