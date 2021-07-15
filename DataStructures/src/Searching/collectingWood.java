package Searching;

//Binary Search in forest

/*There are n trees in a forest. The heights of the trees is stored in 
 * array tree[], where tree[i] denotes the height of the ith tree in the 
 * forest. If the ith tree is cut at a height H, then the wood collected 
 * is tree[i] - H, provided tree[i] > H. If the total woods that needs 
 * to be collected is exactly equal to k, find the height H at which every 
 * tree should be cut (all trees have to be cut at the same height). If it 
 * is not possible then return -1 else return H.*/

import java.util.Arrays;

public class collectingWood {
	
	public static void main(String[] args) {
		
		int height[] = {1, 7, 6, 3, 4, 7};
		int n = height.length;
		int k = 8;
		
		System.out.println(collectingKWoods(height, n, k));
	}

	private static int collectingKWoods(int[] height, int n, int k) {
		
		Arrays.sort(height);

		int low = 0;
		int high = height[n-1];
		
		while(low <= high) {
			
			int mid = low + ((high-low)/2);
			
			int Collected = woodCollected(height, mid, n); 
			
			if(Collected == k) return mid;
			
			if(Collected > k)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}

	private static int woodCollected(int[] height, int mid, int n) {

		int sum = 0;
		
		for(int i = n-1; i >= 0; i--) {
			if(height[i]-mid <= 0) break;
			sum += height[i] - mid; 
		}
		return sum;
	}
}