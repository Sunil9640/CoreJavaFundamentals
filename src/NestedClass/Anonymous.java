package NestedClass;

class A1 {

	public void show(String str) {
		System.out.println(" inside the  A shoow");
	}
}

class B1 extends A1 {
   
	public void show(String str, String num) {
	System.out.println(" inside the  B shoow");
	}
}

public class Anonymous {

	public static void main(String args[]) {

		B1 obj = new B1();

		obj.show("sunil","b");
	}

}
