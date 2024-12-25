package Annotation;

@FunctionalInterface
interface fun1 {

	void show(int a);
	// void add();
}

abstract class Add{
	
	public abstract void show1();
}
class A {

	public void theDataInsideThisClass() {
		System.out.println(" inside the A ");
	}

}

class B extends A {
	@Override
	public void theDataInsideThisClass() {
		System.out.println(" inside the B ");
	}

}

public class AnnotationClass {

	public static void main(String args[]) {
		
		fun1 fun1= i ->{
				System.out.println(" inside the interface method"+ i);
				
			};
			
			
		
		B b =new B();
		b.theDataInsideThisClass();
		
		fun1.show(5);

		
	}

}
