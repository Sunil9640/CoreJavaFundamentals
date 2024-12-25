package Package1;


public class MethodOverLoading {
	
	public static void main(String[] args) {
		
		MethodOverloadingSupport mth= new MethodOverloadingSupport();
		
		int result1=mth.add(20, 40);
		int result2= mth.add(89, 60, 40);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
	
}
