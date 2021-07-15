package JavaClasses;
import java.util.*;
public class ifElseProgram {
	public static void main(String[] args) {
			    Scanner ob =new Scanner(System.in);
			    System.out.println("Enter marks");
			    int a = ob.nextInt();
			    char val;
			    if(a>40) {
			      if(a==100) {
			        System.out.println("E Grade");
			        val = 'E';
			      }
			      else if(a>89) {
			        System.out.println("O Grade");
			        val = 'O';
			      }
			      else if(a>79) {
			        System.out.println("A Grade");
			        val = 'A';
			      }
			      else if(a>69) {
			        System.out.println("B Grade");
			        val = 'B';
			      }
			      else if(a>59) {
			        System.out.println("C Grade");
			        val = 'C';
			      }
			    else if(a>40) {
			      System.out.println("Just pass");
			      val = 'P';
			    }
			    else {
			      System.out.println("Failed!!");
			      val = 'F';
			    }
			    switch(val)
			    {
			    case 'E':
			    System.out.println("Excellent");
			    break;
			    case 'O' :
			    System.out.println("Outstanding");
			    break;
			    case 'A':
			    System.out.println("A++");
			    break;
			    case 'B':
			    System.out.println("B++");
			    break;
			    case 'C':
			    System.out.println("Can do better");
			    break;
			    case 'P':
			    System.out.println("Needs to improve");
			    break;
			    default:
			    System.out.println("He Failed.");
			      
			    }
	}

	}
}
