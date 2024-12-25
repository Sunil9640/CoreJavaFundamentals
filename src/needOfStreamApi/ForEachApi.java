package needOfStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachApi {
	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(20,5,10,7,8,90);
		
	
		
		Consumer<Integer> con =(Integer t) -> {
			//	int sum=0;
				if(t%2==0) {
					t=t*2;
					
					
					System.out.println(t);
				
					
				}
				
		};
		
		
		list.forEach(con);
	}

}
