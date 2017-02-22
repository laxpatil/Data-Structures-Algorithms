import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author Laxmikant
 *
 */

class Student{
	
	int age;
	int id;
	
	public Student(int age, int id)
	{
		this.age= age;
		this.id=id;
	}
}

public class CoparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student[] s= new Student[10];
		
		
		Arrays.sort(s, new Comparator<Student>() {
			
			public int compare(Student a, Student b)
			{
				return a.age-b.age;
			}
		});
		
		
	}

}
