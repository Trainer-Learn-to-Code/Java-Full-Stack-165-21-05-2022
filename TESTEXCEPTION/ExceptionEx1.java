package TESTEXCEPTION;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int a = 10, b = 20;

		try {
//			try {
//				String s = "abc";
//				int i = Integer.parseInt(s);
//				System.out.println(i);
//			} catch (Exception e) {
//				System.out.println(e);
//			}

			int a1[] = new int[5];

			// System.out.println(a / 0);
			System.out.println(a1[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		

		}
//		try {
//			String s = null;
//			System.out.println(s.length());
//
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//			System.out.println(e.getStackTrace());
//
//		}
		//System.exit(0);
		finally {
			System.out.println("Always excecuted");
		}
		System.out.println("Hello");

//		catch (Exception e) {
////			System.out.println(e);
//		}
		System.out.println(b + a);
		System.out.println(b * a);
		System.out.println(b - a);
		System.out.println(a + a);
	}
	

}
