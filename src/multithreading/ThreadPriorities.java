/**
 * 
 */
package multithreading;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ThreadPriorities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr1 t1 = new MyThr1("Rupayan 1");
		MyThr1 t2 = new MyThr1("Rupayan 2");
		MyThr1 t3 = new MyThr1("Rupayan 3");
		MyThr1 t4 = new MyThr1("Rupayan 4");
		MyThr1 t5 = new MyThr1("Rupayan 5");
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
