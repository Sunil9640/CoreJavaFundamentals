package optionalClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {

	int id;
	String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class MethodReferenceClas {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("sunil", " varun ", " pranay ", " naveen");

		List<Student> stu = new ArrayList<Student>();

//		for ( String su : names) {                   // Normal method object Creation 
//			
//			stu.add(new Student(su));
//		}
//		
//		
//		// Using the Stream API                       // object creation USing Stream API
//		   stu = names.stream()
//				   .map(e -> new Student(e))
//				   .toList();
//		   

		stu = names.stream()
				.map(Student::new)                 // constructor Reference object Creation 
				.toList();

		  for(Student su : stu) {
			  System.out.println(su);
		  }

	}

}
