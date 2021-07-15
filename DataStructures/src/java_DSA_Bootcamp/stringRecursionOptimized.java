package java_DSA_Bootcamp;

public class stringRecursionOptimized {

	public static void main(String[] args) {
		 String word = "abc";
		 StringBuilder proc = new StringBuilder("");
		 StringBuilder unproc = new StringBuilder(word);
		 subseq(proc, unproc);
	}

	private static void subseq(StringBuilder proc, StringBuilder unproc) {
		if(unproc.length() == 0) {
			if(proc.length() != 0) {
			System.out.println(proc);
			}
			return;
		}
		char ch = unproc.charAt(0);
		
		unproc.delete(0, 1);
		
		proc.append(ch);
		
		subseq(proc, unproc);
		proc.delete(proc.length()-1, proc.length());
		subseq(proc, unproc);
		unproc.insert(0, ch);
	}

}
