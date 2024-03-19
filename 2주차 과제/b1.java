package chap01;

import java.util.Scanner;

public class b1 {
	public class Main {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        double w, h, area;

	        // 가로 길이 입력
	        System.out.print("직사각형의 가로 길이를 입력하세요: ");
	        w = in.nextDouble();

	        // 세로 길이 입력
	        System.out.print("직사각형의 세로 길이를 입력하세요: ");
	        h = in.nextDouble();

	        // 넓이 계산
	        area = w * h;

	        // 결과 출력
	        System.out.println("직사각형의 넓이는 " + area + "입니다.");
	    }
	}
}
