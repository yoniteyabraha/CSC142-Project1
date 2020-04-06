import uwcse.graphics.*; // access the graphics utilities in the uw library
import java.awt.Color; // access the Color class

/**
 * <p>
 * A MountainScene displays snow men, trees (with ornaments), a cable car and a
 * fourth element of your choice in a graphics window
 * </p>
 * 
 * @author YonasAbraha
 */

public class MountainScene {

	/** The graphics window that displays the picture */
	private GWindow window;

	/**
	 * Create an image of a mountain scene
	 */
	public MountainScene() {

		// The graphics window
		// The window is by default 500 wide and 400 high
		
		this.window = new GWindow("Mountain scene");
		
		this.window.setExitOnClose(); // so that a click on the close box of the
		// window terminates the application

		// Background (cyan here)
		Rectangle bgnd = new Rectangle(0, 0, window.getWindowWidth(), window.getWindowHeight(), Color.cyan, true);
		this.window.add(bgnd);

		// Create the scene elements
		// e.g. a tree in the lower left area 1.5 times the normal size
		new Tree(300, 300, 1.5, this.window);
		new Tree(250, 200, 1.2, this.window);
		new Tree(440, 30, 0.9, this.window);
		new Tree(40, 20, 0.6, this.window);

		new SnowMan(390, 180, 1.7, this.window);
		new SnowMan(40, 250, 1.0, this.window);
		new SnowMan(200, 40, 0.8, this.window);

		new CableCar(70, 120, 1.0, this.window);

		new House(110, 330, 1.0, this.window);
		new House(320, 75, 0.6, this.window);
		new House(80, 60, 0.45, this.window);
	}

	/**
	 * Entry point of the program
	 */
	public static void main(String[] args) {
		new MountainScene();
	}

}