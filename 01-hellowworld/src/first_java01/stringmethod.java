package first_java01;

public class stringmethod {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(s);
		System.out.println("stringlength is " + s.length());
		System.out.println("stringlength is " + s.indexOf('o'));
		System.out.println("stringlength is " + s.charAt(7));
		
		// System.out.println("stringlength is " + s.charAt(12));
		
		System.out.println("command after exception");

		System.out.println("index of l is " + s.indexOf('l'));
		System.out.println("index of 3rd l is " + s.indexOf('l',4));
		
		System.out.println("substring is " + s.substring(4));
		System.out.println("only owo:  " + s.substring(4,8));
		
	}

}
