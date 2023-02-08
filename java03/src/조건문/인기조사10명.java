package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		
		// 인기투표 해봅시다 !!!
		// 1)어텐션 2)하입보이 3)쿠키
	    // 10명에게 인기투표를 받아봅시다.
		
		int a = 0;
		int h = 0;
		int c = 0;
		for (int i = 0; i < 10; i++) {
			String data =JOptionPane.showInputDialog("뉴진스 노래 인기투표 1-어텐션, 2-하입보이, 3-쿠키");
			if (data.equals("1")) {
				a = a + 1;			
			} else if (data.equals("2")) {
				h = h + 1;			
			} else if (data.equals("3")) {
				c = c + 1;			
			} else {
				JOptionPane.showMessageDialog(null, "1, 2, 3으로만 입력해주세요");
			}
		}
		JOptionPane.showMessageDialog(null, "<뉴진스 노래 인기투표> 어텐션 : " + a + "표, 하입보이 : " + h + "표, 쿠키 : " + c + "표"); 
		
	}
}
