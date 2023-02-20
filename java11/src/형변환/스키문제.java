package 형변환;

import java.util.ArrayList;

public class 스키문제 {

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
		
		list.set(1, list.get(1) + "(탈락)");
		
		System.out.println("시상자 목록 : " + list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i +  1) + "위 : " + list.get(i));
		}
		
		System.out.println(list.contains("김연아"));
		System.out.println(list.size());
		
		ArrayList list2 = new ArrayList();
		list.add("이스키");
		list.add("박스키");
		list.add("양스키");
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println(list2.isEmpty());
		System.out.println(list2);
		
		System.out.println(list2.isEmpty()); //false
		list2.clear(); //list 내용 전체 삭제!!
		System.out.println(list2);
	}
}
