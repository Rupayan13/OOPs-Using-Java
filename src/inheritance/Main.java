/**
 * 
 */
package inheritance;

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
		BoxWeight box1 = new BoxWeight();
		System.out.println(box1.h + " " + box1.weight);

		BoxWeight box2 = new BoxWeight(2, 3, 4, 8);
		System.out.println(box2.h + " " + box2.weight);

		//Dynamic method dispatch
		Box box3 = new BoxWeight(2, 3, 4, 8);
		System.out.println(box3.w);
//		System.out.println(box3.weight); //we can't get box weight because it is the instance of the parent class, though the variable is initialized by the the child constructor.

		// there are many variables in both parent and child classes
		// you are given access to variables that are in the ref type i.e. BoxWeight
		// hence, you should have access to weight variable
		// this also means, that the ones you are trying to access should be initialised
		// but here, when the obj itself is of type parent class, how will you call the
		// constructor of child class
		// this is why error
//        BoxWeight box4 = new Box(2, 3, 4); // It is not applicable anymore, because we can assign the child constructor(child class object) for referring the parent class instance, but vice versa is not possible
//        System.out.println(box4);

		BoxWeight box = new BoxWeight();
		BoxWeight.greeting(); // you can inherit but you cannot override

	}

}
