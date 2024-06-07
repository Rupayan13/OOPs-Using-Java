/**
 * 
 */
package abstractDemo;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Daughter extends Parent {
	@Override
	void career(String name) {
		System.out.println("I am going to be a " + name);
	}

	public Daughter(int age) {
		super(age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void partner(String name, int age) {
		System.out.println("I love  " + name + ", he is " + age);
	}

}
