package 인터페이스;

public class 애플컴퓨터 implements 컴퓨터 {

	@Override
	public void 계산하다() {
		System.out.println("애플계산기로 계산하다");
		
	}
	@Override
	public void 프로그램을실행하다() {
		// TODO Auto-generated method stub
		System.out.println("앱스토어에서 프로그램을 실행하다.");
	}
}
