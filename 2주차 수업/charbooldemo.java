package chap03;

public class charbooldemo {
	public static void main(String[] args) {
		char gal = '가';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(gal);
		System.out.println((int)gal);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham + "가 아니면" + geojit + "입니다.");
	}

}
