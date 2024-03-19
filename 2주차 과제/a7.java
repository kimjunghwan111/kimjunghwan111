package chap01;

import java.util.Scanner;

public class a7 {
	public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			int input = in.nextInt();

			if (((input%4)==0)&&((input%5)==0)) {
			    System.out.println("true");
			} else {
			    System.out.println("false");
			}

			if (((input%4)==0)||((input%5)==0)) {
			    System.out.println("true");
			} else {
			    System.out.println("false");
			}

			if ((((input%4)!=0)&&((input%5)==0))||(((input%4)==0)&&((input%5)!=0))) {
			    System.out.println("true");
			} else {
			    System.out.println("false");
			}
		}
    }
}
