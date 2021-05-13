package BitManipulation;

public class swapTwoNumbers {

	public static void main(String[] args) {
		int a = 8;
		int b = 16;
		System.out.println("Value of a is " + a + "\nValue of B is " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping");
		System.out.println("Value of a is " + a + "\nValue of B is " + b);

	}

}
