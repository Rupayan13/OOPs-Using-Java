/**
 * 
 */
package polymorphism;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Circle extends Shapes {
	// this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
