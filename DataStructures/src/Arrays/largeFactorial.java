package Arrays;

//Factorial of an Array of integers

/*Given an array with positive integers. The task is to find the 
 * factorial of all the array elements. 
 * 
Note: As the numbers would be very large, print them by taking 
modulus with 109+7.*/

import java.util.*;

public class largeFactorial {
	
	public static Vector<Long> fact = new Vector<Long>();
	
	public static int mod = 1000000007;
	public static int size = 100000;
	
	public static void factorial() {
		
		fact.add((long)1);
		for(int i = 1; i <= size; i++) {
			fact.add((fact.get(i-1)*i)%mod);
		}
	}
	
	public static void main(String[] args) {
		
		int[] num = {5, 7, 10};
		int n = num.length;
		
		factorial();
		
		for(int i = 0; i < n; i++) {
			System.out.print(fact.get(num[i]) + " ");
		}
	}
}