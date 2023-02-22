package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		애플컴퓨터 apple = new 애플컴퓨터();
		MS컴퓨터 MS = new MS컴퓨터();
		
		apple.계산하다();
		apple.프로그램을실행하다();
		
		MS.계산하다();
		MS.프로그램을실행하다();
	}
}
