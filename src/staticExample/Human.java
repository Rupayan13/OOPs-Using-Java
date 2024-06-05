/**
 * 
 */
package staticExample;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Human {
	int age;
	String name;
	int salary;
	boolean married;
	static long population;

	public Human(int age, String name, int salary, boolean married) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		Human.population += 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
