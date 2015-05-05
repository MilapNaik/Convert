import java.util.Scanner;
    
   /* This program converts km to miles. */
    
   public class Convert
   {
      public static void main(String [] args)
      {
    
     // Declaration of the variables
     double km = 0; 
     double miles = 0;
     String measure = "";
     Boolean correct = false;
     
     // create a Scanner
     Scanner input, distance;
     input = new Scanner(System.in);
     distance = new Scanner(System.in);
    
     while (!correct) //If correct is true, the user entered either 'km' or 'mi' correctly
     {
	     // Enter kilometers or miles
	     System.out.print("Please enter either 'km' or 'mi': ");           
	     measure = input.next(); // Read in input from terminal
	                                  // and stores it in the variable "km"  
	     
	     if (measure.equals("km") || measure.equals("mi"))
	    	 correct = true;
	    else{
	    	 System.out.println("You didn't enter 'km' or 'mi'.");
	    	 correct = false;
	     }
	     
     } //Ends while loop
     
     // Enter distance in kilometers or miles
     System.out.print("Please enter a distance in " + measure + ": ");  
     
     if (measure.equals("km")){
	     km = distance.nextDouble(); // Read in input from terminal
	                                  // and stores it in the variable "km"  
	     
	     // Calculate distance in miles
	     miles = 0.621371 * km;
	     // Print out the result
	     System.out.print(km);
	     System.out.print(" kilometers = ");
	     System.out.print(miles);
	     System.out.println(" miles");
     }
     else{
    	miles = distance.nextDouble(); // Read in input from terminal
        // and stores it in the variable "km"  
	     
     	// Calculate distance in miles
     	km = 1.60934 * miles;  
        // Print out the result
        System.out.print(miles);
        System.out.print(" miles = ");
        System.out.print(km);
        System.out.println(" kilomers");
      }
     
     //Close scanners to prevent leaks
     input.close();
     distance.close();
      }
    
   }