package Package1;

public class If_else {
    
	public static void main(String[] args) {
		
		int a=60;
		int b=80;
		int c=30;
		
		if(a>b && a>c) {
			System.out.println(a + " is the greatest value ");
		}
			
		else if (b>a && b>c) {
			System.out.println(b + "is the greatest value");
		}else {
			System.out.println(c + "c is greater");
		}
		
	}

}
