package JavaClasses;
import java.util.*;

public class youngest {
	//Take input of age of 3 people by user and 
	//determine oldest and youngest among them.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of all the three brothers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is the elder brother");	
			if(b<c) System.out.println("b is the youngest brother");
			else System.out.println("c is the youngest brother");
		}
		else if(b>c && b>a){
			System.out.println("b is the elder brother");
			if(a<c) System.out.println("a is the youngest brother");
			else System.out.println("c is the youngest brother");
		}
		else {
			System.out.println("c is the elder brother");
			if(a<b) System.out.println("a is the youngest brother");
			else System.out.println("b is the youngest brother");
		}
	}

}
