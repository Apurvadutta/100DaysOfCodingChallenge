package BitMasking;

//Reverse actual bits of the given number

/*Given a non-negative integer n. The problem is to reverse the 
 * bits of n and print the number obtained after reversing the 
 * bits. Note that the actual binary representation of the number 
 * is being considered for reversing the bits, no leading 0’s are 
 * being considered.*/

public class reverseBits {
	
	public static void main(String[] args)
    {
        int n = 11;
        
        System.out.println(reverseBits(n));
    }

	private static int reverseBits(int n) {

		 int rev = 0;
		 
		 while (n > 0)
	        {
			 rev <<= 1;
			 
			 if ((int)(n & 1) == 1)
	                rev ^= 1;
			 
			 n >>= 1;
	        }
		 
		 return rev;
	}

}