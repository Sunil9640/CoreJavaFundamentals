package Threads;

//class Thread11 implements Runnable {
//
//	public void run() {
//
//		for (int i = 0; i <= 10; i++) {
//			System.out.println(" hi ");
//			
//			try {
//				Thread.sleep(10);
//			}
//			catch (InterruptedException e) {
//				
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		}
//	}
//}
//
//class Thread22 implements Runnable {
//
//	public void run() {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(" hello  ");
//			
//
//			try {
//				Thread.sleep(10);
//			}
//			catch (InterruptedException e) {
//				
//				e.printStackTrace();
//				// TODO: handle exception
//			}
//		}
//	}
//}

public class RunnableThread {

	public static void main(String args[]) {

		Runnable rn1= () -> {
			
			for(int i=0;i<=10;i++) {
				
				System.err.println(" hi ");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable rn2 =()-> {

				for (int i = 1; i <= 10; i++) {
					System.out.println(" hello  ");

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
						// TODO: handle exception
					}
				}
		};

		Thread thread = new Thread(rn1);
		Thread thread2 = new Thread(rn2);

		thread.start();
		thread2.start();

		System.out.println(thread.getPriority());
		System.out.println(thread2.getPriority());

	}

}
