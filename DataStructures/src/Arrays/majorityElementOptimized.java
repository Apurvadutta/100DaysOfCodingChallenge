package Arrays;
//Majority Element
/*Using Moore’s Voting Algorithm*/
public class majorityElementOptimized {

	public static void main(String[] args) {
		
		int arr[] = {4,6,5,4,5,7,5,5,5};
		int n = arr.length;
		
		findMajority(arr,n);
		
	}

	private static void findMajority(int[] arr, int n) {
		
		int arrIndex = 0;
		int count = 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] == arr[arrIndex]) {
				count++;
			}else {
				count--;
			}
			if(count == 0) {
				arrIndex = i;
				count = 1;
			}
		}
		
		int majorNum = arr[arrIndex];
		int counter = 0;
		
		for(int j = 0; j < n; j++) {
			if(arr[j] == majorNum) {
				counter++;
			}
		}
		
		if(counter > n/2) {
			System.out.println(majorNum);
		}else {
			System.out.println("No majority element");
		}
	}

}
