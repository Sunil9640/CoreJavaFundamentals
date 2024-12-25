package NestedClass;

abstract class Alpha{
	
	 public abstract void add();
	
}


public class Abstract {
	
	public static void main(String args[]) {
		
		Alpha al=new Alpha() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
				System.out.println(" hello workld this is anaymous class");
				
			}
		};
		
		al.add();
		
	}

}
