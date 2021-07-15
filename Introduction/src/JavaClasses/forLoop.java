package JavaClasses;

public class forLoop {

	public static void main(String[] args) {
		
//		for(initialization; condition/test; increment/decrement) {
//			code block;
//		}
		//Write a program to calculate the sum of first 10 natural number.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum = sum + i;	
			System.out.println("sum = " + sum + "; i = " + i);
		}
		System.out.println(sum);
//		int a = 10;
//		a = 6;
//		System.out.println(a);
//	
	}

}
