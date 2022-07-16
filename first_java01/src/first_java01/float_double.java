package first_java01;

public class float_double {

	public static void main(String[] args) {
		System.out.println("min float value = " + Float.MIN_VALUE);
		System.out.println("max float value = " + Float.MAX_VALUE);
		
		System.out.println("min double value = " + Double.MIN_VALUE);
		System.out.println("max double value = " + Double.MAX_VALUE);
		
		System.out.println("min  long value = " + Long.MIN_VALUE);
		System.out.println("max long value = " + Long.MAX_VALUE);
		
		int val1 = 64;
		float val2 = 64.5f;
		float val2a = (float)64.5;  //casting
		double val3 = 67.5d;        // decimal number default double
		double val3a = 67.51122222333333333444445;
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val2a);
		System.out.println(val3);
		System.out.println(val3a);
		
		int intval=7/2;
		System.out.println(intval);
		float floatval=7/2;
		System.out.println(floatval);
		
		float floatval1=7f/2f;
		System.out.println(floatval1);



	}

}
