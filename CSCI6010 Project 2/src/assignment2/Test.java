package assignment2;
import java.util.*;
/**
 * Assignment 2
 * 
 * (1) Design a class called Rectangle. It has the following instance variables and a constructor that takes the same four parameters.
 * 		*int x
 * 		*int y
 * 		*int width
 * 		*int height
 * 	
 * (2) Design a class called BoundingBox. It inherits Rectangle. Create a instance method called collidesWith() that takes a Rectangle as a parameter.
 * 		*boolean collidesWith(Rectangle other)
 * 		*This method returns true or false. For now, you can return either value. There is a bonus point if you can implement this correctly.
 * 
 * (3) Create another class called Test with a main method. Show that you instantiate your BoundingBox class runs.
 * 
 * (4) Bonus points (20%): demonstrate collidesWith() method returns the correct boolean value to indicate whether a BoundingBox collides with a Rectangle. Use at least five test cases.
 * 
 * @author Felix Lin
 *
 */
public class Test {

	public static void main(String[] args) {
		
		BoundingBox obj = new BoundingBox(1, 2, 3, 4); // Instantiation
				
		Rectangle test1 = new Rectangle(1, 2, 3, 4);
		test1 = obj; // Copy reference, it makes both test1 and obj have same reference
		
		Rectangle test2 = new BoundingBox(1, 2, 3, 4);
		
		Rectangle test3 = new Rectangle(2, 3, 4, 5);
		test3 = test1; // Copy reference
		
		Rectangle test4 = new BoundingBox(2, 3, 4, 5);
		
		Rectangle test5 = new Rectangle(6, 7, 8, 9);
	    
		System.out.println(obj.collidesWith(test1)); // Return true, b/c both have same reference
		System.out.println(obj.collidesWith(test2)); // Return false, b/c both have different reference
		System.out.println(obj.collidesWith(test3)); // Return true, b/c both have same reference
		System.out.println(obj.collidesWith(test4)); // Return false, b/c both have different reference
		System.out.println(obj.collidesWith(test5)); // Return false, b/c both have different reference
		
		/* Via tests, we can know when we create a new instantiation, we also create a new reference. 
		 * Each instantiation has different reference, so the method will return false. But if we assign 
		 * one object equal to another object, it's called copy reference. It will give two object have 
		 * same reference. So, that's why the method will return true.
		 * */
	}

}
