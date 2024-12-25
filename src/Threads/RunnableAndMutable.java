package Threads;

class Counter{
	
	 int count;
	 
	 public synchronized void show(){
		 count++;
		 
	 }
	
}

public class RunnableAndMutable {
	
	public static void main(String args[]) throws InterruptedException {

		Counter co=new Counter();
		
		Runnable rn1= () -> {
			
			for(int i=1;i<=10000;i++) {
				
				
				co.show();
				//System.out.println(co.count);
				
				}
		};
		
		Runnable rn2 =()-> {

				for (int i = 1; i <=1000; i++) {
					
					co.show();
		
				}
		};

		Thread thread = new Thread(rn1);
		Thread thread2 = new Thread(rn2);

		thread.start();
		thread2.start();
		
		thread.join();
		thread2.join();
		
		System.out.println(co.count);


	}
	


}
