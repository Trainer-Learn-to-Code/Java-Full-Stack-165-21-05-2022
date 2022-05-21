package ass2;
import java.util.Scanner;	

public class HarmonicSeries {

	public static void main(String args[]) {
	  Scanner in = new Scanner(System.in); 
	  System.out.println("Generates Harmonic Series");
	  System.out.println("---------------------------");
	  System.out.print("Enter Number: ");
	  int number = in.nextInt();
	  int temp = number;
	  double sum = 0;
	  while(temp > 0){
		  sum = sum+((double)1/(double)temp);
		  temp--;
	  }
	  System.out.println("Harmonic Series Output for Number '"+number+"': "+sum);

	}
 } 