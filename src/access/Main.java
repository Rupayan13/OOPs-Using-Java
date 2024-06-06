/**
 * 
 */
package access;

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
		A obj = new A(10, 5, "Rupayan");
		// we can't able to access the private element 
		//So for using it we have to implement getter and setter method
		obj.getNum();//It is now accessable
		
		//if we choose for the default one
		System.out.println(obj.name); // It is accessable in the same packages
		//But outside of the package it is not accessable
		
		//Protected is accessed in normally same package
		int x=obj.n;

	}

}
