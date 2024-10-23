/* Name:catherine logo 
 * section:CST8116
 * professor name: Narges Tabar
 * Due date: june 9 2024
 * Description: lab assignment01
 */  
/* This class calculate the volume of the donut
 * from the user (height, innerRadius and outerRadius) in cm.
 * Then calculate the volume by using the Java API Math class to obtain a value for PI,
 *  and to calculate the power of a value raised to a power
 *  the program should output the volume formatted to 2 decimal places 
 */

import java.util.Scanner;

   public class  DonutMaker {
	   public static void main (String[] args) {
       Scanner input = new Scanner (System.in);
       
    // prompt the user of the height of the donut 
      System.out.print("Enter the height of the donut in cm:");
      double height = input.nextDouble();
       
    // prompt the user for the innerRadius of the donut
       System.out.print("Enter the innerRadius of the donut in cm:");
       double innerRadius = input.nextDouble();
       
    // prompt the user for the outerRadius of the donut
       System.out.print("Enter the outerRadius of the donut in cm:");
       double outerRadius = input.nextDouble();
       
    // calculate the volume of the donut
       Donut donut = new Donut(height, innerRadius, outerRadius);
       double volume = donut.calculateVolume();
       
      System.out.printf("Volume of Donut is: %.2f cm^3\n",volume);
      System.out.println("program by catherine logo");
	   }
   }
	 
	 
 


 

