package Arrays;

import java.lang.reflect.Array;

class Mobile{
	String name;
	String brand;
	int price;
  static	String mobile;
	
	public void show(){
		
		System.out.println(name + ":" + price + " : " + brand + ": " + mobile);
		
	}

	
}


public class Obj {
	
	public static void main(String args[]) {
		
		Mobile mobile = new Mobile();
		mobile.brand="apple";
		mobile.price=900;
		mobile.name="iphon16";
		mobile.mobile="smartphone";
		
		Mobile mobile1 = new Mobile();
		mobile1.brand="apple";
		mobile1.price=9009;
		mobile1.name="iphon19";
		mobile1.mobile="smartphone1";
		
		Mobile.mobile="sunil";
		
	     
		mobile.show();
		mobile1.show();
		
		
		
		}
		
	}
