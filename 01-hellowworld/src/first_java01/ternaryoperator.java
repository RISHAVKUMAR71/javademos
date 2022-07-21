package first_java01;

public class ternaryoperator {
	public static void main(String[] args) {
		int age = 19;
		boolean haslicense = true;
		boolean candrive = (age>18) ? true : false;
		boolean canrentAcar = candrive ? (haslicense ? true:false) : false;
		
		System.out.println("age = " + age);
		System.out.println("has license = " + haslicense);
		System.out.println("can drive ? " + candrive);
		System.out.println("can rent a car " + canrentAcar);
		
	}

}
