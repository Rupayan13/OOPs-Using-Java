/**
 * 
 */
package enumExamples;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Basic {
	enum Week implements A {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		// These are enum constants
		// public , static and final
		// since its final you can create child enums
		// type is week

		Week() {
			System.out.println("Constructor called for " + this);
		}
		// this is not public or protected, only private or default
		// Why? we don't wnat to create new objects
		// this is not the enum concept, thats why

		// Internally: public static final Week Monday = new Week();

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			System.out.println("Hey! How are you?");

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week week;
		week = Week.Monday;
		week.hello();
		System.out.println(Week.valueOf("Monday"));

//		for(Week day: Week.values()) {
//			System.out.println(day);
//		}
		System.out.println(week.ordinal());

	}

}
