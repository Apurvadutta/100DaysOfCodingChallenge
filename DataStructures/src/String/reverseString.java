package String;

//Reverse words in a given string

/*Example: Let the input string be “i like this program very much”. 
 * The function should change the string to “much very program this like i”*/
public class reverseString {

	public static void main(String[] args) {

		String str = "i like this program very much";        
		String S[] = str.split(" ");
		String ans = "";
		
		for(int i = S.length-1; i >= 0; i--) {
			ans += S[i] + " ";
		}
		System.out.println(ans);
	}
}