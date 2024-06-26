/**
 * 
 */
package inheritance;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Box {
	double l;
	double h;
	double w;

	Box() {
		this.h = -1;
		this.l = -1;
		this.w = -1;
	}

	// cube
	Box(double side) {
		// super(); Object class
		this.w = side;
		this.l = side;
		this.h = side;
	}

	Box(double l, double h, double w) {
		System.out.println("Box class constructor");
		this.l = l;
		this.h = h;
		this.w = w;
	}

	Box(Box old) {
		this.h = old.h;
		this.l = old.l;
		this.w = old.w;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
