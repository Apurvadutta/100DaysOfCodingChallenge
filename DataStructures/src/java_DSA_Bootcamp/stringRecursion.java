package java_DSA_Bootcamp;

public class stringRecursion {

	public static void main(String[] args) {
		 String str = "abc";
		 subseq("", str);
	}

	private static void subseq(String string, String str) {
		if(str.isEmpty()) {
			System.out.println(string);
			return;
		}
		char ch = str.charAt(0);
		str = str.substring(1);
		
		subseq(string+ch, str);
		subseq(string, str);
	}

}
