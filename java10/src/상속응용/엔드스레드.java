package 상속응용;

public class 엔드스레드 extends Thread { //run(): 비어있음.
	
	@Override
	public void run() {
		//동시에 처리하고 싶은 내용을 쓰세요.
		for (int i = 0; i < 1000; i++) {
			System.out.println("&");
		}
	}
}
