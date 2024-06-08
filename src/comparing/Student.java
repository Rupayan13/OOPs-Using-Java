/**
 * 
 */
package comparing;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Student implements Comparable<Student> {
	int rollno;
	float marks;

	public Student(int rollno, float marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		// if diff==0; both are equal
		// if diff<0; o is bigger else o is smaller
		return (int)(this.marks-o.marks);
	}

}
