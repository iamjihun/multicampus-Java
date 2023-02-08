package 복습;

import java.lang.invoke.SwitchPoint;

//JOptionPane이 javax폴더 아래 swing폴더 아래에 있음을 알려줌.
//위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		
		String t = JOptionPane.showInputDialog("숫자를 맞춰보세요.");
		int me = Integer.parseInt(t);
					
		int target = 77; // 숫자 맞추기를 해 봅시다.
		 // 내가 시도한 값!
		
		// 조건은 비교하는 코드가 들어감. 결과가 무조건 논리형(true/false)
		if (me == target) { //true
			System.out.println("정답입니다.!");
		} else {
			System.out.println("오답입니다.!");
		}
		
		//if문은 조건이 만족하면 처리하고 더 이상 실행되지 않아요!
		//if문은 자체 break기능이 있음.
		String you = "신나";
		switch (you) {
		case "로또":
			System.out.println("정답이다!!");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("오답이다!!");
			break;
		default: // 위의 조건이 다 아닐 때 실행하고 싶은 내용이 있으면 default에 넣어줌. 생략 가능.
			System.out.println("그만해...!!!");
			break;
		}
	}

}
