package Arrays;
//Majority Element
/*Write a function which takes an array and prints the majority element 
 * (if it exists), otherwise prints “No Majority Element”. A majority 
 * element in an array A[] of size n is an element that appears more 
 * than n/2 times (and hence there is at most one such element). 
 */
public class majorityElement {

	public static void main(String[] args) {
		
		int[] arr = {1,1,3,3,2,1,3,3,3,5,3};
		int n = arr.length;
		
		majorElement(arr,n);
		
	}
	public static void majorElement(int[] arr, int n) {
		
		int count, index = -1;
		int maxCount = 0;
		
		for(int i = 0; i < n; i++) {
			
		    count = 0;
		    
			for(int j = 0; j < n; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}
				
			}
			if(count > maxCount) {
				maxCount = count;
				index = i;
			}
		}
		if(maxCount > n/2) {
			System.out.println(arr[index]);
		}else {
			System.out.println("No majority element");
		}
	}

}
