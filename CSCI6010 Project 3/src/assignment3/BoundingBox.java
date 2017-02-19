package assignment3;
/**
 * 
 * @author Felix Lin
 *
 */
public class BoundingBox {

	public BoundingBox(int x, int y, int width, int height) {

	}
	
	public boolean collidesWith(Sprite rect1, Sprite rect2){
		 
		return (rect1.x < rect2.x + rect2.width &&
				rect1.x + rect1.width > rect2.x &&
				rect1.y < rect2.y + rect2.height &&
				rect1.height + rect1.y > rect2.y);
	} 

}
