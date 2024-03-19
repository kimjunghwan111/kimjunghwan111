package chap01;

import java.util.Scanner;

public class a8 {
	 public static void main(String[] args) {
	        try (Scanner in = new Scanner(System.in)) {
				System.out.print("0~999 사이의 숫자를 입력하세요 : ");
				String input = in.nextLine(); 
				if (!input.matches("[0-9]+")) {
				    System.out.println("잘못된 입력입니다. 0~999 사이의 숫자를 입력하세요.");
				    return; 
				}

				int number = Integer.parseInt(input);

				if (number < 0 || number > 999) {
				    System.out.println("잘못된 입력입니다. 0~999 사이의 숫자를 입력하세요.");
				    return; 
				}
				int sum = 0;
				int digit;
      
				while (number > 0) {
				    digit = number % 10; 
				    sum += digit; 
				    number /= 10; 
				}
				System.out.println("각 자리 수의 합 = " + sum);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
	    }
	}
