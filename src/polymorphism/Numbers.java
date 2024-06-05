/**
 * 
 */
package polymorphism;

/**
 * @author Rupayan Dirghangi
 *
 */
/*Example of Overloading*/
public class Numbers {

	double sum(double a, int b) {
		return a + b;
	}

	double sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers obj = new Numbers();

		obj.sum(2, 3);
		obj.sum(1, 3, 7);

//      obj.sum(4, 5, 6, 8);

	}

}
