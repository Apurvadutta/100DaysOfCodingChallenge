package loops;

public class primeNums {

	public static void main(String[] args) {
		int sum = 0;
		int flag;
		for(int i = 2; i <=100; i++) {
			flag = 0;
			for(int j = 2; j < i; j++) {
				
				if(i%j == 0) {
					flag = 1;
				}
			}
			if(flag == 0) {
			sum = sum + i;
			}
		}
System.out.println(sum);
	}

}
