 package Methods;


class Mobile{
static String name="sunil";
public String brand="samsung";
	   int price;
  
  public void show(){
		
		System.out.println(name + ":" + price + " : " + brand + ": " );
		
	}
  
  public static void show1(Mobile obj) {

	  
		System.out.println(name + ":" + obj.price + " : " + obj.brand + ": ");
}
  
 public  void Display(Member mem) {
	 System.out.println(" the student name " +mem.name +"  roll no : " + mem.roll );
 }

  
	
}

class Member{
	
	int roll;
	String name;
	
}



public class StaticMethod {
	
public static void main(String args[]) {
	
	
	Mobile mobile = new Mobile();
	mobile.brand="apple";
	mobile.price=900;
	Mobile.name="samsung";
	// mobile.mobile="smartphone";
	
	Mobile mobile1 = new Mobile();
	mobile1.brand="apple";
	mobile1.price=9009;
	Mobile.name="iphon19";
	// mobile1.mobile="smartphone1";
	
	Member mem=new Member();
	mem.name="sunil";
	mem.roll=29;
	
	
	//Mobile.show1(mobile1);
	mobile.Display(mem);
	
	
}

}
