package Interfaces;

interface Demo{
	
	void add();
	void sub();
	Integer num(int a,int b);
	String name(String name);
	
}

interface Sun{
	
	void dem0();
}

class Cal implements Demo, Sun{

	@Override
	public void add() {
		 
		System.out.println(" addition class");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println(" sub class");
		
	}


	@Override
	public Integer num(int a ,int b) {
		System.out.println(a+b);
		return a+b;
	}

	@Override
	public String name(String a) {
		System.out.println(a);
		return null;
	}

	@Override
	public void dem0() {
		System.out.println(" in demo class");
		
		
	}

	
}





public class Interface1 {
	
	public static void main(String args[]) {
		
	     Cal cal=new Cal();
		cal.add();
		cal.dem0();
		cal.sub();
		
		
		
	}

}
