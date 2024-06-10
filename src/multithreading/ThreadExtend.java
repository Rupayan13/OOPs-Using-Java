/**
 * 
 */
package multithreading;

/**
 * @author Rupayan Dirghangi
 *
 */
class MyThread1 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 40000) {
			System.out.println("Cooking thread is running.");
			System.out.println("I am happy.");
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 40000) {
			System.out.println("Chatting thread is running.");
			System.out.println("I am sad.");
		}
	}
}

public class ThreadExtend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

	}

}
