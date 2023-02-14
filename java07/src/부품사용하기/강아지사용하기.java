package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.type = "말티즈";
		d1.weight = 3.5;
		d1.꼬리를움직인다();
		System.out.println("d1은 무슨 종? >> " + d1.type);
		System.out.println("d1의 체중은? >> " + d1.weight + "kg");
		
		System.out.println();
		
		강아지 d2 = new 강아지();
		d2.type = "포메라니안";
		d2.weight = 3.1;
		d2.짖는다();
		System.out.println("d2은 무슨 종? >> " + d2.type);
		System.out.println("d2의 체중은? >> " + d2.weight + "kg");
	}

}
