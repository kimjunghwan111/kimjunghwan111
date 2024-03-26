package typemo;


	import java.util.Scanner;

	public class ty2 {

	    public static int calculateFactorial(int n) {
	        int result = 1;
	        while (n > 0) {
	            result *= n;
	            n--;
	        }
	        return result;
	    }

	    static int factorial(int x) {
	        int r = 1;
	        while (x > 0) {
	            r *= x;
	            x--;
	        }
	        return r;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n;
	        
	        while (true) {
	            System.out.print("팩토리얼 값을 구할 정수: ");
	            n = scanner.nextInt();
	            
	            if (n < 0) {
	                System.out.println("정수를 입력해주세요.");
	            } else {
	                break;
	            }
	        }
	        
	        int factorial = calculateFactorial(n);
	        System.out.println("팩토리얼 값 (calculateFactorial 메서드 사용): " + factorial);
	        
	        int factorialResult = factorial(n);
	        System.out.println("팩토리얼 값 (factorial 메서드 사용): " + factorialResult);
	        
	        scanner.close();
	    }
	}

