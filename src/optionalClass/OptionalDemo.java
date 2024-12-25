package optionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("sunil" , " varun " , " pranay " , " naveen");
		
		String str = names.stream()
				.filter(s-> s.contains("n"))
				.findFirst()
				.orElse("not found ");
		
		List<String> nums= names.stream()
								.map(String::toUpperCase)
							   .toList();
								
		
		System.out.println(nums);
                               
		
	nums.forEach(System.out::println);
		
	}

}
