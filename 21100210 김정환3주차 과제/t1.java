package type1;

import java.util.Scanner;

public class t1 {

	public static void main(String[] args) {

		Scanner juScanner = new Scanner(System.in);
		int grade = juScanner.nextInt();

		if (grade >= 19) {                             
			System.out.println("성년");
		} else {                                     
			System.out.println("미성년");
		}
		juScanner.close();

	}
}
