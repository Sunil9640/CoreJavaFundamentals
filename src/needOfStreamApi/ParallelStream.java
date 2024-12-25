package needOfStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
	
	public static void main(String[] args) {
		
		int size=10_000;

		List<Integer> nums = new ArrayList<Integer>(size);
		
		Random rm = new Random();
		
		for(int i=1;i<=size;i++) {
			nums.add(rm.nextInt(100));
		}
		
	//	System.out.println(nums);
		
		long startSeq=System.currentTimeMillis();
		
		int results= nums.stream()
						 .map(e -> {
							 
							 try {
								 Thread.sleep(1);
							 }catch (Exception x) {
								// TODO: handle exception
							}
							 
						
						  return e*2;
								  })
						 .reduce(0,(c,e) -> c+e);
		long endSeq=System.currentTimeMillis();
		
		
		long startPara=System.currentTimeMillis();
		int results2= nums.parallelStream()
				 .map(e ->{
					 
					 try {
						 Thread.sleep(2);
					 }catch (Exception x) {
						// TODO: handle exception
					}
				 
				return  e*2;
				 })
				 .reduce(0,(c,e) -> c+e);
		long endtPara=System.currentTimeMillis();
		
		System.out.println(startPara - endtPara + " :  parallel processing ");
		System.out.println((startSeq - endSeq) + " Sequencila processing ");
		
		                
		
	
//		
//		int results2 = nums.stream()
//				.map(i -> i*2)
//				.map(i -> i)
//				.sum();
		
		
		
	}

	
}
