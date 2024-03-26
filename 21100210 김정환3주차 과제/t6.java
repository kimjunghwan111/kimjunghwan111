package type1;

import java.util.Scanner;

public class t6 {

	public static void main(String[] args) {
        String RspGameInput = "", RspGameInput2 = "";
        Scanner GameInput = new Scanner(System.in);
        boolean goodChoice, goodChoice2, goodChoice3;

        do {
            System.out.println("r 혹은 s 혹은 p 중 하나를 입력해 주세요");
            System.out.print("철수 : ");
            RspGameInput = GameInput.next();
            System.out.print("영희 : ");
            RspGameInput2 = GameInput.next(); 

            goodChoice = RspGameInput.equals("r") || RspGameInput.equals("s") || RspGameInput.equals("p");
            goodChoice2 = RspGameInput2.equals("r") || RspGameInput2.equals("s") || RspGameInput2.equals("p");
            goodChoice3 = (goodChoice && goodChoice2) ? true : false; 

        } while (!goodChoice3); 

        if (RspGameInput.equals(RspGameInput2)) { 
            System.out.println("무승부");
        } else {
            if (RspGameInput.equals("r")) { 
                if (RspGameInput2.equals("s")) { 
                    System.out.println("철수, 승!");
                } else
                    System.out.println("영희, 승!"); 
            } else if (RspGameInput.equals("s")) { 
                if (RspGameInput2.equals("p")) { 
                    System.out.println("철수, 승!");
                } else
                    System.out.println("영희, 승!");
            } else { // 철수값이 무조건 p
                if (RspGameInput2.equals("r")) {
                    System.out.println("철수, 승!");
                } else
                    System.out.println("영희, 승!"); 
            }
        }
        GameInput.close();
    }
}

