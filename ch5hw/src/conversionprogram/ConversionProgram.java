package conversionprogram;
import java.util.Scanner;

public class ConversionProgram {
	
	public static void main(String [] args){
	   
	      double dist;
	      
	      Scanner keyb = new Scanner(System.in);
	      
	      System.out.print("Enter a distance in meters: ");
	      dist = keyb.nextDouble();
	      
	      while (dist < 0){
	         System.out.println("Distance can't be negative.");
	         System.out.print("Enter the distance in meters: ");
	         dist = keyb.nextDouble();
	      }
	      
	      
	      menu(dist);
	      
	      
	     }
	    
	  public static void menu(double dist){
	      
	      int sentinal = 0;
	      String choice;
	      
	      do {
	         System.out.println("1. Convert to kilometers");
	         System.out.println("2. Convert to inches");
	         System.out.println("3. Convert to feet");
	         System.out.println("4. Quit the program");
	         
	         Scanner keyb = new Scanner(System.in);
	         System.out.print("\nEnter your choice: ");
	         choice = keyb.next();
	         
	         if (choice.equals("1")){
	            showKilometers(dist);
	         }
	         else if(choice.equals("2")){
	            showInches(dist);
	         }
	         else if(choice.equals("3")){
	            showFeet(dist);
	         }
	         else if(choice.equals("4")){
	            System.out.println("Bye!");
	            sentinal = -99;
	         }
	         else {
	            System.out.println("invalid choice");
	         }
	      }
	      while (sentinal != -99);
	  
	  }
	  
	  
	  public static void showKilometers(double dist){
	      
	      final double KILO_CONVERSION = 0.001;
	      double kilometers;
	      
	      kilometers = dist * KILO_CONVERSION;
	      
	      System.out.printf("%,.2f meters is %,.2f kilometers%n%n" , dist, kilometers);
	  }
	  
	  
	  public static void showInches(double dist){
	  
	      final double INCHES_CONVERSION = 39.37;
	      double inches;
	      
	      inches = dist * INCHES_CONVERSION;
	      
	      System.out.printf("%,.2f meters is %,.2f inches%n%n" , dist, inches);
	   
	  }  
	  
	  
	  
	  public static void showFeet(double dist){
	  
	      final double FEET_CONVERSION = 3.281;
	      double feet;
	      
	      feet = dist * FEET_CONVERSION;
	      
	      System.out.printf("%,.2f meters is %,.2f feet%n%n" , dist, feet);
	  }
}