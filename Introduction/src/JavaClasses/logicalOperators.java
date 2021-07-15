package JavaClasses;

public class logicalOperators {

	public static void main(String[] args) {
		
		// Logical Operators
		// ( &&, ||, ! )
		int x = 175;
		if(x > 5 && x < 65) System.out.println("both condition are true");
		else System.out.println("one or more condition is false");
		
		if(x < 5 || x < 65) System.out.println("one or more condition are true");
		else System.out.println("both condition are false");
		
		if(!(x > 5 || x < 65)) System.out.println("true");
	      else System.out.println("false");
		
	}

}
