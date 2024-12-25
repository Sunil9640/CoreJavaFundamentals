package encapsulation;

class Encapsulation {

	int roll;
	String name;

	public Encapsulation() { // default constructor

		name = "sunil";
		roll = 20;
	}

	public Encapsulation(int n, String str) { // parameterrised constructor
		name = str;
		roll = n;

	}
	
	
	public Encapsulation( String str) { // parameterrised constructor
		name = str;
	

	}
	
	

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

//	public void setName(String n) {
//		 name=n;
//		
//	}
//	

//	public void setRoll(int roll) {
//		this.roll=roll;
//	}
//	
//	

}

public class Private {

	public static void main(String args[]) {

		Encapsulation enc = new Encapsulation();
		Encapsulation enc1 = new Encapsulation(90,"varun");

		System.out.println(enc1.getRoll());
		System.out.println(enc1.getName());

//		enc.setName("sunil");
//		enc.setRoll(20);
//		System.out.println(enc.getRoll());
//		System.out.println(enc.getName());
//		
	}

}
