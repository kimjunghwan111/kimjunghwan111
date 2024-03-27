package chapter;

public class person {
	String name;
	int age;
	
	public person setName(String name) {
		this.name = name;
		return this;
	}
	
	public person setage(int age) {
		this.age =age;
		return this;
	}
	
	public void sayHello() {
		System.out.println("안녕, 나는"+name+"이고"+age+"살이야.");
	}
}

public class MethodChainDemo{
	public static void main(String[] ages) {
		person person = new person();
		person.setName("민국").setage(21).sayHello();
	}
}
