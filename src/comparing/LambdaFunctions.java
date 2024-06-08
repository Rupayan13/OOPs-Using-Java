/**
 * 
 */
package comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LambdaFunctions {
	int sum(int a, int b) {
		return a + b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arr.add(i + 1);
		}
//		arr.forEach((item) -> System.out.println(item * 2));

		Consumer<Integer> fun = (item) -> System.out.println(item * 2);
		arr.forEach(fun);

		Operation sum = (a, b) -> a + b;
		Operation prod = (a, b) -> a * b;
		Operation sub = (a, b) -> a - b;

	}

}

interface Operation {
	int operation(int a, int b);
}
