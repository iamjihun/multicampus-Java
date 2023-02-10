package 복습;

public class 배열연습 {

	public static void main(String[] args) {
		String[] tour = {"속초", "경주", "부산", "제주", "단양"};
		char[] color = {'b', 'g', 'r', 'y', 'o'};
		double[] height = {167.4, 162.4, 168.1, 160.3, 159,8};
		
		for (String t : tour) {
			System.out.print(t + " ");
		} System.out.println();
		for (char c : color) {
			System.out.print(c + " ");
		} System.out.println();
		for (double h : height) {
			System.out.print(h + " ");
		}
	}

}
