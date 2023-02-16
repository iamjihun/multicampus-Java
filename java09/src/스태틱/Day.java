package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것(객체생성)
		// 객체생성 할 때마다 꼭 처리하고 싶은 내용이 있으면
		// 생성자 메서드 내에서 써주세요.
		// 객체 생성 할 때 생성자메서드가 자동호출 되기 때문에 무조건 처리해 줌.
		super();
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		sum = sum + time;
	}
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
