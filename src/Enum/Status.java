package Enum;

import java.util.List;


  enum Color {
	red, pink, yellow, orange;
}

public class Status {

	public static void main(String args[]) {

		Color cr = Color.orange;
		System.out.println(cr.getClass().getSuperclass());
		
		switch(cr) {
		
		case red:
			System.out.println(" is it red color");
			break;
			
		case pink:
			System.out.println(" is it pink color");
			break;
			
		case yellow:
			System.out.println(" is it yellow color");
			break;
			
		case orange:
			System.out.println(" is it orange color");
			break;
		
		
		}
		
		
		
	}
}
