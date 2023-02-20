package 상속응용;

public class 달러골뱅이앤드스레드사용 {

	public static void main(String[] args) {
		//2. 스레드 사용
		달러스레드 달러 = new 달러스레드();
		엔드스레드 엔드 = new 엔드스레드();
		골뱅이스레드 골뱅이 = new 골뱅이스레드();
		
		//3. 스레드 동시에 돌아가는 프로그램 시작
		달러.start();
		엔드.start();
		골뱅이.start();
	}
}
