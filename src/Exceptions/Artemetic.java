package Exceptions;

public class Artemetic {

	public static void main(String[] args) {

		int i = 2;
		int arr[] = new int[5];
		String str=null;

		try {
			int result = 20 / i;
			System.out.println(str.length());
			System.out.println(result);
			System.out.println(arr[2]);

		} catch (ArithmeticException e) {
			System.out.println(" you cant divide by zero " + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" your limit is executed");
		}

		catch (Throwable e) {

			System.out.println(" something went wrong " + e);
		}

		System.out.println(" this line need to be executed");
		// System.out.println(result);

	}

}
