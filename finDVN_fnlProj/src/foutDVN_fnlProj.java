import java.util.Scanner;        // Scanner
import java.util.Base64;         //Base64 Binary Group
import java.io.*;                // All Input/Output Stream

public class foutDVN_fnlProj {
	
	public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Please Enter the Filename");    //Enter the File of the Encoded Base64 Binary text
	
	File FileOut=new File (in.nextLine()+ ".DVN");      // Open the File of with the File extension of the Binary  
	in = new Scanner (FileOut);                        // Make Access in Scanner to Read the File 
	
	byte[] decodes = Base64.getDecoder().decode(in.next());     //Base64 Decoder output from the Scanner
	
	String decodedStr = new String(decodes);           // Converts the decoder output from the Base64 Decoder output into a String format
	System.out.println("\n"+decodedStr);                    // Prints the decodedStr 
	
	}
}