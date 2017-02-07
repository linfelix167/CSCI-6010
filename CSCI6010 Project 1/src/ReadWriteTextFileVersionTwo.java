import java.io.*;
import java.util.*;
/**
 * CSCI 6010 Assignment 1
 * 
 * Version 2
 * 
 * This is a experiment, I just want to try another way to write, read and copy file.
 * 
 * @author Felix 
 *
 */
public class ReadWriteTextFileVersionTwo {

	public static void main(String[] args) {
		
		int numFriends;  // Number of friends
		String friendName;    // Friend's name
		
		// Create a Scanner object for keyboard input.
		Scanner in = new Scanner(System.in);
		
		// Get the number of friends.
	    System.out.print("How many friends do you have? ");
	    numFriends = in.nextInt();
	    
	   // Consume the remaining newline character.
	   in.nextLine();
	      
	    //Create the file
		try{
			  PrintWriter writer = new PrintWriter("myInput.txt");
			
			  // Get data and write it to the file.
		      for (int i = 1; i <= numFriends; i++)
		      {
		         // Get the name of a friend.
		         System.out.print("Enter the name of friend " +
		                          "number " + i + ": ");
		         friendName = in.nextLine();

		         // Write the name to the file.
		         writer.println(friendName);
		      }
			
		      writer.close();
		      
		      // Read file
		      File file1 = new File("myInput.txt");
			  Scanner inputFile = new Scanner(file1);
			  
			  // Copy file
			  PrintWriter writer2 = new PrintWriter("myOutput.txt");
			  
			  // Read lines from the file until no more are left.
		      while (inputFile.hasNext())
		      {
		         String friend = inputFile.nextLine();
		         System.out.println(friend);
		         
		         // Write myInput.txt contents to myOutput.txt
		         writer2.println(friend);
		      }
		      // Close the file.
		      inputFile.close();
		      
		      writer2.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
