package 배열응용;

import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {
		
		// 1.
		
		Scanner sc = new Scanner(System.in);
		
		int[] number = new int[5];

		for (int i = 0; i < number.length; i++) {
			System.out.println(i+1 + "번 째 값을 입력하세요. >> ");
			number[i] = sc.nextInt();
		}		
		System.out.println(number[0] + number[2]);
		sc.nextLine();
		
		
		// 2. 
		
		String[] language = new String[3];
		
		for (int i = 0; i < language.length; i++) {
			System.out.println(i+1 + "번 째 언어명을 입력하세요. >> ");
			language[i] = sc.next();
		}		
		System.out.println(language[0] + "보다는 " + language[1]);
		
		sc.close();
	}

}
