package ass2;

class Harmonic {
	public static void main(String arg[]) {
		int n, i;
		float sum = 0;

		n = Integer.parseInt(arg[0]);

		for (i = 1; i <= n; i++) {
			sum = sum + (float) 1 / i;
		}

		System.out.println("nSum=" + sum);
	}
}