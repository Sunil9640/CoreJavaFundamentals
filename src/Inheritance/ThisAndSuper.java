package Inheritance;

import java.lang.classfile.Superclass;

class A {

	public A() {
		System.out.println(" in the  class A");
	}

	public A(int a) {

		System.out.println(" in the  para meter class A ");
	}

}

class B extends A {

	public B() {
		System.out.println(" in the  class B");

	}

	public B(int a) {
		super(2);
		System.out.println(" in the  class parameter B");

	}

}

class C extends B {

	public C() {
		super();
		System.out.println(" in the  class C");
	}

	public C(int a) {

		this();
		System.out.println(" in the  class C inside parameter");
	}

}

public class ThisAndSuper {

	public static void main(String args[]) {

		C c = new C(1);

		// B b =new B();

	}

}
