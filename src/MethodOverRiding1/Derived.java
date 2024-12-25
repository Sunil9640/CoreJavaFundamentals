package MethodOverRiding1;

import Methods.Loading;
import Methods.StaticMethod;

public class Derived extends Loading {
	
	public  int roll=20;
	
	public int add(int a, int b) {
		
		System.out.println(" the child class");
		
		return a+b+1;
		
	}
	
	

}
