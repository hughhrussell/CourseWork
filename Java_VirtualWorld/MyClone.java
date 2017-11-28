package virtualworld;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This is the MyClone class - an object which holds names
 * @author Hugh Russell
 */
public class MyClone {
    private String _lastname; //private variable for last name or surname
    private String _firstname; //private variable for first name
    private String _faveMovieType; //private variable for favorite movie 
    private String noentry = "[no entry]";
    private String message;
    ExpressionCheck CheckEnglish = new ExpressionCheck();

    
    //contructor where all three variables are known
    public MyClone(String newFirstName, String newLastName, String newFaveMovieType) {
       setFirstName(newFirstName);
       setLastName(newLastName);
       setFaveMovieType(newFaveMovieType);
    }
    
    //Contructor where only the first and last name are known and 
    //movietype is set to unknown so we can print something other than null
    public MyClone(String newFirstName, String newLastName) {
       setFirstName(newFirstName);
       setLastName(newLastName); 
       setFaveMovieType(noentry);
    }
    
     //Contructor where only the first and last name are known and 
    //movietype is set to unknown so we can print something other than null
    public MyClone() {
       setFirstName(noentry);
       setLastName(noentry); 
       setFaveMovieType(noentry);
    }
    
    
    //Gives an introduction to the virtual world   
    public String giveIntro(){
        message = "Hello " + getFirstName() + " " + getLastName() + "! " + 
                "Welcome to the Virtual World!";
        return message;
    }
          
    //The following are the object's getters and setters for MyClone 
    public String getFirstName(){
        return _firstname;
    }
    
    public String getLastName(){
        return _lastname;
    }
    
    public void setLastName(String newLastName){
        _lastname = CheckEnglish.isEnglish(newLastName);
    }
    
    public void setFirstName(String newFirstName) {
        _firstname = CheckEnglish.isEnglish(newFirstName);
    }
    
    
    // Setter and Getter for the Favorite Movie variable
    public void setFaveMovieType(String newFaveMovieType) {
        _faveMovieType = CheckEnglish.isEnglish(newFaveMovieType);
    }
    
    public String getFaveMovieType() {
        return _faveMovieType;
    }
    

    
}
