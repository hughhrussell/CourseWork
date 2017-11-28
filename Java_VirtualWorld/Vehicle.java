 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 * This class will hold details about a vehicle including its brand (Toyota, etc),
 * color, model (Yaris, etc), number of doors (4, 5, etc) and license plate.
 * @author Hugh Russell
 */
public class Vehicle {
    
    
    // private variables for class Vehicle
    private String _vehiclebrand; // vehicle brand (Toyota, etc)
    private String _vehiclecolor; // vehicle color
    private String _vehiclemodel; // vehicle model
    private String _vehicledoors; // number of vehicle doors
    private String _vehiclelicense; // license plate number
    private String noentry = "[no entry]"; // variable to use if no data is available
    private String message;
    
    //Contructor for passing all information in and the associated setters
    public Vehicle (String vehiclebrand, String vehiclecolor, String vehiclemodel,
            String vehicledoors, String vehiclelicense) {
        setVehicleBrand(vehiclebrand);
        setVehicleColor(vehiclecolor);
        setVehicleModel(vehiclemodel);
        setVehicleDoors(vehicledoors);
        setVehicleLicense(vehiclelicense);
    }
    
    //Contructor for passing only license plate
    public Vehicle (String vehiclelicense) {
        setVehicleBrand(noentry);
        setVehicleColor(noentry);
        setVehicleModel(noentry);
        setVehicleDoors(noentry);        
        setVehicleLicense(vehiclelicense);
    }
    
    //An empty constructor in case we want to generate a vehicle object with 
    //no associated details. This auto fills the variables with [no entry] to 
    //inform the user that no data was entered for the variables.
    public Vehicle () {
        setVehicleBrand(noentry);
        setVehicleColor(noentry);
        setVehicleModel(noentry);
        setVehicleDoors(noentry);        
        setVehicleLicense(noentry);
    }        
    
    
    //This method prints the details of our vehicle
    public String printVehicleSummary(){
        
        //Prints out details of our vehicle
        return message = "Your vehicle is described by: "
                + "Brand "+ _vehiclebrand 
                + "; Color " + _vehiclecolor
                + "; Model " + _vehiclemodel
                + "; Doors " + _vehicledoors
                + "; License " + _vehiclelicense;
    }
    
    //Creating an instance of ExpressionCheck
    
    ExpressionCheck gottaCheck = new ExpressionCheck();
    
    
    // Setters and getters for private variables follow   
    public String getVehicleBrand(){
        return _vehiclebrand;
    }
    
    public void setVehicleBrand(String newVehicleBrand){
        _vehiclebrand = gottaCheck.isEnglish(newVehicleBrand);
    }    

    public String getVehicleColor(){
        return _vehiclecolor;
    }
    
    public void setVehicleColor(String newVehicleColor){
        _vehiclecolor = gottaCheck.isEnglish(newVehicleColor);
    }
    
    public String getVehicleModel(){
        return _vehiclemodel;
    }
    
    public void setVehicleModel(String newVehicleModel){
        _vehiclemodel = gottaCheck.isAlphaNumeric(newVehicleModel);
    }
    
    public String getVehicleDoors(){
        return _vehicledoors;
    }
    
    public void setVehicleDoors(String newVehicleDoors){
        _vehicledoors = gottaCheck.isNumeric(newVehicleDoors);
    }

    public String getVehicleLicense(){
        return _vehiclelicense;
    }
    
    public void setVehicleLicense(String newVehicleLicense){
        _vehiclelicense = gottaCheck.isAlphaNumeric(newVehicleLicense);
        }
} 

