/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 * In this class, methods are produced to generate messages.
 * @author Hugh Russell
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class Shoutbox {
    // This will create a HashMap for messages
    HashMap<Integer, String> messageTable = new HashMap(); 
    
    Scanner scan = new Scanner(System.in); // creating a way to scan the input from user
    
    int choice; // Will use to document user's message choice
    int nummessages = 10; // This is used to determine the number of messages we want.
    
    // shoutOutCannedMessage is going to shout out messages that were entered
    
    public String shoutOutCannedMessage() {
        //calls method to get messages from user
        getMessages();
        
        System.out.println("Your messages are:");
        int counter = 1; // counter for determine Hashmap key
        // The for loop will print each message in the Hashmap
        for (Object key : messageTable.entrySet()) {
            System.out.printf("%d %s %n", counter, messageTable.get(counter));
            counter++; // Increments as we go 
        }
        System.out.printf("%nPlease pick a message."); // Lets user pick a message
        choice = getNumber(); // uses a method to have the user choose a message
        
        // A while loop in case the user does not enter a number between
        // 1 and 10 since we are collected 10 messages.
        while (choice <1 || choice > nummessages){
            System.out.printf("The number entered wasn't between 1 and %d. Sorry.", nummessages);
            System.out.println("Please try again.");
            choice = getNumber();
        }
        // Here, we will print out the user's choice for them to see.
        System.out.printf("You chose %d! %n", choice);  
        
        String messagePass = messageTable.get(choice);
        return messagePass;// Returns user's choice.
    }
    
    // Here we get a number and we make sure it is a number or the method
    // uses recursion and grabs it anew
    public int getNumber() {
        int counter = 0;
        Scanner scan = new Scanner(System.in); // creates scanner object
        System.out.printf("Enter an integer number between 1 and %d: ", nummessages);
        if (scan.hasNextInt()) {
            return scan.nextInt(); // returns value
        }
        return getNumber(); 
    }
    // getMessages will request 10 messages from the user and then store them
    // in messageTable
    
    public void getMessages(){
        // for loop will grab messages from the user and will do so
        // the number of times that was entered in the variable nummessages
        System.out.printf("%nNow we are doing the canned messsages.%n");
        for (int i = 1; i<=nummessages; i++) { 
            System.out.print("Please enter a message: ");
            String reader = scan.nextLine();
            messageTable.put(i, reader); // Adding message to messageTable
        }
    }
    
    public String ShoutOutRandomMessage() {
        
        String message; //Used to hold the message assembled from random words
        
        int wordtypes = 5; // Used to describe number of word types to add together
                           // to generate the message
        
        // ArrayLists used to hold subjects, objects, verbs, adjectives and adverbs
        // ArrayLists have been used in case in the future one wanted to allow user
        // input of words and allow variability in size of the list without a major
        // overhaul of the code.
        
        ArrayList<String> subjectList = new ArrayList();
        ArrayList<String> objectList = new ArrayList();
        ArrayList<String> verbList = new ArrayList();
        ArrayList<String> adjectiveList = new ArrayList();
        ArrayList<String> adverbList = new ArrayList();
        
        // Adding subjects to their list
        subjectList.add("Dog");
        subjectList.add("Cat");
        subjectList.add("Pig");
        subjectList.add("Birdie");
        subjectList.add("Kitty");
        subjectList.add("Turkey");
        
        // Adding objects to their list
        objectList.add("frisbee");
        objectList.add("bone");
        objectList.add("shoe");
        objectList.add("ball");
        objectList.add("sandal");
        objectList.add("toy");
        objectList.add("rug");
        objectList.add("sock");
        objectList.add("grass");
        
        // Adding verbs to their list
        verbList.add("plays");
        verbList.add("ignores");
        verbList.add("grabs");
        verbList.add("gnaws");
        verbList.add("tears");
        verbList.add("chases");
        verbList.add("returns");
        
        
        
        // Adding adjectives to their list
        adjectiveList.add("red");
        adjectiveList.add("blue");
        adjectiveList.add("purple");
        adjectiveList.add("old");
        adjectiveList.add("plastic");
        adjectiveList.add("goofy");
        adjectiveList.add("cyan");
        adjectiveList.add("silver");
        
        
        // Adding adverbs to their list
        adverbList.add("everywhere");
        adverbList.add("quickly");
        adverbList.add("gracefully");
        adverbList.add("skillfully");
        adverbList.add("slowly");
        adverbList.add("poorly");
        
        
        // Creating an array to store the randome numbers for generating the message
        int randomNumbers[] = new int[wordtypes];

        // Initialize Random
        Random randomGen = new Random();
        
       // Statements used to generate the random numbers. These are stored in an array which
       // is later used to produce the message.
       // While loops are presented throughtout to ensure they don't repeat the same
       // random number
       
        randomNumbers[0] = randomGen.nextInt(subjectList.size());
        randomNumbers[1] = randomGen.nextInt(verbList.size());
        
       
        while (randomNumbers[1] == randomNumbers[0]) {
            randomNumbers[1] = randomGen.nextInt(verbList.size());
        }
        
        randomNumbers[2] = randomGen.nextInt(adjectiveList.size());
        
        while (randomNumbers[2] == randomNumbers[1] || randomNumbers[2] == randomNumbers[0]) {
            randomNumbers[2] = randomGen.nextInt(adjectiveList.size());
        }
        randomNumbers[3] = randomGen.nextInt(objectList.size());
        
        while (randomNumbers[3] == randomNumbers[2] || randomNumbers[3] == randomNumbers[1]
                || randomNumbers[3] == randomNumbers[0]) {
            randomNumbers[3] = randomGen.nextInt(objectList.size());
        }
        
        randomNumbers[4] = randomGen.nextInt(adverbList.size());
        
        while (randomNumbers[4] == randomNumbers[3] || randomNumbers[4] == randomNumbers[2] 
                || randomNumbers[4] == randomNumbers[1]
                || randomNumbers[4] == randomNumbers[0]) {
            randomNumbers[4] = randomGen.nextInt(adverbList.size());
        }        
        
        //Print out the random numbers generated to check they are all different
        System.out.printf("%nThis is the random message generator. %n");
        System.out.printf("%nBelow are your random numbers that were generated. %n");
        for (int count = 1; count < (wordtypes+1); count++) {
            System.out.printf("Random number %d is %d. %n", count, randomNumbers[count-1]);
        }
        
        //Creating the message to return to the main method in VirtualWorld
        message = subjectList.get(randomNumbers[0]) + " " + verbList.get(randomNumbers[1])
                + " " + adjectiveList.get(randomNumbers[2]) + " " + objectList.get(randomNumbers[3])
                + " " + adverbList.get(randomNumbers[4]);
        
        return message; //returning message
    }
    
}

