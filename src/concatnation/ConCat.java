package concatnation;

public class ConCat {
	
	public static void main(String [] args) {
		
		String name1 ="Pinky";
		String name2 ="PINKY";
		
		String results; 
		
		results= name1.concat(name2);
		
		boolean rst=name1.equals(name2);
		System.out.println(rst);

		
		boolean next =name1.equalsIgnoreCase(name2);
		
		System.out.println(next);
		
		
		System.out.println(results);
		
	}

}
