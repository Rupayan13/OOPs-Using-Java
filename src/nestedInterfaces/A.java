/**
 * 
 */
package nestedInterfaces;

/**
 * @author Rupayan Dirghangi
 *
 */
public class A {
	//nested interfaces
	public interface NestedInterface{
		boolean isOdd(int num);
	}

}
class B implements A.NestedInterface{

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return (num & 1)==1;
	}
	
}
