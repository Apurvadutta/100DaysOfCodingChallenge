package JavaClasses;

import java.util.Scanner;

public class nestedIfElse {

	public static void main(String[] args) {
		//Nested If Else = if-else inside an if-else block.
		//WAP to display the largest no. out of 3 nos.
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your age");
		int A = ob.nextInt();
		if(A <= 100) {
			if(A <= 18) {
				System.out.println("He/She will go to School");
			}
			else if(A <= 60) {
				System.out.println("He/She will do his job");
			}
			else {
				System.out.println("He/She is retired.");
			}	
		}
		else if (A <= 150){
			System.out.println("lived a beautiful life");
		}
		else {
			System.out.println("Immortal");
		}
		//assignment operators (=, +=, -=, /=, *=)
	}
	// a = 9; d = 5;
	// d += a;    d = d + a;
	// d

}
