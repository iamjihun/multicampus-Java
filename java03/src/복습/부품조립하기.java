package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주 써서 RAM에 언제든 사용 할 수 있도록 준비되어 있음.
		//    부품명.기능()
		
		// 2. 자주는 안 쓰는데 쓸 때마다 제공되는 틀을 이용해서 찍어내어 여러 개 만들어
		//    RAM에 저장해 두고 사용. ex) 벽돌
		//    벽돌 b1 = new 벽돌();
		//    벽돌 b2 = new 벽돌();
		//    벽돌 b3 = new 벽돌();
		//    JFrame f = new JFrame();
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setBackground(Color.black);
		
	    JLabel l = new JLabel();
	    l.setText("당신이 생각한 숫자를 입력하세요.");
	    
	    JTextField text = new JTextField(20); //입력칸
	    
	    JButton b = new JButton(); //버튼
	    
	    FlowLayout flow = new FlowLayout();
	    Font font = new Font("D2Coding", 1, 20);
	    Font font2 = new Font("D2Coding", 1, 30);
	    
	    f.setLayout(flow);
	    f.add(l); //f라는 부품위에 l을 조립해서 올려 놔라!
	    //JTextfield를 add해 주세요.
	    f.add(text);
	    f.add(b);
	    
	    l.setFont(font);
	    l.setForeground(Color.white);
	    
	    b.setBackground(Color.red);
	    b.setForeground(Color.white);
	    b.setFont(font);
	    b.setText("숫자 맞추기 게임");
	    
	    text.setFont(font);
	    text.setBackground(Color.pink);
	    text.setForeground(Color.green);
	    
	    //setVisible은 맨 아래에!!
	   	f.setVisible(true);	

	
		
		
	}

}
