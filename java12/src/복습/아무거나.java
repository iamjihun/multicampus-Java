package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// index(순서)를 가지고 있다. 직접접근!
		ArrayList list = new ArrayList();
		list.add("아무거나1"); // String ---> Object (자동형변환)
		list.add(100); // int(기본형) --오토박싱--> Integer(랩퍼클래스) -> Object
		list.add(11.22); // double(기본형) --오토박싱--> Double(랩퍼클래스, 포장클래스) ---> Object
		list.add(new JButton()); // JButton  ---> Object
		
		// Integer <-----오토박싱----   int 
		//   int   ----오토언박싱----> Integer 
		
		String name = (String)list.get(0); // 직접접근! 랜덤엑세스 가능! 강제형변환
		// Object -> String 강제형변환
		System.out.println(name);
		
		int age = (int)list.get(1);
		// Object -> Integer -> int 오토언박싱, 강제형변환 
		System.out.println(age);
	}

}
