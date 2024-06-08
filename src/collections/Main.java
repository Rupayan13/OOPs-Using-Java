/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		list2.add(34);
		list2.add(78);
		list2.add(55);
		list2.add(89);
		System.out.println(list2);

		List<Integer> vector = new Vector<>();
		vector.add(45);
		vector.add(5);
		vector.add(15);
		vector.add(56);
		
		System.out.println(vector);

	}

}
