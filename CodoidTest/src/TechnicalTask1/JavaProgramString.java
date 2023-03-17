package TechnicalTask1;

public class JavaProgramString {

	public static void main(String[] args) {

		String s1 = "MadaM";
		int n = 6;
		stringReverse(s1);
		pattern(n);

	}

	// Program No- 1 Reverse The String Q.no - 2
	public static void stringReverse(String s1) {
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);

		}
		System.out.println(rev);

	}
	// ******************************************//

	// Program No - 2 Pattern Q.no - 11
	// *
	// **
	// ****
	// *****
	// ******

	public static void pattern(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();

		}

	}
	// ******************************************//

}
