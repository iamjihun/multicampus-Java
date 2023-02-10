package 배열응용;

import java.util.Random;

public class 우리반성적변동 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int[] n1 = new int[10000];
		int[] n2 = new int[10000];
		
		for (int i = 0; i < n2.length; i++) {
			n1[i] = r.nextInt(101);
			n2[i] = r.nextInt(101);
		}

		int count = 0; // 동일한 갯수 누적
		int count2 = 0; // 동일하지 않은 갯수 누적
		int count3 = 0; // 동일하지 않은 갯수 누적
		int count4 = 0; // 동일하지 않은 갯수 누적

		for (int i = 0; i < n1.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("점수 유지 : " + count);
		System.out.println("점수 변화 : " + count2);
		
		
		// 2학기에 성적이 더 오른 학생은 몇 명? 누구?
		System.out.print("2학기에 성적 오른 학생 명단 : ");
		for (int i = 0; i < n1.length; i++) {
//			System.out.println(n1[i] < n2[i]);
			if (n1[i] < n2[i]) {
				count3++;
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		System.out.print("2학기에 성적 오른 학생은 " + count3 + "명.");
		System.out.println();
		// 1학기 성적이 더 좋았던 학생은 몇 명? 누구?
		System.out.print("1학기 성적이 더 좋았던 학생 명단 : ");
		for (int i = 0; i < n1.length; i++) {
//			System.out.println(n1[i] < n2[i]);
			if (n1[i] > n2[i]) {
				count4++;
				System.out.print(i + " ");
			} 
		}
		System.out.println();
		System.out.print("1학기 성적이 더 좋았던 학생은 " + count4 + "명.");
	}
}
