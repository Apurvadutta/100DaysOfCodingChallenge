package BitMasking;
/*a problem of Bit Manipulation where:
1. You are given a number n.
2. Print the number produced on setting its i-th bit.
3. Print the number produced on unsetting its j-th bit.
4. Print the number produced on toggling its k-th bit.
5. Also, Check if its m-th it is on or off.
   Print 'true' if it is on, otherwise print 'false'.*/
public class basics {
	public static void main(String[] args) {
		int n = 74;
		int i = 4;
		int j = 3;
		int k = 3;
		int m = 4;
		int onmask = (1 << i);
		System.out.println(n | onmask);		
		int offmask = ~(1 << j);
		System.out.println(n & offmask);	
		int tmask = (1 << k);
		System.out.println(n ^ tmask);
		int cmask = (1 << m);
		System.out.println((n & cmask) == 0? false: true);
	}
}