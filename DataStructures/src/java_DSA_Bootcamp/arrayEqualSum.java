package java_DSA_Bootcamp;

import java.util.ArrayList;

public class arrayEqualSum {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		
		eqSum(first, second, 0, 0, num, 0);
	}

	private static void eqSum(ArrayList<Integer> first, ArrayList<Integer> second, int fsum, int ssum, int[] num, int index){
		if(index == num.length) {
			if(fsum == ssum) {
				System.out.println(first + " : " + second);
			}
			return;
	    }
		int item = num[index];
		first.add(item);
		eqSum(first, second, fsum+item, ssum, num, index+1);
		first.remove(first.size()-1);
		
		second.add(item);
		eqSum(first, second, fsum, ssum+item, num, index+1);
		second.remove(second.size()-1);
		
	}

}
