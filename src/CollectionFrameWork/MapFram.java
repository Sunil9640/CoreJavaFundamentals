package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFram {
	
	public static void main(String args[]) {
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		
		students.put("sunil", 90);
		students.put("varun", 60);
		students.put("kruti", 80);
		students.put("sruthi", 90);
		
		
		

	   System.out.println(students);
	   
	   for( String names : students.keySet()) {
		   System.out.println(names + " : " + students.get(names) );
		  // System.out.println(names + " : " + names.indexOf(6) );
		   
		   
	   }
		
	}
}
