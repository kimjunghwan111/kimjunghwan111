package type1;

import java.util.Scanner;

public class t3 {

	public static void main(String[] args) {
		Scanner yanScanner = new Scanner(System.in);
		int yanJungSu = 0;
		int sum = 0;

		do {
			System.out.print("양의 정수를 입력하세요 : ");
			yanJungSu = yanScanner.nextInt();
			while (yanJungSu >= 0) {
				sum += yanJungSu;
				break;
			}

		} while (yanJungSu >= 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);

	}
}
