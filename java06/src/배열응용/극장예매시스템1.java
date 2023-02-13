package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.PrimitiveIterator.OfDouble;

import javax.naming.spi.ResolveResult;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 극장예매시스템1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장 예매 시스템");
		f.setSize(540, 400);
		// 배치해주는 부품 - FlowLayout

		Font titleFont = new Font("D2Coding", Font.BOLD, 30);
		Font font2 = new Font("D2Coding", Font.BOLD, 20);
		Font font3 = new Font("D2Coding", Font.BOLD, 15);

		JLabel title = new JLabel();
		title.setText("멀티박스 예매시스템");
		title.setFont(titleFont);

		JLabel screen = new JLabel();
		screen.setText("==========================스크린==========================");
		screen.setFont(font3);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(title);
		f.add(screen);

		// 버튼 배열 많이 만들어서 집어넣을 배열 생성
		// 반복해서 f에 add해주세요.
		JButton[] seats = new JButton[18];

		JLabel result = new JLabel("예매 결과");
		result.setForeground(Color.red);
		result.setFont(font2);

		// 예약 여부를 저장하는 배열을 만들어 줍시다.

		int[] booked = new int[18];

		for (int i = 0; i < seats.length; i++) {
			seats[i] = new JButton(i +"");
			f.add(seats[i]);
			seats[i].setFont(font2);

			// 버튼에 액션 기능 add해보자
			seats[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와 줌.
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					if (booked[no] == 1) { // 이미 예약되어 1이 들어있음.
						result.setText("이미 예약된 좌석입니다.");
					} else { // 예약 가능
						booked[no] = 1;
						result.setText(text + "번 좌석 예매 성공");
					}
				}
			});
		}
		f.add(result);
		
		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font2);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌
				// 티켓 한 장당 1만원, 결제금액 프린트
				int count = 0;
				for (int i = 0;  i < booked.length; i++) {
					if (booked[i] == 1) {
						count++;
					}
				}
				JOptionPane.showMessageDialog(f, "남은 좌석 수 : " + (12 - count) + "/12, 총 결제 금액 = " + (10000 * count)+ "원" );
				
			}
		});
		
		f.add(total);

		// 맨 끝에 있어야 함
		f.setVisible(true);
	}

}
