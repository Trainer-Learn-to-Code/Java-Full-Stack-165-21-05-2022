package ass2;

class JavaExample {
	public static void main(String args[]) {
		System.out.print("Odd Numbers from 1 to 50 ");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}