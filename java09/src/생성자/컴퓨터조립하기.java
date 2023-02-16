package 생성자;

public class 컴퓨터조립하기 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "APPLE", 32);
		컴퓨터 com2 = new 컴퓨터(20000, "MS", 24);
		컴퓨터 com3 = new 컴퓨터(3000, "DELL", 27);
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}

}
