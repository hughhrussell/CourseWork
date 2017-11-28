/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

import java.util.Scanner;

/**
 * This is designed to provide a menu for interactions
 * @author Hugh Russell
 */
public class Menu {
    

    public void chooser(){   
        System.out.printf("This is the Virtual World%n");

        String worldchoice = getChoice();
       
        if (worldchoice.equals("1")) {
           runHughsWorld();
        }
        if (worldchoice.equals("2")){
           testMethod(); 
        }

       
       
       
    }   
    //method to grab user choice to allow for recursion   
    public String getChoice(){
       System.out.printf("Would you like to run Hugh's Virtual World (Type 1) %n"
               + "or the Tester (Type 2)?: ");
       
        //Create a scanner object
       Scanner scan = new Scanner(System.in);
       String worldchoice = scan.nextLine();
       
       if (worldchoice.equals("1")) {
           return worldchoice;
       } if (worldchoice.equals("2")){
           return worldchoice; 
       } else {
           return getChoice();
       }     
      }
    
    public void runHughsWorld() {
        String newfirstname = "Hugh";
        String newlastname = "Russell";
        String newfaveMovieType = "ScienceFiction";
        String messagereturned;
        String vehiclebrand = "Ford";
        String vehiclecolor = "blue";
        String vehiclemodel = "Focus";
        String vehicledoors = "5";
        String vehiclelicense = "TAR D15";
       
        String wordMessage; // variable to hold message from random message method
                           // in Shoutbox
        String randomMessage; //For storing random message from Shoutbox                   
        String vehicleSum; // Collects return statement from Vehicle class
        String cannedMessage; //For holding random message from Shoutbox
        
        
        //creating an instance of MyClone
        MyClone iclone = new MyClone(newfirstname, newlastname, newfaveMovieType);
        
        //creating an instance of vehicle
        Vehicle ivehicle = new Vehicle(vehiclebrand, vehiclecolor, vehiclemodel,
            vehicledoors, vehiclelicense);
        
        //creating an instance of shoutbox
        Shoutbox ishout = new Shoutbox();
        

        wordMessage = iclone.giveIntro(); //Gives an introduction
        
        System.out.printf("%n%s%n%n", wordMessage);
        
        vehicleSum = ivehicle.printVehicleSummary(); // Prints summary of vehicle

        //Now we will print the vehicle summary
        System.out.printf("%s%n%n", vehicleSum);
        
        randomMessage = ishout.ShoutOutRandomMessage();
        
        System.out.printf("%nHere is your random message: %n%s%n", randomMessage);
        
        cannedMessage = ishout.shoutOutCannedMessage();
        
        System.out.printf("%nHere is your Canned Message: %s%n", cannedMessage);        
    }
    
    
    public void testMethod(){
       //Creates instance of MyClone test class
       MyCloneTest icloneTest = new MyCloneTest(); 

       icloneTest.testContructors(); // Call to test MyClone contructors
       icloneTest.testSettersGetters(); //Call to test setters and getters
       icloneTest.testIntro(); //Call to test introduction method
       
       
       //Now we will test the Vehicle class
       //Creates an instance of VehicleTest class
       VehicleTest carTest = new VehicleTest();
       
       carTest.contructTest(); // Calls method to test constructors
       carTest.setTest(); // Tests setters and getters
       carTest.methodTester(); // Tests the printVehicleSummary method
      
       //Now we will test the ShoutBox class
       
       //Will create instance of ShoutBoxTest
       ShoutBoxTest shouttester = new ShoutBoxTest();
       
       shouttester.ShoutBoxRandomMethodTester(); //Testing randomMessage Method
       shouttester.CannedMessageTester(); //Testing canned method 

    }    
    
}
