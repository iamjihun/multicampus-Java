package 배열응용;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class 입력받아배열문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;

		String[] tour = new String[3];
		String[] tour2 = new String[3];

		for (int i = 0; i < tour.length; i++) {
			System.out.println("작년에 가고 싶었던 곳 세 곳 입력 >> (" + (i + 1) + ")");
			tour[i] = sc.next();
		}
		for (int i = 0; i < tour.length; i++) {
			System.out.println("올 해 가고 싶은 곳 세 곳 입력 >> (" + (i + 1) + ")");
			tour2[i] = sc.next();
		}

		for (int i = 0; i < tour2.length; i++) {
			if (tour[i].equals(tour2[i])) {
				count++;
			}
		}
	
		System.out.println("작년과 올해의 우선순위가 동일한 곳은 : " + count + "곳.");

	}

}
