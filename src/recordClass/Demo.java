package recordClass;

import java.util.Objects;

//class Student {
//
//	private int id;
//	private String name;
//
//	/*
//	 * public Student(int id) {
//	 * 
//	 * this.id = id; }
//	 * 
//	 * public Student(String name) { this.name = name; }
//	 */
//	
//	
//
//	public int getId() {
//		return id;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Student(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//
//	public Student() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//
//	}
//}


record Student (int id, String name) {
	
	public Student {
		if(id==0)
			throw new IllegalArgumentException("zero cant be as ID");
			
		
		}
	
}

public class Demo {

	public static void main(String[] args) {

		
		
		Student st1 = new Student(12,"sunil");
		Student st2 = new Student(0,"sun");
		
		System.out.println(st1.equals(st2));
		System.out.println(st1);
		
		
		

	}

}
