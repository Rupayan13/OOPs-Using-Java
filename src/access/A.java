/**
 * 
 */
package access;

/**
 * @author Rupayan Dirghangi
 *
 */
public class A {
	private int num;
	protected int n;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	String name;
	int arr[];
	public A(int num, int n, String name) {
		// TODO Auto-generated constructor stub
		this.num=num;
		this.n=n;
		this.name=name;
		this.arr=new int[num];
	}

}
