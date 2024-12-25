package Package1;

class Calc{
	
	public  void add() {
		 System.out.println("hello word this is for  TEsting");
		
	}
	
	public String GetmePen(int cost) {
		
		if(cost < 10) {
			System.out.println(" the cost for pen is mini 10 ");
		}else {
		return "Getting pen";
		}
		
		return "";
	}
}


public class ForLopp1 {
	
	public static void main(String[] args) {
		int num1=19;
		int num2=30;
		
		Calc calc= new Calc();
          calc.add();
       String str= calc.GetmePen(10);
       System.out.println(str);
	}

}
