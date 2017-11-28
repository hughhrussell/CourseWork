/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualworld;

/**
 * This class will test the constuctors, setters and getters for the Vehicle class
 * @author Hugh Russell
 */
public class VehicleTest {
    
    private String noentry = "[no entry]";
    private String invalidentry = "[entry invalid]";
    private String message = "Your vehicle is described by: "
                + "Brand Ford; "
                + "Color red; " 
                + "Model pickup; " 
                + "Doors 2; " 
                + "License 45 5sd3"; //Holds the expected return message 
                                        //for testing method in Vehicle class
    public void contructTest() {
        
        Vehicle carA = new Vehicle(); //Creates instance of Vehicle
        
        System.out.printf("This tests contructors for Vechicle Class%n"); 
        System.out.printf("First we test the empty contructor%n");
        
        System.out.printf("Brand variable: %s %n", carA.getVehicleBrand());
        System.out.printf("Color variable: %s %n", carA.getVehicleColor());
        System.out.printf("Doors variable: %s %n", carA.getVehicleDoors());
        System.out.printf("Model variable: %s %n", carA.getVehicleModel());
        System.out.printf("License variable: %s %n", carA.getVehicleLicense());
        
        if (carA.getVehicleBrand().equals(noentry) && 
                carA.getVehicleColor().equals(noentry) &&
                carA.getVehicleDoors().equals(noentry) &&
                carA.getVehicleLicense().equals(noentry) &&
                carA.getVehicleModel().equals(noentry)) {
            System.out.printf("Pass%n%n"); 
            }else {
            System.out.printf("Fail%n%n");
        }
        // Creates an instanct of Vehicle
        Vehicle carB = new Vehicle("Mazda", "Blue", "Taurus", "5", "as asd3"); 
        
        //Announcing the test to the output
        System.out.printf("This tests contructors for Vechicle Class%n"); 
        System.out.printf("First we test the contructor with all 5 variables%n");
       
        System.out.printf("Brand variable: %s %n", carB.getVehicleBrand());
        System.out.printf("Color variable: %s %n", carB.getVehicleColor());
        System.out.printf("Doors variable: %s %n", carB.getVehicleDoors());
        System.out.printf("Model variable: %s %n", carB.getVehicleModel());
        System.out.printf("License variable: %s %n", carB.getVehicleLicense());
               
        //testing the contructor used above for all 5 variables
        if (carB.getVehicleBrand().equals("Mazda") && 
                carB.getVehicleColor().equals("Blue") &&
                carB.getVehicleDoors().equals("5") &&
                carB.getVehicleLicense().equals("as asd3") &&
                carB.getVehicleModel().equals("Taurus")) {
            System.out.printf("Pass%n%n"); 
            }else {
            System.out.printf("Fail%n%n");
        }

        // Creates an instanct of Vehicle
        Vehicle carC = new Vehicle("13 asd3"); 
        
        //Announcing the test to the output
        System.out.printf("This tests contructors for Vechicle Class%n"); 
        System.out.printf("First we test the contructor with only the "
                + "license variables%n");
       
        System.out.printf("Brand variable: %s %n", carC.getVehicleBrand());
        System.out.printf("Color variable: %s %n", carC.getVehicleColor());
        System.out.printf("Doors variable: %s %n", carC.getVehicleDoors());
        System.out.printf("Model variable: %s %n", carC.getVehicleModel());
        System.out.printf("License variable: %s %n", carC.getVehicleLicense());
               
        //testing the contructor used above for all 5 variables
        if (carC.getVehicleBrand().equals(noentry) && 
                carC.getVehicleColor().equals(noentry) &&
                carC.getVehicleDoors().equals(noentry) &&
                carC.getVehicleLicense().equals("13 asd3") &&
                carC.getVehicleModel().equals(noentry)) {
            System.out.printf("Pass%n%n"); 
            }else {
            System.out.printf("Fail%n%n");
        }        
    }
    
    public void setTest () {
        
        // creating instance for this test
        Vehicle setTester = new Vehicle();
        
        // testing setters and getters by passing varibles in by setter
        // and testing the getter for reporting the right result
        
        setTester.setVehicleBrand("Blue");
        setTester.setVehicleColor("OrangeYeah");
        setTester.setVehicleDoors("8");
        setTester.setVehicleLicense("2343 asdf3");
        setTester.setVehicleModel("Pinto");

        //Announcing the test to the output
        System.out.printf("This tests setters and getters for Vechicle Class%n"); 
        System.out.printf("First we test the method by passing varibles. %n"
                + "The variables using the get methods are: %n");
       
        System.out.printf("Brand variable: %s %n", setTester.getVehicleBrand());
        System.out.printf("Color variable: %s %n", setTester.getVehicleColor());
        System.out.printf("Doors variable: %s %n", setTester.getVehicleDoors());
        System.out.printf("Model variable: %s %n", setTester.getVehicleModel());
        System.out.printf("License variable: %s %n", setTester.getVehicleLicense());
             
        if (setTester.getVehicleBrand().equals("Blue") &&
                setTester.getVehicleColor().equals("OrangeYeah") &&
                setTester.getVehicleDoors().equals("8") &&
                setTester.getVehicleLicense().equals("2343 asdf3") &&
                setTester.getVehicleModel().equals("Pinto")) {
            System.out.printf("Pass: Setters and Getters %n %n");
        } else {
            System.out.printf("Fail: Setters and Getters %n %n");
        }
    
          
        // Now we will set the variables to invalid entries and check those
        
        // testing setters and getters by passing varibles in by setter
        // and testing the getter for reporting the right result using 
        // wrong entrys
        
        setTester.setVehicleBrand("123456");
        setTester.setVehicleColor("....$#@#");
        setTester.setVehicleDoors("lkajsdf");
        setTester.setVehicleLicense("#!..");
        setTester.setVehicleModel("098098$");

        //Announcing the test to the output
        System.out.printf("This tests setters and getters for Vechicle Class%n");
        System.out.printf("Do they capture invalid entries? %n");
        System.out.printf("First we test the method by passing varibles. %n"
                + "The variables using the get methods are: %n");
       
        System.out.printf("Brand variable: %s %n", setTester.getVehicleBrand());
        System.out.printf("Color variable: %s %n", setTester.getVehicleColor());
        System.out.printf("Doors variable: %s %n", setTester.getVehicleDoors());
        System.out.printf("Model variable: %s %n", setTester.getVehicleModel());
        System.out.printf("License variable: %s %n", setTester.getVehicleLicense());
             
        if (setTester.getVehicleBrand().equals(invalidentry) &&
                setTester.getVehicleColor().equals(invalidentry) &&
                setTester.getVehicleDoors().equals(invalidentry) &&
                setTester.getVehicleLicense().equals(invalidentry) &&
                setTester.getVehicleModel().equals(invalidentry)) {
            System.out.printf("Pass: Setters and Getters %n %n");
        } else {
            System.out.printf("Fail: Setters and Getters %n %n");
        }     
    }
    
    // Testing the vehicle method which returns a message
    public void methodTester() {
        

        
        Vehicle methodTests = new Vehicle();
        
        methodTests.setVehicleBrand("Ford");
        methodTests.setVehicleColor("red");
        methodTests.setVehicleDoors("2");
        methodTests.setVehicleLicense("45 5sd3");
        methodTests.setVehicleModel("pickup");
        
        //Announcing the test to the output
        System.out.printf("This tests the printvehiclesummary method in the Vechicle Class%n"); 
        System.out.printf("First we test the method by passing varibles. %n"
                + "The variables using the get methods are: %n");
        // Printing what is in the getters in case troubleshooting is necessary
        System.out.printf("Brand variable: %s %n", methodTests.getVehicleBrand());
        System.out.printf("Color variable: %s %n", methodTests.getVehicleColor());
        System.out.printf("Doors variable: %s %n", methodTests.getVehicleDoors());
        System.out.printf("Model variable: %s %n", methodTests.getVehicleModel());
        System.out.printf("License variable: %s %n", methodTests.getVehicleLicense());
        
        // This verifies that the setters and getters are recording variables
        // correctly.
        if (methodTests.getVehicleBrand().equals("Ford") &&
                methodTests.getVehicleColor().equals("red") &&
                methodTests.getVehicleDoors().equals("2") &&
                methodTests.getVehicleLicense().equals("45 5sd3") &&
                methodTests.getVehicleModel().equals("pickup")) {
            System.out.printf("Pass: method print Vehicle Summary %n %n");
        } else {
            System.out.printf("Fail: method print Vehicle Summary %n %n");
        }        
        
        
    }
        
        

    
    
}
