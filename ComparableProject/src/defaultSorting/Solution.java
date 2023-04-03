package defaultSorting;
import java.util.TreeSet;
public class Solution {
	public static void main(String[] args) {

		Student s1=new Student(23);
		Student s2=new Student(22);
		Student s3=new Student(21);

		TreeSet <Student> t1=new TreeSet<Student>();
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);

		for(Student s:t1)
		{
			System.out.println(s);

		}

	}


}
