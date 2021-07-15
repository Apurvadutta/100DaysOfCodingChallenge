package Maths;
//Minimum steps to make the product of the array equal to 1.
/*Given an array arr[] containing N integers. In one step, 
 * any element of the array can either be increased or 
 * decreased by one. The task is to find minimum steps required 
 * such that the product of the array elements becomes 1.*/
public class minStepsToMakeProductOne {

	private static int minSteps(int[] a, int n) {
		int steps = 0;
		int negative = 0;
		int zero = 0;
		int positive = 0; 
		for(int i = 0; i < n; i++) {
			if(a[i] == 0) {
				zero++;
			}else if(a[i]<0){
				negative++;
				steps += ((-1) - a[i]); 
			}else {
				positive++;
				steps += (a[i] - 1);
			}
		}
		if(negative%2 == 0) {
			steps += zero;
		}else {
			if(zero > 0) {
				steps += zero; 
			} else {
				steps += 2;
			}
		}
		
		return steps;
	}
	
	public static void main(String[] args) {
		int a[] = {1,4,5,-3,0};
		int n = a.length;
		System.out.println(minSteps(a,n));
	}
}
