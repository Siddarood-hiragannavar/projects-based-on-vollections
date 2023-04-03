package defaultSorting;

public class Student implements Comparable<Student>{
	int age;

	Student(int age)
	{
		this.age=age;
	}

	public String toString() {
		return "Age is :"+age;

	}
	public int compareTo(Student s)//return s.age-this.age; for reverse
	{
		return this.age-s.age;
		
	
	}

}
//this-> object to be inserted and
//s->already existing object
/**
 * Comparable : 1.Interface 2.java.lang package 3. JDK1.2
 * Syntax : public int comparable Interface:
 * ----------------------------------
 * 1.class should implement Comprable interface .
 * 2.specify Generics .
 * 3.Override compareTo() by speccifying the logic to compare.
 */
  
