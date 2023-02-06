package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적으로 판단을 하고 싶은데, 조건이 두 개 이상이어서
		//어떻게 판단해야 할 지 모르는 경우 사용
		int id = 1111;
		int id2 = 2222;
		
		int pw = 3333;
		int pw2 =3333;
		
		//아이디가 동일한지 비교! ==사용
		//패스워드가 동일한지 비교!
		 
		System.out.println("아이디가 같습니까? " + (id == id2));
		System.out.println("패스워드가 같습니까? "+ (pw == pw2));
		//&&, and조건, 두 조건이 모두 맞아야 맞다고 판단!
		System.out.println("아이디와 패스워드가 모두 같습니까? " + (id == id2 && pw == pw2));
		
		int mem1 = 111;
		int mem2 = 223;
		//||, or조건, 조건 중에서 하나만 맞으면 맞다고 판단!
		System.out.println(mem1 == 111 || mem2 == 222);
		
		
		
	}

}
