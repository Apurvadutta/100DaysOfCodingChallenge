package Arrays;
import java.util.Scanner;
public class leftRotation {
	public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int d = sc.nextInt();
             int[] arr = new int[n];
             for(int i = 0; i < n; i++) {
            	 arr[(i+n-d)%n] = sc.nextInt();
             }
             for(int i = 0; i < n; i++) {
            	 System.out.print(arr[i] + " ");
             }
	}
}