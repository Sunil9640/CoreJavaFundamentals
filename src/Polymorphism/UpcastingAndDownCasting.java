package Polymorphism;

class A{
	
	int num=12;
	public Integer num1=new Integer(30);    // autoboxing
	
	int mum=num1;
	
	
	public void show1() {
		System.out.println(" in the class A");
	}
}

class B extends A{
	
	public void show2() {
		
		System.out.println(" in the class B");
		
	}
}


public class UpcastingAndDownCasting {
	
	public static void main(String []args) {
		
		A obj =new B();                        // upcasting
		obj.show1();
		
		B obj1 =(B)obj;                   // downCasting
		obj1.show2();   
		
		System.out.println(obj.mum);
	
	
	 
	}

}
