package first_java01;

public class sum3_5factor {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				sum += i;

			}

		}
		System.out.print(sum);
	}

}