/**
 * 
 */
package staticExample;

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
		Human rupayan = new Human(21, "Rupayan Dirghangi", 37500, false);
		Human kunal = new Human(22, "Kunal Kushwaha", 100000, false);
		Human arpit = new Human(34, "arpit", 15000, true);

		System.out.println(Human.population);
		System.out.println(Human.population);
		System.out.println(Human.population);
		
		Main funn = new Main();
        funn.fun2();

	}

	// this is not dependent on objects
	static void fun() {
//        greeting(); // you cant use this because it requires an instance
		// but the function you are using it in does not depend on instances

		// you cannot access non static stuff without referencing their instances in
		// a static context

		// hence, here I am referencing it
		Main obj = new Main();
		obj.greeting();
	}

	void fun2() {
		greeting();
	}

	// we know that something which is not static, belongs to an object
	void greeting() {
//        fun();
		System.out.println("Hello world");
	}

}
