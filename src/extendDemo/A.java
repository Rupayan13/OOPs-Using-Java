package extendDemo;

public interface A {
	void fun();
	//This is the default method, if it is not overriden in the main, then it execute this
	default void func() {
		System.out.println("I am in A");
	}
	//Static methods are not overriden , so it must have a body in the interfaces
	static void greeting() {
		System.out.println("Hey I am static method.");
	}

}
