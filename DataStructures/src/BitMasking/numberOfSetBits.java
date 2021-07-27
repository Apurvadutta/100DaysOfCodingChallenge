package BitMasking;

// Count total set bits in all numbers from 1 to n.

/*Given a positive integer n, count the total number of set 
 * bits in binary representation of all numbers from 1 to n. */

public class numberOfSetBits {

	public static void main(String[] args) {
		
		int n = 8;
		
		System.out.println(solution(n));
	}

	private static int solution(int n) {
		
		if(n == 0) return 0;
		
		int x = largestPowerOf2inRange(n);
		
		int bTill2x = (1 << (x-1)) * x;
		int msb2xton = n - (1 << x) + 1;
		int rest = n - (1 << x);
		
		int ans = bTill2x + msb2xton + solution(rest);
		
		return ans;
	}

	private static int largestPowerOf2inRange(int n) {

		int x = 0;
		
		while((1 << x) <= n) {
			x++;
		}
		return x - 1;
	}

}