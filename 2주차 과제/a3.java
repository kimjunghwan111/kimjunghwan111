package chap01;

import java.util.Scanner;

public class a3 {
	public static void main(String[] args) {
        double PI = 3.14;
        try (Scanner in = new Scanner(System.in)) {
			System.out.print("원기둥의 밑면 반지름은? ");
			int r = in.nextInt();
			System.out.print("원기둥의 높이는? ");
			int h = in.nextInt();
			System.out.printf("원기둥의 부피는 " + r*r*h*PI);
		}
	}
}
