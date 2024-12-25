package Interfaces;

class Computer{
	
	public void run() {
		
	}
	
	
}

class Laptop extends Computer{
	
	public void run() {
		System.out.println(" codeing, compil, run ");
	}
}

class Desktop extends Computer{
	
	public void run() {
		System.out.println(" codeing, compile, run,:  faster ");
	}
	
}

class Developer{
	
	public void devApp(Computer com) {
		com.run();
		
	}
}


public class PassingObject {
	
	public static void main(String args[]) {
		
		Computer laptop =new Laptop();
		Computer desktop=new Desktop();
		 
		Developer developer=new Developer();
		developer.devApp(laptop);
	}
	
	

}
