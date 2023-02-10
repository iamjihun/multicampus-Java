package 배열응용;

import java.awt.datatransfer.StringSelection;

public class 배열여러개사용하기2 {

	public static void main(String[] args) {

		String[] name = {"홍길동", "이순신", "뉴진스", "방탄", "블랙핑크"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		
		int count = 0;
		int count2 = 0;
		
		//1. 2학기 성적이 오른 학생 몇 명?
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			}
		}
		System.out.println("2학기 성적이 오른 학생 : " + count + "명");
		
		//2. 1학기, 2학기 성적이 동일한 학생 몇 명?'
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			}
		}
		System.out.println("1학기, 2학기 성적이 동일한 학생 : " + count2 + "명");
		
		//3. 2학기 학생 중 만점인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점인 학생 : " + name[i] + ", 번호 : " + i);
			}
		}
		
		//4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < term1.length; i++) {
			sum1 = sum1 + term1[i];
		}
		
		for (int i = 0; i < term2.length; i++) {
			sum2 = sum2 + term2[i];
		}
		
		int avg1 = sum1 / name.length;
		int avg2 = sum2 / name.length;
		
		if (avg1 > avg2) {
			System.out.println("1학기의 평균성적이 더 높습니다.");
		} else {
			System.out.println("2학기의 평균성적이 더 높습니다.");
		}
		
		//5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		System.out.println("뉴진스의 1학기 성적은 : " + term1[2] + "점 입니다.");
		System.out.println("뉴진스의 2학기 성적은 : " + term2[2] + "점 입니다.");
		
		//6. 뉴진스가 몇 번에 있는지 인덱스를 찾아주세요.
		for (int i = 0; i < name.length; i++) {
			//스트링 비교는 equals()
			if (name[i].equals("뉴진스")) {
				System.out.println("뉴진스는 " + i + "번 index 입니다.");
			}
		}
	}

}
