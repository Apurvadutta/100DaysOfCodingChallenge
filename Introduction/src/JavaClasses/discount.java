package JavaClasses;
import java.util.*;
public class discount {
	/*A shop will give discount of 10% if the cost of 
	  purchased quantity is more than 1000.
	-Ask user for quantity
	-Suppose, one unit will cost 100.
	-Judge and print total cost for user.*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the quantity you bought.");
		int n = sc.nextInt();
		int cost = n*100;
		int dis = (cost - (cost*10/100));
		if(cost > 1000) {
			System.out.println("10% Off! new price = " + dis);
		}else {
			System.out.println("Your Price =" + cost);
		}
//		System.out.println(cost);
//		System.out.println(dis);

	}

}
