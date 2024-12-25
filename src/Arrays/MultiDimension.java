package Arrays;

public class MultiDimension {
	public static void main(String args[] ) {
		
		
		
		 int nums[][]= new int[3][3];
		 
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				
				nums[i][j]=(int)(Math.random()*100);
				
				System.out.println(nums[i][j]+ "  ");
			}
			System.out.println();
			
		}
		
		
	}

}
