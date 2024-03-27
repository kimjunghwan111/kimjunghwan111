package chapter4;

import java.security.PublicKey;

public class phone {
String model;
int value;

void print() {
	System.out.println(value+"만 원짜리"+ model+ "스마트폰");
	}
}

public class PhoneDemo {
	public static Void main(String[]args){
		phone myphonePhone =  new phone();
		myphonePhone.model = "갤럭시 S8";
		myphonePhone.value = 100;
		myphone.print();
		
		phone yourPhone = new phone();
		yourPhone.model = String = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}