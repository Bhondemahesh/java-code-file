import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Date
{
	public static void main(String[] args) {
	    // Get user input: yyyy-mm-dd
	    Scanner scnr = new Scanner(System.in); 

	    // Store the input as string
	    String dob = scnr.next(); 
	    
	    // Convert string input to date format
	   LocalDate dateOfBirth = LocalDate.parse(dob); 

	   // Get todays date: yyyy-mm-dd
	   LocalDate currDate = LocalDate.now(); 

	  // Get the difference between the two dates
	  Period period = Period.between(currDate, dateOfBirth); 

	  // Isolate the number of years to get proper age format
	  int age  = Math.abs(period.getYears()); 
        
          System.out.println("Date of Birth: " + dob); // Print original input
          System.out.println("Today's Date: " + currDate); // Print today's date
          System.out.println("You are " + age + " years old!"); // Print their age
	}


}
