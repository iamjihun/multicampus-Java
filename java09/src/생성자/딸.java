package 생성자;

public class 딸 {
	String name;
	char gender;
	static int count;
	static int wallet = 100000;
	
	
	public 딸(String name, char gender) {
		count++;
		this.name = name;
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}


	public void tv보다() {
		System.out.println("전원을 켜서 tv를 보다");		
	}
}
