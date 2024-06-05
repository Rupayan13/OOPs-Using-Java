/**
 * 
 */
package staticExample;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InnerClasses {
	static class Test {
        static String name;
        public Test(String name) {
            this.name = name;
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test a = new Test("Kunal");
        Test b = new Test("Rupayan");
        
        System.out.println(a.name);
        System.out.println(b.name);
        
	}

}