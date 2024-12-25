package Arrays;

public class jagggedArray {
	
	public static void main(String args[] ) {

		
		 int num[][]= new int[3][];     //jagged Array
		  num[0]=new int[5];
		  num[1]=new int[2];
		  num[2]=new int[6];
		  
		  
		 for(int i=0;i<num.length;i++) {
			 
			 for(int j=0;j<num[i].length;j++) {
				 num[i][j]=(int)(Math.random()*100);
			 }
		 }
		  
		 for(int n[]:num) {
			 for(int k:n) {
				 System.out.println(k);
				 
			 }
			 System.out.println();
			 
		 }
		 
		
		
	}
		  
		 
	}

