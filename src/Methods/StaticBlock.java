package Methods;

class Mob {
	int cost;
	String brand;
	static String name;

	 static {
		name="nokia";
		System.out.println(" inside the static block");
	}
	
	 
	 public Mob(){
		 cost=500;
		 brand="";
		 System.out.println(" inside the  constructor block");
		
	 }
	
	public void Display() {
		System.out.println(cost + " : " + brand + "  : "+ name);
	}

}

public class StaticBlock {

	public static void main(String args[]) throws ClassNotFoundException {
		
		
		Class.forName("Mob");

//		Mobile1 mb = new Mobile1();
//		mb.brand = "iphone";
//		mb.cost = 900;
//		

	//  mb.Display();

	}

}
