package week;

public class ww8 {

	public class Dice {
	    int face;   

	    int roll(){
	        return face;
	    }
	    
	    Dice(){
	        face = (int) (Math.random() * 6) + 1; 
	    }
	}


	public class DiceTest {
	    public static void main(String[] args) {
	        Dice d = new Dice();
	        System.out.println("주사위의 숫자 : " + d.roll());
	    }
	}
}
