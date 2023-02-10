package 배열응용;

import java.util.Scanner;

public class 배열문제2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print("성적을 입력 >> ");
		    number[i] = sc.nextInt();
		}		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		
		System.out.println();
		System.out.println("총합은 " + sum + "점");
		System.out.println("평균은 " + sum/number.length + "점");
	}

}
