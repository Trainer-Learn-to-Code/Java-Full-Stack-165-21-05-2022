package ass2;

import java.util.Scanner;

class OddEvenAvg {
	public static void main(String args[]) {
		int i, oddSum = 0, evenSum = 0, oddCount = 0, evenCount = 0; // 1
		double evenAvg, oddAvg; // 2
		Scanner scan = new Scanner(System.in);
//create a scanner object for input
		System.out.print("Enter the value of num: "); // 3
		int num = scan.nextInt();
		for (i = 1; i <= num; i++) { // 4
			if (i % 2 == 0) { // 5
				evenSum = evenSum + i;
				evenCount++;
			} else { // 6
				oddSum = oddSum + i;
				oddCount++;
			}
		}
		evenAvg = evenSum / evenCount; // 7
		oddAvg = oddSum / oddCount;
		System.out.println("Average of odd numbers are: " + oddAvg); // 8
		System.out.print("Average of even numbers are: " + evenAvg);

	}
}