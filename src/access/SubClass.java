/**
 * 
 */
package access;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SubClass extends A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj=new SubClass(21, 4, "Rupayan");
		int n=obj.n;//Protected is accessed in the same package subclass
		//But it can be accessed by outside package subclass but it can't be accessed in different package and not a subclass

	}

	public SubClass(int num, int n, String name) {
		super(num, n, name);
		// TODO Auto-generated constructor stub
	}

}
