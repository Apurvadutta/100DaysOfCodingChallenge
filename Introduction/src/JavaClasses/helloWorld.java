package JavaClasses;

public class helloWorld {

	public static void main(String[] args) {
		// this line is to say hello
		//System.out.println("Hello World");
		//program starts from main() method.
		// this single line comment
		/* this is multi
		 * line comment
		 * used for commenin various lines
		 */
		//Variables - to store values in memory 
		int a = 10;
		int b = 15;
		System.out.println(add(a, b));
		//Data types 
//		System.out.println("Hello World");
//		System.out.println("Hello World 2");
//		System.out.println(a);//end of statement
//		syntax : 
//			dataType variableName = value; 
	}
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}

}
