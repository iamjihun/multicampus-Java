package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기만들기 {

	public static void main(String[] args) {
		
		FlowLayout flow = new FlowLayout();
		
		ImageIcon calc = new ImageIcon("calculator.png");
		
		JFrame frame = new JFrame();
		frame.setSize(400, 1000);
		
		JLabel pic = new JLabel();
		pic.setIcon(calc);
		JLabel num1 = new JLabel();
		num1.setText("숫자1");
		JLabel num2 = new JLabel();
		num2.setText("숫자2");

		JTextField inputNum1 = new JTextField(10);
		JTextField inputNum2 = new JTextField(10);
			
		Font font = new Font("굴림", 1, 40);
		
		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");
		
		frame.setLayout(flow);
		
		num1.setForeground(Color.green);
		num2.setForeground(Color.green);

		b1.setBackground(Color.blue);
		b1.setForeground(Color.pink);

		b2.setForeground(Color.pink);
		b2.setBackground(Color.blue);
		
		b3.setBackground(Color.blue);
		b3.setForeground(Color.pink);
		
		b4.setBackground(Color.blue);
		b4.setForeground(Color.pink);
		
		inputNum1.setBackground(Color.blue);
		inputNum1.setForeground(Color.pink);
		
		inputNum2.setBackground(Color.blue);
		inputNum2.setForeground(Color.pink);
		
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		num1.setFont(font);
		inputNum1.setFont(font);
		num2.setFont(font);
		inputNum2.setFont(font);
		frame.add(pic);
		frame.add(num1);
		frame.add(inputNum1);
		frame.add(num2);
		frame.add(inputNum2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.setVisible(true);
	}

}
