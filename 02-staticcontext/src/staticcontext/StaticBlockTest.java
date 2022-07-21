package staticcontext;

public class StaticBlockTest {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("inside main method");
		System.out.println("run a query from DB");

	}

	static {
		System.out.println("static block 1");
	}
	static {
		int x = 10;
		System.out.println("static block 2");
		System.out.println("create connection to system");
	}

}
