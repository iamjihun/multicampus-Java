package 형변환;

import java.util.HashMap;

public class 사전문제 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("사과", "apple");
		map.put("메론", "melon");
		map.put("바나나", "banana");
		map.put("배", "pear");
		System.out.println(map);
		System.out.println(map.get("사과")); //get(key)
		map.remove("메론");
		System.out.println(map);
		map.replace("바나나", "bananas");
		System.out.println(map);
	}
}
