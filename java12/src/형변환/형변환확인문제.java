package 형변환;

import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class 형변환확인문제 {
	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		
		me.add(1000); // int -> Integer -> Object 업캐스팅
		me.add(180.2); // double -> Double -> Object 업캐스팅
		me.add(false); // boolean -> Boolean -> Object 업캐스팅
		me.add('남'); // char -> Character -> Object 업캐스팅
		
		// ArrayList는 toString()이 재정의 되어있음.
		// me는 참조형이기 때문에 me를 프린트하면 주소가 프린트 됨.
		// toString()이 재정의되면 주소가 가리키는 값들이 프린트 됨.
		// me를 찍어보면 주소대신 String으로 만든 내용들이 출력 됨.
		System.out.println(me);
		
		int money = (Integer)me.get(0); // 다운캐스팅
		System.out.println(money + 2000);
		
		double height = (Double)me.get(1); // 다운캐스팅
		System.out.println(height + 10);
		
		boolean breakfast = (Boolean)me.get(2); // 다운캐스팅
		if (breakfast == true) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		char gender = (Character)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호는 1, 3이에요");
		}else if (gender == '여') {
			System.out.println("주민번호는 2, 4에요");
		}else {
			System.out.println("사람이 아닙니다.");
		}
	}
}
