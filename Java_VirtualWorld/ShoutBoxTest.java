/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 * This class will test the ShoutBox class
 * @author Hugh Russell
 */
public class ShoutBoxTest {
    
    
    public void ShoutBoxRandomMethodTester () {
        // First we will test the Random Messages method.
        // We get the return statement and make sure it is
        // different for three consecutive runs.

        // Creates instance of shoutbox
        Shoutbox shoutboxA = new Shoutbox();
        
        System.out.printf("We are testing the ShoutBox Random Message method %n");
        System.out.printf("We are going to get three random messages and compare %n");
        System.out.printf("They should not be the same.%n");
        System.out.printf("The method will produce the numbers for visual %n");
        System.out.printf("as designed in the shoutbox method%n%n");
        
        String message1 = shoutboxA.ShoutOutRandomMessage();
        String message2 = shoutboxA.ShoutOutRandomMessage();
        String message3 = shoutboxA.ShoutOutRandomMessage();



        if ((message1 != message2) && (message1 != message3) && (message2 != message3)){
            System.out.printf("%nPass: the messages are different %n %n");
        } else {
            System.out.printf("%nFail: the Messages are teh same %n %n");
        }

    }
    
    public void CannedMessageTester() {
        
        // Instructions for user. This method is reliant on user interaction
        // and so to test it this is announced and a user is instructed in how
        // to run the test.
        
        System.out.printf("This is for testing the ShoutBox Canned messages. %n");
        System.out.printf("It relies on user input. %n");
        
        System.out.printf("You will be asked to enter 10 messages. %n");
        System.out.printf("They can be anything you want. %n");
        System.out.printf("Then they will print each of them in the order you"
                + " entered them. %n");
        System.out.printf("You will need to choose a message using an integer. %n");
        System.out.printf("But before you enter an integer try letters and try %n");
        System.out.printf("numbers outside the range. These should not work and %n");
        System.out.printf("should make you keep entering input until you do it right.%n");
        System.out.printf("If this works, then the method PASSES.%n%n");
        
        // Will create the instance for testing
        Shoutbox userTest = new Shoutbox();
        
        // Next, the method will run and the user will determine the outcome
        String cannedMessage = userTest.shoutOutCannedMessage();
        
        //print the message
        System.out.printf("Your message is: %s%n", cannedMessage);
        
    }
}
