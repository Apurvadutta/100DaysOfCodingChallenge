package JavaClasses;

class ronik{
	int rollNo = 39; 
}
class bhaiya{
	int age = 16;
	int weight = 60;
}
public class anmol {
	
	int pubgId = 70338294;
	public static void main(String[] args) {
		ronik roll = new ronik();
		System.out.println(roll.rollNo);
		anmol pubg = new anmol();
		System.out.println(pubg.pubgId);     // bhaiya's age is 16 and weight is 60.
		bhaiya obj = new bhaiya();
		System.out.println("bhaiya's age is " + obj.age + " and weight is " + obj.weight);
	}
}
