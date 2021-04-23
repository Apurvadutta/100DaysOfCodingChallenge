package introduction;

public class longestString {
 
	public static String getLongestString(String[] arr) {
		int maxLength = 0;
		String longestString = null;
		for(String s : arr) {
			if(s.length() > maxLength) {
				maxLength = s.length();
				longestString = s;
			}
		}
		return longestString;
	}
	public static void main(String[] args) {
		String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
		String longestString = getLongestString(toppings);
		System.out.println("Longest String = " + longestString);
	}

}
