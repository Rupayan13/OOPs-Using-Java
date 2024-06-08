/**
 * 
 */
package comparing;

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
		Student rupayan = new Student(47, 85.3f);
		Student arindam = new Student(46, 89.1f);
		
		if(rupayan.compareTo(arindam) < 0) {
			System.out.println("Arindam has more marks.");
			System.out.println(rupayan.compareTo(arindam));
		}else if(rupayan.compareTo(arindam) > 0) {
			System.out.println("Rupayan has more marks.");
			System.out.println(rupayan.compareTo(arindam));
		}else {
			System.out.println("Both have equal marks.");
		}

	}

}
