package Arrays;

public class EnhancedArray {
	
	public static void main(String args[] ) {
		
		 int nums[][]= new int[3][3];
		 
		 for(int i=0;i<3;i++) {
				
				for(int j=0;j<3;j++) {
					
					nums[i][j]= (int)(Math.random()*10);
					
				}
		 }
		 
		 
		 for(int n[]:nums) {
			 for(int k:n) {
				 System.err.println(k);
			 }
			 System.out.println();
		 }
		 
	}
}
