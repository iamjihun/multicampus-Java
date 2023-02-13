package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간(배열, 2개)
		// 배열 하나 당 990개의 저장공간 필요 ==> 실제 생성된 저장공간 갯수
		//	      랜덤으로 데이터를 입력(Random)
		//        반복문으로 배열 위치(index)를 옮기면서 데이터를 넣자.
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
		
		Random r = new Random();
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1; // 1~4
			내답안[i] = r.nextInt(4) + 1; // 1~4
		}
		
		//확인!!
		System.out.println("번호\t:\t답안\t\t내답");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i + "\t:\t" + 답안지[i] + "\t<->\t" + 내답안[i]);
			
		}
		// 처리 :
		
					int jumsu = 0;
					for (int i = 0; i < 내답안.length; i++) {
						if (내답안[i] == 답안지[i]) {
							jumsu++;					
						}//if
					}//for
					
					// 출력 :
					System.out.println("토익점수는 " + jumsu + "점 입니다.");
	}

}
