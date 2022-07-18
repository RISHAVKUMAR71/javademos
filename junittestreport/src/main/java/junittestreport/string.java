package junittestreport;

public class string {

	public static void main(String[] args) {

		// string literal
		String k = "hello";
		System.out.println(k);

		// char array
		char[] k1 = { 'h', 'e', 'l', 'l', 'o' };
		String s = new String(k1);
		System.out.println(s);

		// byte array
		byte[] k2 = { 65, 66, 67, 68 };
		String s1 = new String(k2);
		System.out.println(s1);

	}

}
