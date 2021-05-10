package introduction;

//Functional Interface
interface Calculator{
	void add(int num1, int num2);
	
}
class Calc{
	public static void addSomething(int num1, int num2) {
		System.out.println(num1+" and "+num2+" addition is: "+(num1+num2));
	}
	public void letsAdd(int num1, int num2) {
		System.out.println(num1+" and "+num2+" adds to: "+(num1+num2));
	}
}

//Functional Interface
interface Messenger{
	Message getMessage(String msg);
}

class Message{
	Message(String msg){
		System.out.println(">> Message is: " + msg);
	}
}

public class MethodReferencesApp {

	public static void main(String[] args) {
		
		//Calc.addSomething(10,20);
		
		//1. Reference to a static method
		//Calculator cRef = Calc::addSomething; // Method Reference
		//cRef.add(11, 14);
		
		//2. Reference to a non static method or Instance Method
		//Object Construction Statement for Calc
		//Calc calc = new Calc();
		//Calculator cRef = calc::letsAdd;   // Method Reference
		//cRef.add(12,13);
		
		//3. Reference to a Constructor
		Messenger mRef = Message::new;  //Method Reference
		mRef.getMessage("Search the candle rather than cursing the darkness!!");

		
	}

}
