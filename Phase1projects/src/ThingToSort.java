import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ThingToSort {
	
	try {
		System.out.println("\nEnter number of file to be created:\t");
		Scanner lf = new Scanner(System.in);
		int tlf = lf.nextInt();
		for (int n = 0; n < tlf; n++) {
			Scanner sc3 = new Scanner(System.in);
			String filename = sc3.next();
			
			File sample = new File(filename);
			if (sample.createNewFile()) {
				System.out.println("file created:" + sample.getName());
			}

			else {
				System.out.println("File exist");
			}
		}
	}

	catch (IOException e) {
		System.out.println("error occured");
		e.printStackTrace();
	}

}
