package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;

		System.out.println(p);
		p.eat();

		맨 man = new 맨();
		man.run();
		
		수퍼맨 spman = new 수퍼맨(); // super << 안되는 이유 뭔가 기능이 있어서 (변수명 for로 할 수 없는 것 처럼)
		spman.name = "클라크";
		spman.run();
		spman.sleep();
		spman.space();
		spman.age = 25000;
		spman.power = 6625000;
		
		

	}

}
