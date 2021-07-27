package BitMasking;

//N Bit Gray Code.

/* In this problem, 

 1. The gray code is a binary numeral system where two 
 successive numbers differ in only one bit.
 2. Given a non-negative integer n representing the total 
 number of bits in the code, print the sequence of gray 
 code. A gray code sequence must begin with 0.
*/

import java.util.ArrayList;

public class nBitGrayCode {

	public static void main(String[] args) {

		int n = 3;
		
		ArrayList<String> ans = solution(n);
		
		for(String str : ans) {
			
			for(int i = 0; i < str.length(); i++) {
				
				System.out.print(str.charAt(i) + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<String> solution(int n) {

		if(n == 1) { 
			
			ArrayList<String> bres = new ArrayList<String>();
			
			bres.add("0");
			bres.add("1");
			
			return bres;
		}
		
		ArrayList<String> rres = solution(n -1);
		ArrayList<String> mres = new ArrayList<String>();
		
		for(int i = 0; i < rres.size(); i++) {
			mres.add("0" + rres.get(i));
		}
		
		for(int i = rres.size()-1; i >= 0; i--) {
			mres.add("1" + rres.get(i));
		}
		return mres;
	}
}
/*
                    Example:
                         Input: 2
                         Output: [0,1,3,2]
                         Explanation:
                         00 - 0
                         01 - 1
                         11 - 3
                         10 - 2
                    [0,2,3,1] is also a valid gray code sequence.
                         00 - 0
                         10 - 2
                         11 - 3
                         01 - 1
*/