package Annotation;

interface Express {

	int add(int a, int b);

}

public class LamdaExpression {

	public static void main(String args[]) {

	     Express express =(a,b)->a+b;
	    int results = express.add(20, 80);
		
		System.out.println(results);
	}

}
