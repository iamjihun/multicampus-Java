package 조건문;

public class IF문5 {

	public static void main(String[] args) {
		// 0123456 <==문자 자릿수 순서
		String ssn = "2055111"; // 주민번호 뒷자리!

		if (ssn.equals("2055111")) // ssn == "1342211" 안 됨. String은 비교 연산자로 비교 불가.
		{
			System.out.println("동일한 지역에서 태어나셨군요!");
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요!");
		}

		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자이시군요!");
			break;

		case '2':
		case '4':

			System.out.println("여자이시군요!");
			break;

		default:
			System.out.println("22세기 사람이시군요!");

		}

	}

}
