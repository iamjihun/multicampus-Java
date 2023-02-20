package 상속응용;

public class 증가감소스레드사용 {

	public static void main(String[] args) {
		//2. 아까 만든 동시에 돌아가게 하는 스레드 부품 2개를 사용
		감소스레드 감소 = new 감소스레드();
		증가스레드 증가 = new 증가스레드();
		
		//3. 스레드 프로그램 2개 시작
		감소.start();
		증가.start();
	}

}
