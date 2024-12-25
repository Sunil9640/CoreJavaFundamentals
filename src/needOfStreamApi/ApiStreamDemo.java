package needOfStreamApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiStreamDemo {
	
	public static void main(String args[]) {
		
	   List<Integer> nums =Arrays.asList(2,3,4,5,7,8);
	   
	   int sum=0;
	   
	   for(int n : nums) {
		   
		   if(n%2==0) {
			   
			   n=n*2;
			   sum=sum+n;
			   
			   
		   }
	   }
	   
	   System.out.println(sum);
	   System.out.println(nums);
		
	}

}
