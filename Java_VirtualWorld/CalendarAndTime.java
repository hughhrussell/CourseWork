/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hugh Russell
 */
public class CalendarAndTime {
    


public static void date() {
    
    // Creating an instance of Date so we can grab date information
    Date datenow = new Date();
    
    //Creating the object dateFormating with a specific format for output
    SimpleDateFormat dateFormatting = new SimpleDateFormat("EEEE, MMMM d, yyyy");
    
    //This will print out the day and date for the day in question
    System.out.printf("Today is %s %n %n", dateFormatting.format(datenow));
    
}



}
