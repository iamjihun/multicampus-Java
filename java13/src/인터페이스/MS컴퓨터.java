package 인터페이스;

public class MS컴퓨터 implements 컴퓨터 {

	@Override
	public void 계산하다() {
		System.out.println("윈도우 계산기로 계산하다.");
	}

	@Override
	public void 프로그램을실행하다() {
		System.out.println("윈도우 앱을 실행하다.");
	}

}
