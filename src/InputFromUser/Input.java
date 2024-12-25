package InputFromUser;

import java.util.Scanner;

public class Input {
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		
		int firstNumber = sc.nextInt();
		
		System.out.println("enter the Second number");
		
		int secondNumber=sc.nextInt();
		
		int results=firstNumber+secondNumber;
		
		System.out.println(" the additon of two number: " + results);
		
		
	}

}
