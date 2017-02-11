package assignment2;
/**
 * 
 * @author Felix Lin
 *
 */
public class BoundingBox extends Rectangle{

	public BoundingBox(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public boolean collidesWith(Rectangle other){
		if(super.equals(other))
			return true;
		else
			return false;
	} 

}
