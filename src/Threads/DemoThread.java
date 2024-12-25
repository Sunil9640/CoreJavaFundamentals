package Threads;

import java.security.KeyStore.PrivateKeyEntry;

class Thread1 extends Thread {

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println(" hi ");
			
			try {
				Thread.sleep(10);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

class Thread2 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(" hello  ");
			

			try {
				Thread.sleep(10);
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}

public class DemoThread {

	public static void main(String args[]) {

		Thread1 th = new Thread1();
		Thread2 th2 = new Thread2();

//		
//		System.out.println(th.getPriority());
//		System.out.println(th2.getPriority());

		// th.setPriority(Thread.MAX_PRIORITY);

		System.out.println(th.getPriority());

		th.start();
		th2.start();

	}

}
