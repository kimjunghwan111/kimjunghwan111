package type1;

import java.util.Scanner;
public class t7 {

    static String input(String player) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print(player + " : ");
        String input = scanner.next(); 
        return input;
    }

    static void whosWin(String inputC, String inputY) { 
        if (inputC.equals(inputY)) { 
            System.out.println("무승부");
        } else if ((inputC.equals("r") && inputY.equals("s")) || 
                   (inputC.equals("s") && inputY.equals("p")) ||
                   (inputC.equals("p") && inputY.equals("r"))) {
            System.out.println("철수, 승!");
        } else { 
            System.out.println("영희, 승!");
        }
    }

    public static void main(String[] args) {
        String inputC = input("철수");
        String inputY = input("영희");
        whosWin(inputC, inputY);
    }
}
