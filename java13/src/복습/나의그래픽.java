package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 200);
		
		JButton b1 = new JButton("나는 버튼");	
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리 할 내용을 코딩!
				// 인터페이스에 반드시 actionPerformed()를
				// 쓰라고 규칙이 정해져 있기 때문에 이름 바꾸면 안됨.
				System.out.println("버튼이 클릭되었음.");
				
			}
		});
		
		f.add(b1);
		
		f.setVisible(true);
	}
}
