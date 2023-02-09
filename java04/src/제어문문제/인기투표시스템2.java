package 제어문문제;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 인기투표시스템2 {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);

		JFrame f = new JFrame();
		f.setSize(380, 700);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font titleFont = new Font("D2Coding", 1, 30);
		Font bodyFont = new Font("D2Coding", 1, 20);
		
		JLabel title = new JLabel();
		title.setText("K-pop 인기투표");
		title.setFont(titleFont);
		
		JLabel songTitle1 = new JLabel();
		songTitle1.setText("1. 아이유  - 라일락 ");
		songTitle1.setFont(bodyFont);
		JLabel songTitle2 = new JLabel();
		songTitle2.setText("2. 프로미스나인 - We Go ");
		songTitle2.setFont(bodyFont);
		JLabel songTitle3 = new JLabel();
		songTitle3.setText("3. 스테이씨 - ASAP ");
		songTitle3.setFont(bodyFont);
		
		JLabel voteCount1 = new JLabel();
		JLabel voteCount2 = new JLabel();
		JLabel voteCount3 = new JLabel();
		


		ImageIcon iuJacket = new ImageIcon("iu.png");
		ImageIcon fromisJacket = new ImageIcon("fromis_9.png");
		ImageIcon staycJacket = new ImageIcon("stayc.png");

		// 버튼에 액션기능을 추가 할 때는
		// 1. 액션기능 추가 ==> b1.addActionListener
		// 2. 버튼을 클릭했을 때, 어떤 부품을 처리할지 부품 지정
		// ==> new ActionListener()
		// 3. 버튼을 클릭했을 때 처리 내용을 코딩
		
		JButton b1 = new JButton();
		b1.setIcon(iuJacket);
		b1.addActionListener(new ActionListener() {
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;	
				voteCount1.setText(i + "표");			
			}
		});
		JButton b2 = new JButton();
		b2.setIcon(fromisJacket);
		b2.addActionListener(new ActionListener() {
			int f9 = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				f9++;
				voteCount2.setText(f9 + "표");
			}
		});
		JButton b3 = new JButton();
		b3.setIcon(staycJacket);
		b3.addActionListener(new ActionListener() {
			int s = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				s++;
				voteCount3.setText(s + "표");
			}
		});
	
		f.add(title);
		f.add(b1);
		f.add(songTitle1);
		f.add(voteCount1);
		f.add(b2);
		f.add(songTitle2);
		f.add(voteCount2);
		f.add(b3);
		f.add(songTitle3);
		f.add(voteCount3);

		f.setVisible(true);
	}

}
