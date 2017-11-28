 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 *This is the class containing main that will control the project Virtual World
 * @author Hugh Russell
 */



public class VirtualWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables for the project

       
       // Pulls the date and time 
       CalendarAndTime.date();
       
       //Creating an instance of the menu that drives the program.
       //The menu allows the user to interact as before but also
       //gives the option of running the test classes.
       
       Menu usermenu = new Menu();
       
       //This method accepts a choice of either running the existing Virtual World
       //or a test method
       usermenu.chooser();
    }
}