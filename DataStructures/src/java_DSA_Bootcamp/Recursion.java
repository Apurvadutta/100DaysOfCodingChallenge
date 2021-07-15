package java_DSA_Bootcamp;

public class Recursion {
public static void main(String[] args) {
	int n = 5;	
//	factorial(n);
//	System.out.println(factorial(n));
//	print(n);
	int[] num = {1,3,4,5,7,6,9};
	System.out.println(find(num,8,0));
	}
//public static void print(int n) {
//	if(n == 0) {
//		return;
//	}
//	System.out.println(n);
//	print(n-1);
//	//System.out.println(n);  reverse order
//	
//}
//public static int factorial(int n) {
//	if(n == 0) {
//		return 1;
//	}
//	return n*factorial(n-1);
//}
public static boolean find(int[] num, int elt, int ind) {
	if(ind == num.length) {
		return false;
	}
	if(num[ind] == elt) {
		return true;
	}
	
	return find(num, elt, ind+1);
}
}
