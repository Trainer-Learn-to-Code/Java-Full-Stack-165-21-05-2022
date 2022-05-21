package TESTEXCEPTION;

public class Throw3 {

	public static void main(String[] args) {

		try {
			throw new AgecClassException("Invalid age");
		} catch (AgecClassException e) {
			System.out.println(e);
		}

	}

}
