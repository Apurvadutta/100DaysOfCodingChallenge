package lambdaExpression;
import java.util.ArrayList;
public class toPrintEveryItemInList {

	public static void main(String[] args) {
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach( (n) -> { System.out.println(n); } );
	}
}