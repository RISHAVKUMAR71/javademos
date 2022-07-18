import java.util.Scanner;

public class arith_cal {
	public static void main(String[] args) {
		double first_input;
		double second_input;
		double result;
		char operator;

		System.out.print("Enter  any two number to perform operation = ");
		Scanner scan = new Scanner(System.in);

		first_input = scan.nextDouble();
		second_input = (double) scan.nextFloat();

		System.out.print("choose any operator for operation (+, -, *, /)= ");

		operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = first_input + second_input;
			break;
		case '-':
			result = first_input - second_input;
			break;
		case '*':
			result = first_input * second_input;
			break;
		case '/':
			result = first_input / second_input;
			break;
		default:
			System.out.printf("incorrect operator chosen");
			return;
		}
		System.out.print("Result:" + first_input + " " + operator + " " + second_input + " = " + result);

	}
}