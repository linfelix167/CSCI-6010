package assignment3;
/**
 * Assignment 3
 * 
 * Create a class, Sprite. This class has an instance variable called bbox whose type is BoundingBox we previously created. Sprite has an additional field, svg. Its type is String.
 * 
 * Create six instances of Sprite, s1, s2, s3, s4, s5 and s6. When you initialize it, make sure you specify (x,y) coordinate, width and height.
 * 
 * Detect whether any of the sprites collides with each other. If one collides with another, show that it does e.g. s1 collides with s2. s3 collides with s4.
 * 
 * Create four test cases with the Sprites in various places.
 * 
 * @author Felix
 *
 */
public class Sprite {
	
	private static BoundingBox bbox;
	private static String svg;
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	public Sprite(int x, int y, int width, int height){
		bbox = new BoundingBox(x, y, width, height);
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public static void main(String[] args){
		
		Sprite s1 = new Sprite(-2, 2, 20, 10);
		Sprite s2 = new Sprite(-2, 22, 20, 10);
		Sprite s3 = new Sprite(-10, 2, 20, 10);
		Sprite s4 = new Sprite(-10, 22, 20, 10);
		Sprite s5 = new Sprite(-2, 42, 20, 10);
		Sprite s6 = new Sprite(-10, 42, 20, 10);
			
		// s1
		if (bbox.collidesWith(s1, s2)) 
		{
			svg = "s1 collides with s2.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s1, s3))
		{
			svg = "s1 collides with s3.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s1, s4))
		{
			svg = "s1 collides with s4.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s1, s5))
		{
			svg = "s1 collides with s5.";
			System.out.println(svg);
		}
		if (bbox.collidesWith(s1, s6)){
			svg = "s1 collides with s6.";
			System.out.println(svg);
		}
		
		// s2
		if (bbox.collidesWith(s2, s3)) 
		{
			svg = "s2 collides with s3.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s2, s4))
		{
			svg = "s2 collides with s4.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s2, s5))
		{
			svg = "s2 collides with s5.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s2, s6))
		{
			svg = "s2 collides with s6.";
			System.out.println(svg);
		}
		
		// s3
		if (bbox.collidesWith(s3, s4)) 
		{
			svg = "s3 collides with s4.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s3, s5))
		{
			svg = "s3 collides with s5.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s3, s6))
		{
			svg = "s3 collides with s6.";
			System.out.println(svg);
		}
		
		// s4
		if (bbox.collidesWith(s4, s5)) 
		{
			svg = "s4 collides with s5.";
			System.out.println(svg);
		}
		if(bbox.collidesWith(s4, s6))
		{
			svg = "s4 collides with s6.";
			System.out.println(svg);
		}
		
		// s5
		if (bbox.collidesWith(s5, s6)) 
		{
			svg = "s5 collides with s6.";
			System.out.println(svg);
		}
		
	}
	
}
