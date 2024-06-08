/**
 * 
 */
package exceptionHandling;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		try {
//			divide(a, b);
			String name = "Rupayan";
			if (name.equals("Rupayan")) {
				throw new MyException("Name is Rupayan");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Normal Exception.");
		} finally {
			System.out.println("This will always execute.");
		}

	}

	static int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Please do not divide by zero.");
		}
		return a / b;
	}

}
