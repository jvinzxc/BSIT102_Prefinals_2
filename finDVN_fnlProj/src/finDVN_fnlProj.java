import java.util.Scanner;                               
import java.util.Base64;
import java.util.ArrayList; 
import java.io.*;
 
public class finDVN_fnlProj {
       
    public static void main(String[] args) throws IOException  {
    	Scanner sc = new Scanner(System.in);
		ArrayList<String> word = new ArrayList<>();                                       //An ArrayList that accepts Strings 
		Boolean Running = true;                                                          // A Bool that has a default value of true
		
		System.out.println("Please Enter Words");                                        //Enter the Words 
		
		while (Running == true) {                                                        // sets the while of the bool to true
			
			String letter =  sc.next();                                                  //Shows input while the bool is true
				
			  if (!letter.equals(":q")) {                           					 // if the user inputs a :q 
				  byte[] encodes = Base64.getEncoder().encode((letter + "\n").getBytes());      // Base64 Encoder that encodes any words the user inputs 
				  word.add(new String(encodes));                                                // Put the Encoded words into an array that can be used for multiple inputs
				 
			  }
			  else {                                                                         
				  Running = false;                                                        // the bool sets to false state after input :q
				  System.out.println("Enter your Filename");                              // Enter the Set Filename  
				  String Filename = sc.next();                                            // The Input to type the Filename
				  Writer files = new FileWriter(Filename +".DVN");                         // To save the Input file into a file with an extension
					 
				  for(String a: word)                                                     // a for loop for ArrayList 
			    	{
			    		files.write(a);                                                   // Saves ArrayList into the File with an extension
			    	}
			    	
			      	files.close();                                                        //Closes the File 
			      	sc.close();                                                           //Closes the Scanner
				  }
				
				  
			  }
			  
			
			
		  }
		
		
		
	}