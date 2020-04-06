import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>
 * Create a House with ornaments in a graphics window
 * </p>
 * 
 * @author YonasAbraha
 */

public class House {

	// Instance fields
	// The graphics window this House belongs to
	private GWindow window;
	// The location of this House
	// (precisely (as done in the draw method), (x,y)
	private int x;
	private int y;
	// The scale used to draw this house
	private double scale;

	/**
	 * Create a house
	 * 
	 * @param x      the x coordinate of the house location (center of the house)
	 * @param y      the y coordinate of the house location
	 * @param window the graphics window this house belongs to
	 * @param scale  the scale of the drawing (all default dimensions are multiplied
	 *               by scale)
	 */
	public House(int x, int y, double scale, GWindow window) {
		// Initialize the instance fields (the use of this. is required
		// since the instance fields have the same name as the
		// parameters of the constructor)
		this.window = window;
		this.scale = scale;
		this.x = x;
		this.y = y;

		// the details of the drawing are in written in the private method draw()
		this.draw();
	}

	/**
	 * draw a house
	 */
	private void draw() {
		Rectangle lowerPart = new Rectangle(this.x, this.y, (int) (100 * this.scale), (int) (50 * this.scale),
				Color.WHITE, true);
		this.window.add(lowerPart);

		Triangle upperPart = new Triangle(this.x, this.y, this.x + (int) (scale * 50), this.y - (int) (scale * 70),
				this.x + (int) (scale * 100), this.y, Color.DARK_GRAY, true);
		this.window.add(upperPart);

		Rectangle door = new Rectangle(this.x + (int) (scale * 40), this.y + (int) (scale * 25),
				(int) (20 * this.scale), (int) (25 * this.scale), Color.ORANGE, true);
		this.window.add(door);

		Rectangle leftWindow = new Rectangle(this.x, this.y + (int) (scale * 12), (int) (15 * this.scale),
				(int) (20 * this.scale), Color.getHSBColor(100, 150, 210), true);
		this.window.add(leftWindow);

		Rectangle rightWindow = new Rectangle(this.x + (int) (scale * 85), this.y + (int) (scale * 12),
				(int) (15 * this.scale), (int) (20 * this.scale), Color.getHSBColor(100, 150, 210), true);
		this.window.add(rightWindow);

		Line flag = new Line(this.x + (int) (scale * 50), this.y - (int) (scale * 70), this.x + (int) (scale * 50),
				this.y - (int) (scale * 100), Color.WHITE);
		this.window.add(flag);

		Rectangle flagRect = new Rectangle(this.x + (int) (scale * 50), this.y - (int) (scale * 100),
				(int) (20 * this.scale), (int) (20 * this.scale), Color.getHSBColor(120, 0, 160), true);
		this.window.add(flagRect);

	}
}
