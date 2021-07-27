package String;

//Longest Common Prefix using Word by Word Matching

/*Given a set of strings, find the longest common prefix. */

public class longestCommonPrefix {

	public static void main(String[] args) {

		String arr[] = {"apple", "ape", "april"};
		int n = arr.length;
		
		String ans = commonPrefix(arr, n);
		
		if(ans.length() > 0)
			System.out.println(ans);
		else
			System.out.println("No common prefix");
	}

	private static String commonPrefix(String[] arr, int n) {

		String prefix = arr[0];
		
		for(int i = 1; i < n-1; i++) {
			prefix = common(prefix, arr[i]);
		}
		return prefix;
	}

	private static String common(String prefix, String string) {

		int n1 = prefix.length();
		int n2 = string.length();
		
		String result = "";
		
		for(int i = 0; i<n1-1 && i<n2-1; i++) {
			if(prefix.charAt(i) != string.charAt(i)) {
				break;
			}
			result += prefix.charAt(i);
		}
		return result;
	}
}