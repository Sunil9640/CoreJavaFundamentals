package InputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Finally {
	
	public static void main(String args[]) throws IOException {
		
		int num;
		int num2;
		
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" enter divided");
		
		num= Integer.parseInt(bf.readLine());
		
		System.out.println(" enter divisor");
		
		num2= Integer.parseInt(bf.readLine());
		
		try {
			
		  int results=num/num2;
		  
		  System.out.println(results);
		    
			
			
		}catch (Exception e) {
		
			System.out.println(" you cant divide by zero ");
			
		}
		
		finally {
			bf.close();
			
			System.out.println(" good day ");
			
		}
	
		
		
	}

}
