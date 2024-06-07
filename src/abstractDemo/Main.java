/**
 * 
 */
package abstractDemo;

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
		Son son = new Son(21);
		son.career("Doctor");
		son.partner("Trisa", 21);
		son.normal();
		System.out.println(son.VALUE);

		Parent daughter = new Daughter(21);
		daughter.career("Coder");
		daughter.partner("Karthi", 25);

//		Parent mom=new Parent(44);
//		We can't create object of abstract class, we have to override it.

	}

}
