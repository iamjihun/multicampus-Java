package 상속응용;

//동시에 돌아가게 하는 부품인 Thread를 상속받아서 만들면
//내 부품은 동시에 돌아가는 클래스로 만들어진다.
public class 이름스레드 extends Thread {
//동시에 처리하고 싶은 내용을 run()메서드 써주세요.!
	@Override
	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println(i + ": 길동이");
		}
	}
}
