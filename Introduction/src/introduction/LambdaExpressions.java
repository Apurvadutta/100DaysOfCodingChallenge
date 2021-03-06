package introduction;

@FunctionalInterface
interface Cab{ // When an interface will have exactly 1 abstract method 
	             //we can say it as a Functional interface.
	//void bookCab(); // -> by default public abstract void bookCab();
	//void bookCab(String source, String destination); // -> by default public abstract void bookCab();
	double bookCab(String source, String destination); // -> by default public abstract void bookCab();
}
/* class UberX implements Cab{
   public void bookCab(){
   System.out.println("UberX Booked!! Arriving soon!!");
   }
  }
 */
public class LambdaExpressions {
	static int instanceVar = 10;
	static int sVar = 100;
	public static void main(String[] args) {
		
		// 1.
		//Cab cab = new UberX();  //Polymorphic Statement
		//cab.bookCab();

	    // 2.
	    // Anonymous Class Implementation
		/* Cab cab = new cab(){
		    @override
		    public void bookCab(){
		    System.out.println("UberX Booked!! Arriving soon!!");
		    }
		  };
		  cab.bookCab();*/  
		// 3.
		//Using Lambda Expression -> Functional Interfaces
		Cab cab = (source, destination)->{
			int localvar = 1000;
			System.out.println("UberX Booked from " + source +
					" to " + destination + "!! Arriving soon!!");
			System.out.println("Local Var is: " + localvar);
			System.out.println("instanceVar is: " + instanceVar);
			System.out.println("Static Variable is: " + LambdaExpressions.sVar);
			return 850.12;
		};
		double fare = cab.bookCab("Bengaluru", "Coorg");
		System.out.println("Fare shall be : " + fare);
	}    

}
