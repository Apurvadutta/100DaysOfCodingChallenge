package JavaClasses;

import java.util.Scanner; //importing java class

public class friMorning { // declaring a public class

	public static void main(String[] args) { //main method
		Scanner sc = new Scanner(System.in); //defining object sc of the Scanner class.
		System.out.println("Enter a number");
		int i = sc.nextInt(); //taking input
		System.out.println("the no. is" + i); // printing the output
//		for(int i = 0; i <= 255 ; i++) {
//			System.out.println(i +"." + " " + (char)i);
//		}
	}
}
