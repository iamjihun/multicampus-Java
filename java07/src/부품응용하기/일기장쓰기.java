package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 일기장쓰기 {
	// 멤버변수 - 안써도 됨.
	// 멤버메서드
	public void open() {
		// JFrame 화면이 보이게하자!
		// System.out.println("화면이 open될 거에요...");
		

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(300, 420);
		f.setLayout(flow);

		Font btnFont = new Font("D2Coding", 2, 20);
		Font labelFont = new Font("D2Coding", 3, 17);
		Font titleFont = new Font("D2Coding", 3, 30);
		Font titleFontBig = new Font("D2Coding", 2, 40);

//		JButton loginBtn = new JButton("로그인🔓");
//		loginBtn.setBackground(Color.PINK);
		JButton saveBtn = new JButton("파일에 일기 저장 💾");
		saveBtn.setFont(btnFont);
		saveBtn.setBackground(Color.blue);
		saveBtn.setForeground(Color.white);

		JLabel border01Label = new JLabel();
		border01Label.setText("==================================");
		border01Label.setForeground(Color.darkGray);
		JLabel border02Label = new JLabel();
		border02Label.setText("==================================");
		border02Label.setForeground(Color.gray);
		JLabel border1Label = new JLabel();
		border1Label.setText("==================================");
		border1Label.setForeground(Color.white);
		JLabel border2Label = new JLabel();
		border2Label.setText("==================================");
		border2Label.setForeground(Color.white);
		JLabel border3Label = new JLabel();
		JLabel border03Label = new JLabel();
		border03Label.setText("==================================");
		border03Label.setForeground(Color.darkGray);
		JLabel border04Label = new JLabel();
		border04Label.setText("==================================");
		border04Label.setForeground(Color.gray);

		border3Label.setText("❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤");
		border3Label.setForeground(Color.pink);
		
		JLabel pageTitleLabel = new JLabel();
		pageTitleLabel.setText("일기 쓰기");
		pageTitleLabel.setFont(titleFont);
		
		JLabel dateLabel = new JLabel();
		dateLabel.setText("오늘의 날짜");
		dateLabel.setFont(labelFont);
		
		JLabel titleLabel = new JLabel();
		titleLabel.setText("오늘의 제목");
		titleLabel.setFont(labelFont);
	
		JLabel bodyLabel = new JLabel();
		bodyLabel.setText("오늘의 내용");
		bodyLabel.setFont(labelFont);
			
		
		JTextField dateInputField = new JTextField(10);
		JTextField titleInputField = new JTextField(10);
		JTextField bodyInputField = new JTextField(10);
		
//		f.add(border1Label);
		f.add(border02Label);
//		f.add(border01Label);
		f.add(pageTitleLabel);
//		f.add(border03Label);
		f.add(border04Label);
//		f.add(border2Label);
//		f.add(border3Label);
		f.add(dateLabel);
		f.add(dateInputField);
		f.add(titleLabel);
		f.add(titleInputField);
		f.add(bodyLabel);
		f.add(bodyInputField);
		f.add(saveBtn);

		f.setVisible(true);
		
			
	}
}
