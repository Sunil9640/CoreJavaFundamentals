package sealedClass;

sealed class A extends Thread implements Cloneable  permits B{
	

	public void add() {
		System.out.println(" sun");
	}

	public void add(String num) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

sealed class B  extends A permits C {
	
	
	public void sub() {
		System.out.println(" hello");
	}
	
	
}

non-sealed class C extends B{
	
	@Override
	public void add(String num) {
		System.out.println(num);
	}
	
	
	
}


sealed interface X permits Y{
	
}


non-sealed interface Y  extends X{
	
}

public class TestDemo {
	
	public static void main(String [] args) {
		
		
		C c =new C();
		c.add();
		
	}

}
