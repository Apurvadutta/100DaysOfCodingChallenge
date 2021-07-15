package java_DSA_Bootcamp;

public class clientStack {

	public static void main(String[] args) {
		
		dynamicStack element = new dynamicStack();
		for(int i = 0; i<200; i++) {
			element.push(i);
		}
		System.out.println(element.pop());
		System.out.println(element.peek());
		System.out.println(element.pop());
	}

}
