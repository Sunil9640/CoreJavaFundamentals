package Package1;

public class Switch {
 
	public static void main(String[] args) {
		
		int n=2;
		 String results;
		
	results = switch (n) {
		
		case 1 : yield "this is monday";
			
			
		case 2 : yield" set for tuesday";
		
		default :yield "this is is the default block";
			
		};
	 
		System.out.println(results);
	}
}
