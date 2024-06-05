/**
 * 
 */
package polymorphism;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	/*Example of Overrinding*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        
        circle.area();

	}

}
