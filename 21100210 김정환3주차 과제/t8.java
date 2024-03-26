package type1;

public class t8 {

	static int factorial(int n) {
		return switch (n) {
		case 1 -> 1;
		default -> n * factorial(n - 1);  
		};
	}
}
