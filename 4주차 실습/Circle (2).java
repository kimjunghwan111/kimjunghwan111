package chapter1;

public class Circle {
	double radius;
	static int numofcircles = 0;
	int numcircles =0;
	
	public Circle (double radius) {
		this.radius=radius;
		numofcircles++;
		numcircles++;
	}
}

public class CircleDemo{
	public static void main(String[] args) {
		Circle myCircle= new Circle(10.0);
		Circle yourCircle = new Circle(10.0);
		Circle yourCircle = new Circle(5.0);
		
		System.out.println("원의 개수 :"+Circle.numofCircles);
		System.out.println("원의 개수 :"+yourCircle.numofCircles);
	}
	
	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}
