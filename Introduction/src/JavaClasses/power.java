package JavaClasses;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a no.");
		int firstNum = sc.nextInt();
		
		System.out.println("Enter the power");
		int secondNum = sc.nextInt();   //4
		
		//int c = 1; 
		int product = 1;
		
		for(int i = 1; i <= secondNum; i++) {
			//c = firstNum*firstNum;
			//product *= firstNum; 
			product = product * firstNum; 
		}
		System.out.println(product);
	}

}
//Two numbers are entered through the keyboard.
//Write a program to find the value of one number raised to the power of another.