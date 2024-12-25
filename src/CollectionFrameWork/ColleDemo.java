package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ColleDemo {
	
	public static void main(String args[]) {
		
//		Set<Integer> nums =new HashSet<Integer>();
		
		Collection <Integer> nums = new TreeSet<Integer>();
		
		nums.add(120);
		nums.add(20);
		nums.add(500);
		nums.add(130);
		nums.add(120);
		
		
		Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext()) 
		System.out.println(values.next());
		
//	
//		System.out.println(nums);
//		
//		for(int n : nums) {
//			
//			System.out.println(n);
//		}
		
	}

}
