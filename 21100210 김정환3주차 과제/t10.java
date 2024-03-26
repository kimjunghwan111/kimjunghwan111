package type1;

public class t10 {

	public static boolean isPrime(int inputGab){              
        boolean temp = true;
        if (inputGab>1 && (inputGab%2==1) && (inputGab%3!=0)) {     
            temp = true;
        }
        else {
            temp = false;
        }
        return temp;
    }
}

