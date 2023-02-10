package 배열응용;

import java.util.Random;

import javax.swing.JOptionPane;

public class 수능만점자 {

	public static void main(String[] args) {
		// 랜덤으로 만 명의 점수를 넣어주세요. (0 ~ 450)
		// 수능 만 명의 점수를 처리! ==> 배열 필요
		int[] score = new int[10000];

		// 랜덤으로 10000명을 넣어주세요. ==> Random 필요
		Random r = new Random();

		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451); // 0-450
		}

		// 1. 만점자가 몇 명인지? 누구인지(index)

		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int sum = 0;
		int sum1 = 0;

		System.out.print("만점자는 ");
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 450) {
				count++;
				System.out.print(i + "번 ");
			}
		}
		System.out.println("입니다.");
		System.out.println("만점자는 " + count + "명 입니다.");

		// 2. 0점이 몇 명인지
		System.out.println("빵점자는 " + count + "명 입니다.");

		// 3. 평균은 몇 인지
		for (int i : score) {
			sum = sum + i; // sum += i;
		}
		int avg = sum / score.length;
		System.out.println("평균은 " + avg + "점 입니다.");

		// 4. 심화) 평균보다 +-50점인 학생 카운트
		for (int i : score) {
			if ((i <= (avg + 50)) && (i >= (avg-50))) {
				count1++;
			}
		}
		System.out.println("평균보다 +-50점인 학생 수는 : " + count1 + "명입니다.");
		
		// 5. 30% 범위에 있는 사람이 몇 명인지, 그 사람들의 평균 프린트
		for (int i : score) {
			int cpt = score[i];
			if (score[i] >= cpt) {
				count2++;
				sum1 = sum1 + score[i];
			} 
		} 
		int avg2 = sum1 / count2;
		System.out.println("30% 범위에 있는 사람은 " + avg2 + "명입니다.");
	}

}
