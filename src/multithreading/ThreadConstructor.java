/**
 * 
 */
package multithreading;

/**
 * @author Rupayan Dirghangi
 *
 */
class MyThr1 extends Thread {
	public MyThr1(String name) {
		super(name);
	}

	@Override
	public void run() {
		int i = 0;
		while (i++ < 40000) {
			System.out.println("Thank You " + this.getName());
		}
	}
}

class MyThr2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Fuck You");
	}
}

public class ThreadConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyThr1 t1 = new MyThr1("Rupayan");
//		MyThr1 t2 = new MyThr1("Aditya");
//		t1.start();
//		t2.start();
//		System.out.println("The id of the thread t1 is " + t1.getId());
//		System.out.println("The name of the thread t1 is " + t1.getName());
//
//		System.out.println("The id of the thread t2 is " + t2.getId());
//		System.out.println("The name of the thread t2 is " + t2.getName());

		MyThr2 i1 = new MyThr2();
		Thread t1 = new Thread(i1, "Rupayan");
		t1.start();
		System.out.println(t1.getId() + " " + t1.getName());

	}

}
