package chap01;

import java.util.Scanner;

public class b2 {
	public class Main {
	    public static void main(String[] args) {
	        try (Scanner in = new Scanner(System.in)) {
				int num;

				System.out.print("정수를 입력하세요: ");
				num = in.nextInt();

				String result = (num % 2 == 0) ? "짝수" : "홀수";

				System.out.println(result + "입니다.");
			}
	    }
	}
}
