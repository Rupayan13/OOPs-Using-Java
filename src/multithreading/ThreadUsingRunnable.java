/**
 * 
 */
package multithreading;

/**
 * @author Rupayan Dirghangi
 *
 */
class MyThreadRunnable1 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 40000) {
			System.out.println("I love my mother.");
		}
	}
}

class MyThreadRunnable2 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 40000) {
			System.out.println("I love my father.");
		}
	}
}

public class ThreadUsingRunnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadRunnable1 i1 = new MyThreadRunnable1();
		Thread t1 = new Thread(i1);

		MyThreadRunnable2 i2 = new MyThreadRunnable2();
		Thread t2 = new Thread(i2);

		t1.start();
		t2.start();

	}

}
