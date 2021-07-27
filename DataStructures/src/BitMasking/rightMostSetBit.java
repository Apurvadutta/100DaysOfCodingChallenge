package BitMasking;

// print value of Right Most Set Bit mask problem.

/* In this problem, 

   1. You are given a number n.
   2. You have to print the right-most set bit mask.
*/

public class rightMostSetBit {

	public static void main(String[] args) {

		int n = 56;
		
		int rmsb = n & (~n + 1);
		
		System.out.println(Integer.toBinaryString(rmsb));
	}

}