/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.util.Scanner;

/**
 *
 * @author Christina
 */
 public class CircleApp
 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        // display a welcome message
        System.out.println("Welcome to the Circle Tester \n");
        
        // create scanner object for keyboard input
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y"))
        {
            // ask the user to input circle radius
            double radius = Validator.getDouble(sc,
                "Enter radius: ", 0, 1000);
            
            System.out.println();

            //Create the circle object and set its fields
            Circle c1 = new Circle();
            c1.setRadius(radius);
            
            //get the circumference and area data
            c1.getCircumference();
            c1.getArea();
                                
            // Display circle information
            System.out.println("Area is " + c1.getFormattedArea());
            System.out.println("Circumference is " + c1.getFormattedCircumference());

            // see if the user wants to continue
            choice = Validator.getString(sc, "Continue? (y/n): ", "y", "n");
            System.out.println();
        }
        
        int count = Circle.getObjectCount();
        System.out.println("Goodbye. You created " + count + " Circle object(s).");
    }
}
