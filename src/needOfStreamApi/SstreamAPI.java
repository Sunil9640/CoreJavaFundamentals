package needOfStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class SstreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5);

		// Stream<Integer> strm = list.stream();

		/*
		 * Stream<Integer>strm1 = strm.filter(n -> n%2==0);
		 * 
		 * strm1.forEach(n -> System.out.println(n));
		 * 
		 * Stream<Integer> st2= strm1.map(n -> n*2);
		 * 
		 * Integer results= st2.reduce(0,(c,e) -> c+e);
		 */

		int results =   list.stream()
							.filter(n -> n % 2 == 0)
							.map(n -> n * 3)
							.reduce(10, (c, e) -> c + e);        // 10 is the initial value "C" is the carry and "e" is the element.
		
		System.out.println(results);

	}

}
