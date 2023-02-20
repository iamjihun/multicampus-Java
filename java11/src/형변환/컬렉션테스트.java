package 형변환;

import java.awt.List;
import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류를 콜렉션(collection)
		// ==> 종류가 많다.
		// ==> 많은 양의 데이터들도 특징이 있고, 그 특징에 따라
		//     콜렉의 종류가 많음.
		// ==> 배열 + 사이즈조절 + 여러 타입 = ArrayList
		ArrayList list = new ArrayList(); // 참조형 변수
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		// toString() 재정의 되어 있어서 가리키는 값들이 프린트!
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// 중간에 삽입
		list.add(2, "홍길동");
		System.out.println(list.get(2));
		// 제거
		list.remove(0); // 파괴함수??? 비파괴함수???
		// 파괴함수 : 원본을 파괴시켜 버리는 함수(원본이 변형, ram에 있는 데이터 변경)
		// 비파괴함수 : 원본은 파괴되지 않는 함수(ram에 있는 데이터 불변)
		System.out.println(0);
		// 변경
		list.set(0, "정길동"); // 파괴함수
		System.out.println(list);
		
		// index 위치 확인
		int index = list.indexOf(true);
		System.out.println(index);
		
		// 포함여부확인
		boolean result = list.contains(11.2);
		System.out.println(result);
	}

}
