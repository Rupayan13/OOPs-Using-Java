/**
 * 
 */
package introduction;

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
		Student student1 = new Student();
		System.out.println("Roll no. , name and marks of student1 is :" + student1.rno + ", " + student1.name + ", "
				+ student1.marks);

		Student student2 = new Student(21, "Kunal Kushwaha", 9.6f);
		System.out.println("Roll no. , name and marks of student1 is :" + student2.rno + ", " + student2.name + ", "
				+ student2.marks);

		Student student3 = new Student(student1);
		System.out.println("Roll no. , name and marks of student1 is :" + student3.rno + ", " + student3.name + ", "
				+ student3.marks);
		
		student1.changeName("Rupayan Dirghangi");
		System.out.println("Roll no. , name and marks of student1 is :" + student1.rno + ", " + student1.name + ", "
				+ student1.marks);
		
		student2.greetings();

	}

}

class Student {
	int rno;
	String name;
	float marks;

	// Default constructor
//	Student() {
//		this.rno = 47;
//		this.name = "Rupayan Dirghangi";
//		this.marks = 9.015f;
//	}

	// Parameterized constructor
	Student(int rno, String name, float marks) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}

	// Copy constructor
	Student(Student other) {
		this.rno = other.rno;
		this.name = other.name;
		this.marks = other.marks;
	}
	
	//Using default constructor and instance of the object(this) we can call any other constructor
	Student(){
		this(13, "Default Student", 10.0f);
	}
	
	void changeName(String newName) {
        name = newName;
    }
	void greetings() {
		System.out.println("Hello my name is "+this.name);
	}
	
}
