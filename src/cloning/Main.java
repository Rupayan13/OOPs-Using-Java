/**
 * 
 */
package cloning;

import java.util.Arrays;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Human rupayan = new Human(47, "Rupayan");
//		Human twin = new Human(rupayan);
		
        //Shallow Copy
		Human twin = (Human) rupayan.clone();
		System.out.println(twin.age + " , " + twin.name);
		System.out.println(Arrays.toString(twin.arr));

		twin.arr[0] = 100;
		System.out.println(Arrays.toString(rupayan.arr));
		//Check after a deep copy, rupayn is not changed, but twin would be changed
		System.out.println(Arrays.toString(twin.arr));

	}

}
