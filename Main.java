package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
    	// Task4
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1",40,40); // Create first controller
        Controller2 c2 = new Controller2(model, "Controller 2",40,200); // Create second controller
        
        //task 2
        Controller1 c3 = new Controller1(model, "Controller 1",40,360); // Create third controller
        Controller2 c4 = new Controller2(model, "Controller 2",40,520); // Create fourth controller
        
    } // main
  
} // Main
