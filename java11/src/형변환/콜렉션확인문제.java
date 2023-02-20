package 형변환;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		// 1. 한 번 갔던 여행지는 가지 않으려고 합니다. 가고 싶은 여행지 5곳을 컬렉션으로
		// 만들어서 프린트
		// 2. 각 방에 물건 배치입니다. 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고,
		// 현관에는 신발의 정보를 컬렉션으로 만들어서 1)프린트, 2)현관에는 무엇이 있나요?
		
		HashSet tour = new HashSet();
		tour.add("제주도");
		tour.add("유럽");
		tour.add("미국");
		tour.add("일본");
		tour.add("호주");
		System.out.println(tour);
		
		HashMap furniture = new HashMap();
		
		furniture.put("안방", "TV");
		furniture.put("거실", "쇼파");
		furniture.put("부엌", "냉장고");
		furniture.put("현관", "신발장");
		
		System.out.println(furniture);
		System.out.println("현관에 있는 가구는? : " + furniture.get("현관"));
		furniture.replace("거실", "책상");
		System.out.println(furniture);
		
		ArrayList todo = new ArrayList();
		todo.add("수업듣기");
		todo.add("복습하기");
		todo.add("방정리하기");
		todo.add("이사준비하기");
		todo.add("통화하기");
		
		System.out.println(todo);
		System.out.println("첫 번째 할 일 : " + todo.get(0));
		System.out.println("두 번째 할 일 : " + todo.get(4));
		
		todo.set(1, "청소하기");
		
		System.out.println(todo);

	}

}
