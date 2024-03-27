package chapter;

public class Circle1 {
	double radius;
	String color;
	
	public Circle1(double r, String C) {
		radius = r;
		color =C;
	}
	
	public Circle(double r, String C) {
		radius =r;
		color ="파랑";
}
	public Circle1(String c) {
		radius = 10.0;
		color = c;
	}
	
	public Circle1() {
		radius = 10.0;
		color = "빨강";
		
	}
}

public class CircleDemo{
	public static void main(String[] args) {
		Circle1 c1 = new circle(10.0,"빨강");
		Circle1 c2 = new circle(5.0);
		Circle1 c3 = new circle("노랑");
		Circle1 c4 = new circle();
		
	}
}