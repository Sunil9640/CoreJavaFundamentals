package NestedClass;

//import NestedClass.A.B;

//import NestedClass.A.B;

 class A{
	
	int a=10;
	String name="sunil";
	
	public void method() {
		System.out.println("hello out side class");
	}
	
	
 class B{
	
	 public void add() {
		System.out.println("inside the inner class ");
	}
	
}
}

class B extends A{
	
	public void method() {
		System.out.println(" out side B class");
	}
	
}

public class Main {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		A obj=new A();
		
   
		 A.B obj1= obj.new B();
		 
		 obj1.add();
		 
	

	   
	}

}
