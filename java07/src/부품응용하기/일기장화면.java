package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BufferCapabilities.FlipContents;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.lang.model.element.Element;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.TabStop;
import javax.swing.text.AbstractDocument.Content;

public class 일기장화면 {

	public static void main(String[] args) {
		// JFrame, JLabel

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(300, 350);
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
		JTextArea bodyInputArea = new JTextArea(5, 10);
		
		saveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜, 제목, 내용 입력한 것 가져오세요.
				String day2 = dateInputField.getText();
				String title2 = titleInputField.getText();
				String body2 = bodyInputArea.getText();
				System.out.println(day2 + " " + title2 + " " + body2);
				
					// 파일도 만들어주고, 자바프로그램과 file 간의 연결통로 (stream)을
					// 만들어준다.
					// 외부에 있는 파일, 네트워크나 CPU등을 자바에서 연결 할 때는
					// 아주 위험한 상황이라고 인식!!
					// 이렇게 위험한 상황에서 만약 문제가 발생하면 어떻게 처리할 지를 
					// 꼭 써 주어야 함.!!
				try {
					FileWriter file = new FileWriter(day2 + ".txt");
					file.write(day2 + "\n");
					file.write(title2 + "\n");
					file.write(body2 + "\n");
					file.close();
				} catch (IOException e1) {
					// 처리할 내용을 넣어주세요!
					System.out.println("파일로 저장하는 중 문제가 생김!");
				} 
			}
		});
		
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
		f.add(bodyInputArea);
		f.add(saveBtn);

		f.setVisible(true);

	}

}
