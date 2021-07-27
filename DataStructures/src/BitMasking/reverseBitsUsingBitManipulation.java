package BitMasking;

//Reverse Bits problem using Bit Manipulation.

/*In this problem,

1. You are given a number.
2. You have to print its binary representation.
3. You also have to reverse the bits of n and print 
   the number obtained after reversing the bits.*/

public class reverseBitsUsingBitManipulation {

	public static void main(String[] args) {

		int n = 56;
		
		boolean flag = false;
		
		int rev = 0;
		int j = 0;
		
		for(int i = 31; i >= 0; i--) {

			int mask = (1 << i);
			
			if(flag){
				
				if((n & mask) != 0) {
					
					System.out.print("1");
					
					int smask = (1 << j);
					rev |= smask;
				}
				else {
					System.out.print("0");
				}
				
				j++;
				
			}else {
				
				if((n & mask) != 0){
					
					System.out.print("1");
					
					flag = true;
					
					int smask = (1 << j);
					rev |= smask;
					j++;
				}
			}
		}
		System.out.println();
		System.out.println(rev);
	}
}