package needOfStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamJava {
	
	public static void main(String[] args) {
		
		List<Integer> nums =Arrays.asList(20,5,10,7,8,90);
		
		//int[] nums = {10,20,50,3,2,1,90};
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		
		num1.add(20);
		num1.add(60);
		num1.add(20);
		num1.add(80);
		num1.add(90);
		
		num1.forEach(n -> System.out.println(n));
		
		
		
//	      normal for loop
		
//		for(int i=0;i<nums.size();i++) {
//			
//			System.out.println(nums.get(i));
//		}
//		
//	   enhanced for loop
//		
//		for(int n : nums) {
//			
//			System.out.println(n);
//		}
//		
	
		
		// ForEach loop of streamAPI
		
		
		nums.forEach(n -> System.out.println(n));
		
		
	}

}
