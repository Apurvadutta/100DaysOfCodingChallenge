package Maths;
//Find the Missing Number
/*You are given a list of n-1 integers and these integers 
 * are in the range of 1 to n. There are no duplicates in 
 * the list. One of the integers is missing in the list. 
 * Write an efficient code to find the missing integer.*/
public class findTheMissingNumber {
	
	private static int missingNum(int[] a, int n) {
		int n_elements_sum = n * (n+1) / 2;
		int sum = 0;
		for(int i = 0; i < n-1; i++) {
			sum += a[i];
		}
		return n_elements_sum - sum;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,10};
		int n = a.length;
		int missing = missingNum(a,n);
		System.out.println(missing);
	}
}
