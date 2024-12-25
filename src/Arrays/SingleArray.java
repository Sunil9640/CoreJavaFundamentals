package Arrays;

public class SingleArray {
	
	public static void main(String args[] ) {
		
		int num[]=new int[10];
		num[0]=20;
		num[1]=30;
		num[8]=30;
		num[6]=40;
		
		for(int i=0;i<num.length;i++) {
			
				System.out.println(num[i]);
		}
	}
}