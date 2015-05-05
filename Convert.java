import java.util.Scanner;
    
   /* This program converts km to miles. */
    
   public class Convert
   {
      public static void main(String [] args)
      {
    
     // declaration of the variables
     double km, miles;
     String measure;
     Boolean KMorMI;
     Boolean correct = false;
     
     // create a Scanner
     Scanner input;
     input = new Scanner(System.in);
    
     while (!correct) //if correct is true, the user entered either 'km' or 'mi' correctly
     {
	     // Enter kilometers or miles
	     System.out.print("Please enter either 'km' or 'mi': ");           
	     measure = input.toString(); // Read in input from terminal
	                                  // and stores it in the variable "km"      
	     if (measure == "km"){
	    	 KMorMI = false; //false will mean kilometers
	    	 correct = true;
	     }
	     else if (measure == "mi"){
	    	 KMorMI = true; //true will mean miles
	    	 correct = true;
	     }
	     else
	    	 System.out.println("You didn't enter 'km' or 'mi'.");
     
     } //Ends while loop
     
     // Enter distance in kilometers or miles
     System.out.print("Please enter a distance in" + measure + ": ");  
     
     if (measure == "km"){
     km = input.nextDouble(); // Read in input from terminal
                                  // and stores it in the variable "km"  
     
     // Calculate distance in miles
     miles = 0.62 * km;
     
     // print out the result
     System.out.print(km);
     System.out.print(" kilometers = ");
     System.out.print(miles);
     System.out.println(" miles");
     
     input.close();
      }
    
   }