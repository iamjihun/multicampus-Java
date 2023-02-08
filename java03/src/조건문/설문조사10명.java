package 조건문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		int full = 0;
		int hungry = 0;
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("배부른가요? 1-배부름, 2-안부름");
			if (data.equals("1")) {
				full = full +  1; 
				//또는 full++ (최근에는 이걸 선호함, 심플해서)
			} else if (data.equals("2")) {
				hungry = hungry + 1;
				//또는 hungry++
			} else {
				JOptionPane.showMessageDialog(frame, "1 또는 2로만 입력하세요.");
			}
		}
		JOptionPane.showMessageDialog(frame, "배부른 사람 : " + full + "명 / " + "안 배부른 사람 : " + hungry + "명");
	}
}
