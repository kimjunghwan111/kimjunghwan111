package type1;

public class t5 {

	 public static void main(String[] args) {
	        int count = 0;

	        for (int mit = 1; mit <= 20; mit++) {
	            for (int high = 1; high <= 20; high++) {
	                for (int daGak = 1; daGak <= 20; daGak++) {
	                    int mit2 = mit * mit;
	                    int high2 = high * high;
	                    int daGak2 = daGak * daGak;
	                    if (mit + high + daGak <= 20 && daGak2 == mit2 + high2) {
	                        count++;
	                        System.out.printf("%d번째 방법\n", count);
	                        System.out.println("만족하는 밑변의 길이: " + mit);
	                        System.out.println("만족하는 높이의 길이: " + high);
	                        System.out.printf("만족하는 대각선의 길이: %d\n\n", daGak);
	                    }
	                }
	            }
	        }
	    }
	}
