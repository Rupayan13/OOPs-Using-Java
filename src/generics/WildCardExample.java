/**
 * 
 */
package generics;

import java.util.Arrays;

/**
 * @author Rupayan Dirghangi
 *
 */
//Here T should either be Number or its subclasses
public class WildCardExample<T extends Number> {
	private Object[] data;
	private static int DEFAULT_SIZE = 10;
	private int size = 0;// also working as index value

	public WildCardExample() {
		this.data = new Object[DEFAULT_SIZE];
	}

	public void add(T num) {
		if (isFull()) {
			resize();
		}
		data[size++] = num;
	}

	private void resize() {
		Object temp[] = new Object[data.length * 2];

		// copy the current items in the new array
		for (int i = 0; i < data.length; i++) {
			temp[i] = (T)(data[i]);
		}
		data = temp;
	}

	private boolean isFull() {
		return size == data.length;
	}

	public T remove() {
		T removed = (T)(data[--size]);
		return removed;
	}

	public T get(int index) {
		return (T)(data[index]);
	}

	public int size() {
		return size;
	}

	public void set(int index, T value) {
		data[index] = value;
	}

	@Override
	public String toString() {
		return "CustomArrayList [data=" + Arrays.toString(data) + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildCardExample<Number> list4=new WildCardExample<>();
		//SubClasses of Numbers
		WildCardExample<Integer> list5=new WildCardExample<>();
		WildCardExample<Double> list6=new WildCardExample<>();

	}

}
