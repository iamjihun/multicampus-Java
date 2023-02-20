package 형변환;

import java.util.LinkedList;

import javax.print.attribute.Size2DSyntax;

public class 시험일정문제 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		
		System.out.println("전체 시험 볼 과목 : " + test);
//		test.remove();
//		System.out.println("1일차 시험 본 후 남은 과목 : " + test);
//		test.remove();
//		System.out.println("2일차 시험 본 후 남은 과목 : " + test);
//		test.remove();
//		System.out.println("3일차 시험 본 후 남은 과목 : " + test);
		
		int size = test.size();
		
		for (int i = 1; i < size; i++) {
			test.remove();
			System.out.println(i + "일차 시험 본 후 남은 과목 : " + test);
		}
	}

}
