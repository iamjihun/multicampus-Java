package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.element.Element;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.TabStop;

public class 로그인화면 {

	public static void main(String[] args) {
		// JFrame, JLabel

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setBackground(Color.black);
		f.setSize(300, 420);
		f.setLayout(flow);

		Font btnFont = new Font("D2Coding", 2, 15);
		Font labelFont = new Font("D2Coding", 3, 20);
		Font titleFont = new Font("D2Coding", 3, 30);
		Font titleFontBig = new Font("D2Coding", 2, 40);

		JButton loginBtn = new JButton("로그인🔓");
		loginBtn.setBackground(Color.PINK);
		JButton resetBtn = new JButton("리셋✨");
		resetBtn.setBackground(Color.CYAN);

		JLabel border01Label = new JLabel();
		border01Label.setText("==================================");
		border01Label.setForeground(Color.darkGray);
		JLabel border02Label = new JLabel();
		border02Label.setText("==================================");
		border02Label.setForeground(Color.gray);
		JLabel border1Label = new JLabel();
		border1Label.setText("==================================");
		border1Label.setForeground(Color.white);
		JLabel titleLabel = new JLabel();
		titleLabel.setText("일기장 로그인📝");
		titleLabel.setFont(titleFont);
		titleLabel.setForeground(Color.yellow);
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
		JLabel iconLabel = new JLabel();

		JLabel idInputLabel = new JLabel();
		idInputLabel.setText("  아이디   : ");
		idInputLabel.setFont(labelFont);
		idInputLabel.setForeground(Color.pink);
		JLabel pwInputLabel = new JLabel();
		pwInputLabel.setText("패스워드 : ");
		pwInputLabel.setFont(labelFont);
		pwInputLabel.setForeground(Color.pink);
		JTextField idInputField = new JTextField(10);
		idInputField.setHorizontalAlignment(JTextField.CENTER);
		idInputField.setBackground(Color.white);
		// JTextField 입력창 가운데 정렬
		JTextField pwInputField = new JTextField(10);
		pwInputField.setHorizontalAlignment(JTextField.CENTER);
		pwInputField.setBackground(Color.white);
		
		ImageIcon mainIcon = new ImageIcon("title.png");
		iconLabel.setIcon(mainIcon);

		ImageIcon loginIcon = new ImageIcon("login.png");
		ImageIcon resetIcon = new ImageIcon("reset.png");
		loginBtn.setIcon(loginIcon);
		loginBtn.setFont(btnFont);
		resetBtn.setIcon(resetIcon);
		resetBtn.setFont(btnFont);
		
		// JLabel resultLabel = new JLabel();
		
		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idInputField, pwInputField에 공백을 넣어라.!
				idInputField.setText("");
				pwInputField.setText("");
			}
		}); // reset add end
		
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// idInputField, pwInputField에 getText()
				String id2 = idInputField.getText(); //root
				String pw2 = pwInputField.getText(); //1234
				// root/1234인지 비교해서 로그인 성공/실패 띄우기
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					//일기장쓰기 부품의 open()기능 쓰자!!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
					f.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패...");
					idInputField.setText("");
					pwInputField.setText("");
				}
			}
		});

//		f.add(border1Label);
		f.add(border02Label);
//		f.add(border01Label);
		f.add(titleLabel);
//		f.add(border03Label);
		f.add(border04Label);
//		f.add(border2Label);
//		f.add(border3Label);
		f.add(iconLabel);
		f.add(idInputLabel);
		f.add(idInputField);
		f.add(pwInputLabel);
		f.add(pwInputField);
		f.add(loginBtn);
		f.add(resetBtn);

		f.setVisible(true);
	}
}
