package 생성자;

public class MaskUse {
	public static void main(String[] args) {
		Mask m1 = new Mask("흰색", 3000, 5);
		Mask m2 = new Mask("검정색", 2500, 2);
		
		System.out.println(m1);
		System.out.println(m2);
	}

}
