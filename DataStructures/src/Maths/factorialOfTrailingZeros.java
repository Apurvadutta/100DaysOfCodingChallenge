package Maths;
//Count trailing zeroes in factorial of a number
/*Given an integer n, write a function that returns count of trailing zeroes in n!.*/
public class factorialOfTrailingZeros {

	public static void main(String[] args) {
		int n = 20;
		System.out.println(trailingZeros(n));
	}

	private static int trailingZeros(int n) {
		if(n < 0) {
			return -1;
		}
		int count = 0;
		for(int i = 5; n/i >= 1; i*= 5) {
			count += n/i;
		}
		return count;
	}

}
