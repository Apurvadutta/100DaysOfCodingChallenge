package JavaClasses;

import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
	           sum = sum + i;
	           System.out.println(sum);
		}
		System.out.println(sum);

	}

}

//WAP to display whether a no. is positive, negative or zero.
//and it should always print that the no. is integer.
//Example - 0
//       this is zero
//       it is an integer
//Example 2 - 8
//          this is a positive value
//          it is an integer
//Example 3- -56
//            this is a negative value
//            it is an integer