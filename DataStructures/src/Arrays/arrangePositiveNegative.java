package Arrays;
//Rearrange array in alternating positive & negative items.

/* Given an array of positive and negative numbers, arrange them in 
 * an alternate fashion such that every positive number is followed 
 * by negative and vice-versa maintaining the order of appearance. 
 
* Number of positive and negative numbers need not be equal. If there 
* are more positive numbers they appear at the end of the array. If 
* there are more negative numbers, they too appear in the end of the array. */

public class arrangePositiveNegative {
	public static void main(String[] args) {
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		
		int newArr[] = reArrange(arr);
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + ", ");
		}	
	}
	public static int[] reArrange(int arr[]) {		
		int n = arr.length;
		int temp = 0;
		int index = -1;		
		for(int i = 0; i < n; i++) {
			if(arr[i] < 0) {
				index++;
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		int pos = index + 1; 
		int neg = 0;		
		while(neg < pos && pos < n && arr[neg] < 0) {
			
			temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;
			neg += 2;
			pos++;
		}
		return arr;
	}
}
