package JavaClasses;

import java.util.Scanner;

public class operatorsInJava {

	public static void main(String[] args) {
		//Scanner ob = new Scanner(System.in);
		//System.out.println("Enter two no.");
		int a = 10, res = 0;
		//int b = ob.nextInt();
//		double A = ob.nextDouble();
//		double B = ob.nextDouble();
		//System.out.println(a + b);           returns sum
		//System.out.println(a - b);           returns subtracted value
		//System.out.println(a * b);           returns product
		//System.out.println(A / B);           returns quotient
		//System.out.println(a % b);             //returns remainder
//		res += a; // res = res + a;
//		res *= a;
		
		System.out.println(a++);    //11       //postfix   a = a + 1;
		System.out.println(a);
		System.out.println(++a);             //prefix    1 + a
		System.out.println(a);
//		System.out.println(a--);         //postfix 
//		System.out.println(--a);        // prefix
		// operators
		/*Arithemetic Operators
		(+, -,  /, *, %, ++, --)
		*/
		/* Assignment Operators // to assign values
		 * (=)
		 */
		/* Conditional Operators
		 * ( >, <, >=, <=, ==, !=)
		 */
		/* Conditional Statements
		 * if-else, if-else-if, switch case
		 */
//		int a = 18;
//		if(a >= 18) {
//			System.out.println("he will not go outside alone");
//		}
//		else {
//			System.out.println("He can go outside alone");
//		}
//		int noOfCoronaCasses =99;
//		noOfCoronaCasses++;
//		System.out.println(noOfCoronaCasses);
//		if(noOfCoronaCasses == 0) {
//			System.out.println("you can go to school");
//		}
//		else if(noOfCoronaCasses <= 20) {
//			System.out.println("you can go to school");
//		}
//		else {
//			System.out.println("No need to study!! Enjoy!!");
//		}
		//if he scores 100 he gets E grade
		            /*above 89 gets O grade
		            above 79 gets A grade
		            above 69 gets B grade
		            above 59 gets C grade
		            below 40 he fails!!*/
		/*using switch case print Excellent if he gets E grade
		                  print Outstanding if he gets O grade
		                  print A++ if he gets A grade
		                  print B++ if he gets B grade
		                  print need to improve if he gets C grade
		                  print Failed!! if he fails*/
	}
}
