/**
 * 
 */
package multithreading;

/**
 * @author Rupayan Dirghangi
 *
 */
class MyNewThread1 extends Thread {
	@Override
	public void run() {
//		int i = 0;
//		while (i++ < 4000) {
//			System.out.println("My new thank you 1.");
//		}
		while (true) {
			System.out.println("My new thank you 1.");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyNewThread2 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (i++ < 4000) {
			System.out.println("My new thank you 2.");
		}
	}
}

public class ThreadMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewThread1 t1 = new MyNewThread1();
		MyNewThread2 t2 = new MyNewThread2();
		t1.start();
		// If I want to fulfill the execution of t1 and then want to run t2 then java
		// has a method called join, and sometimes it throws a exception(if t1 finishes
		// before call the join)
//		try {
//			t1.join();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		t2.start();

	}

}
