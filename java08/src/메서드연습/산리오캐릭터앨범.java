package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.xml.stream.events.StartDocument;

public class 산리오캐릭터앨범 {

	static int index = 2;

	public static void main(String[] args) {

		String[] name = { "쿠로미", "시나모롤", "마이멜로디", "헬로키티", "포챠코" };
		String[] img = { "Kuromi.png", "Cinnamoroll.png", "My_Melody.png", "HelloKitty.png", "Pochacco.png" };
		double[] cuteLevel = { 9.9, 8.5, 7.6, 7.1, 9.2 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(550, 550);

		Font font1 = new Font("함초롬돋움", Font.BOLD, 40);
		Font font2 = new Font("함초롬돋움", Font.BOLD, 30);
		Font font3 = new Font("함초롬돋움", Font.BOLD, 14);

		// 배치부품(객체)를 바꾸어 주지 않으면, 경계레이아웃(Border)를 사용하도록 세팅
		// BorderLayout
		JLabel nameLabel = new JLabel("이름 : " + name[index]);
		nameLabel.setHorizontalAlignment(0);
		nameLabel.setFont(font2);
		f.add(nameLabel, BorderLayout.NORTH);
		nameLabel.setForeground(Color.white);

		JLabel imageLabel = new JLabel();
		ImageIcon image = new ImageIcon(img[index]);
		imageLabel.setIcon(image);
		imageLabel.setFont(font2);
		imageLabel.setHorizontalAlignment(0);
		f.add(imageLabel, BorderLayout.CENTER);

		JLabel footerLabel = new JLabel("귀여움 점수 : " + cuteLevel[index] + "");
		footerLabel.setFont(font2);
		footerLabel.setHorizontalAlignment(0);
		f.add(footerLabel, BorderLayout.SOUTH);
		footerLabel.setForeground(Color.white);

		JButton backBtn = new JButton("◀◀ 이전");
		f.add(backBtn, BorderLayout.WEST);
		backBtn.setBackground(Color.pink);
		backBtn.setFont(font3);
		// 액션처리 하는 방법 1) 액션기능 add
		// 2) 클릭액션이 있을 때 처리할 부품 만들기
		// 3) 클릭액션이 있을 때 어떻게 처리할 지 내용을 써주세요
		backBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 index보다 하나 적은 값들로 세팅
					nameLabel.setText("이름 : " + name[index - 1]);
					footerLabel.setText("귀여움 점수 : " + cuteLevel[index - 1] + "");
					ImageIcon image = new ImageIcon(img[index - 1]);
					imageLabel.setIcon(image);
					index--; // index = index -1; index -= 1
				} else {
					JOptionPane.showMessageDialog(f,"왼쪽 마지막 친구입니다.");
				}
			}

		});

		JButton nextBtn = new JButton("다음 ▶▶");
		f.add(nextBtn, BorderLayout.EAST);
		nextBtn.setBackground(Color.pink);
		nextBtn.setFont(font3);

		nextBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 index보다 하나 적은 값들로 세팅
					nameLabel.setText("이름 : " + name[index + 1]);
					footerLabel.setText("귀여움 점수 : " + cuteLevel[index + 1] + "");
					ImageIcon image = new ImageIcon(img[index + 1]);
					imageLabel.setIcon(image);
					index++; // index = index -1; index -= 1
				} else {
					JOptionPane.showMessageDialog(f,"오른쪽 마지막 친구입니다.");
					
				}		
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
