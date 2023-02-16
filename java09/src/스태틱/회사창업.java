package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {

		직원 work1 = new 직원("홍길동", 25, '여');
		직원 work2 = new 직원("김길동", 24, '남');
		직원 work3 = new 직원("송길동", 26, '여');

		System.out.println("우리 회사의 직원 수는? : " + 직원.count + '명');
		System.out.println("직원 1 정보 : " + work1);
		System.out.println("직원 2 정보 : " + work2);
		System.out.println("직원 3 정보 : " + work3);
		System.out.println("우리 회사 직원의 평균 나이는 : " + (직원.sum / (double)직원.count) + '세');
	}
}