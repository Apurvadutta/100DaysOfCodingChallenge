package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sparseArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] strings = new String[n];
		for(int i = 0; i < n; i++) {
			strings[i] = sc.next();
			
		}
		int q = sc.nextInt();
		String[] queries = new String[q];
		for(int j = 0; j < q; j++) {
			queries[j] = sc.next();
			 
		}
		Map<String, Integer> map = new HashMap<>();
		for(int k = 0; k < n; k++) {
		if(map.containsKey(strings[k])) {
			map.put(strings[k], map.get(strings[k])+1);
		}else {
			map.put(strings[k],1);
		    }
		}
		int[] result = new int[q];
		for(int m = 0; m < q; m++) {
			if(map.containsKey(queries[m])) {
				result[m] = map.get(queries[m]);
			}
		}
		for(int m = 0; m < q; m++) {
		System.out.println(result[m]);
		}
	}
}
