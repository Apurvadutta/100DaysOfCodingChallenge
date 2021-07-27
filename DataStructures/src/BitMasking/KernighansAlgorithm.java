package BitMasking;

//Kernighan's Algorithm in bit manipulation to count the set bits in an integer.

/*In this problem, you are given

  1. You are given a number n.
  2. You have to count the number of set bits in the given number.*/

public class KernighansAlgorithm {

	public static void main(String[] args) {

		int n = 76;
		int count = 0;
		
		while(n != 0) {
			
			int rmsb = n & -n;
			n -= rmsb;
			count++;
		}
		System.out.println(count);
	}
}
