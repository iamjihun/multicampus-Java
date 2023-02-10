package 순차문;

import javax.swing.JOptionPane;
//부품이 있는 위치를 알려주는 역할

public class 순차문2 {
	public static void main(String[] args) {
		
		//신장 입력받기
		String height = JOptionPane.showInputDialog("신장(cm)을 입력하세요.");
		
		//체중 입력받기
		String weight = JOptionPane.showInputDialog("체중(kg)을 입력하세요.");
		
		//입력받은 신장, 체중 값을 double값으로 변경. cm로 입력받은 신장값을 m로 변환.
		double heightDouble = Double.parseDouble(height);
		double weightDouble = Double.parseDouble(weight);
		double heightForMeters = heightDouble/100;
		
		//double값으로 BMI계산식 작성.
		double bmi = weightDouble / (heightForMeters * heightForMeters);
		double goodweight = (heightDouble - 100) * 0.9;
		
		//계산한 BMI값을 출력하기.
		System.out.println("당신의 BMI지수는 " + bmi + "입니다.");
		System.out.println("당신의 적정 체중은 " + goodweight + "입니다.");
	}

}