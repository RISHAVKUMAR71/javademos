package first_java01;

public class typecastChallange {

	public static void main(String[] args) {
		
		String input = "12";
		byte mybyte = Byte.parseByte(input);
		System.out.println("Byte val= " + mybyte);
		
		char input2 = (char)Integer.parseInt(input); 
		System.out.println(input2);

	}

}
