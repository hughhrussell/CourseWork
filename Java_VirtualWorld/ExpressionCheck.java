/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 *
 * @author Hugh Russell
 */


public class ExpressionCheck {

    
    //String to hold a lack of data entry
    String noentry = "[no entry]";
    
    //A method for testing regular expressions involving letters from A-Z
    //which allows both upper- and lowercase letters. It also gets a new entry
    //if the original is wrong. It does allow for spaces since some names have
    //them and it is also intended to check entries that could have multiple words.
    public String isEnglish (String test) {
 
        
        if (test.matches("[a-zA-Z ]*") == false && !test.equals(noentry)) {
            test = "[entry invalid]";
        }
        return test;
        }
    
    //Below is a method to test for alpha numerical characters and no spaces
    public String isAlphaNumeric (String test) {

        
        if (test.matches("[a-zA-Z0-9 ]*") == false && !test.equals(noentry)) {
            test = "[entry invalid]";
        }
        return test;
        }
    
    //isNumberic will test to see if only numbers were entered and allows spaces
    public String isNumeric (String test) {

        
        if (test.matches("[0-9]*") == false && !test.equals(noentry)) {
            test = "[entry invalid]";
        }
        return test;
        }
        
}
