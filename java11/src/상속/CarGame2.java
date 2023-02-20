package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.PortableServer.AdapterActivator;

public class CarGame2 extends JFrame {
	
	public static void main(String[] args) {
		CarGame2 f = new CarGame2();
		
		JLabel finishLine1 = new JLabel("|■□■□■□ F ■□■□■□|");
		JLabel finishLine2 = new JLabel("|■□■□■□ I ■□■□■□|");
		JLabel finishLine3 = new JLabel("|■□■□■□ N ■□■□■□|");
		JLabel finishLine4 = new JLabel("|■□■□■□ I ■□■□■□|");
		JLabel finishLine5 = new JLabel("|■□■□■□ S ■□■□■□|");
		JLabel finishLine6 = new JLabel("|■□■□■□ H ■□■□■□|");
		JLabel finishLine7 = new JLabel(" ");
		finishLine1.setBounds(500, 0, 200, 100);
		finishLine2.setBounds(500, 33, 200, 100);
		finishLine3.setBounds(500, 66, 200, 100);
		finishLine4.setBounds(500, 99, 200, 100);
		finishLine5.setBounds(500, 130, 200, 100);
		finishLine6.setBounds(500, 160, 200, 100);
		finishLine7.setBounds(500, 160, 200, 100);
		
		f.add(finishLine1);
		f.add(finishLine2);
		f.add(finishLine3);
		f.add(finishLine4);
		f.add(finishLine5);
		f.add(finishLine6);
		f.add(finishLine7);
		
	}

	public CarGame2() {
		setTitle("나의 자동차 경주게임");
		setSize(700, 500);

		MyThread car1 = new MyThread("자동차1", 100, 0); // car1의 파일과 위치를 설정
		MyThread car2 = new MyThread("자동차2", 100, 75); // ca2의 파일과 위치를 설정
		MyThread car3 = new MyThread("자동차3", 100, 150); // car3의 파일과 위치를 설정

		
		car1.start(); // MtThread 메소드 시작
		car2.start();
		car3.start();

		setVisible(true);
	}

	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String name, int x, int y) {
			this.x = x;
			this.y = y;
			label = new JLabel(name);
			label.setBounds(x, y, 200, 200); // jframe에 붙은 위치 지정
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); // 0~49
				x = x + move; // 100 + 45
				label.setBounds(x, y, 100, 100); // 다시 위치 지정
				if (x >= 600) {
					label.setForeground(Color.red);
					break;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}