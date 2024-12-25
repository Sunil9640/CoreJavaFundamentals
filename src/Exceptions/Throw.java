package Exceptions;

 class SunilException extends Exception
{
	
	public SunilException(String str) {
		
	}
}
 
 class A{
	 
	 public void method() throws ClassNotFoundException {
		 
		 Class.forName("");
	 }
 }



public class Throw {
	
	public static void main(String args[]){
		
		int a=18;
		int b=20;
		int results;
		
		try {
			
			results=a/b;
			if(results==0) throw new  SunilException(" this is  made exception");
			
		}catch ( SunilException e) {
			
			results=a/1;
			System.out.println(" the results is " + results + e );
			
		}
		
		
		 A a2 = new A();
		 try {
			a2.method() ;
		} catch (ClassNotFoundException e) {
			
			System.out.println(" the class is not found " + e);
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}

}
