package 부품사용하기;

import 부품만들기.TV;

public class TV사용하기 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch = 10;
		tv1.vol = 9;
		tv1.onOff = true;
		tv1.채널을바꾸다();
		
		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.vol = 14;
		tv2.onOff = false;
		tv2.유튜브보다();
		System.out.println(tv2.ch + " " + tv2.vol + tv2.onOff);
	}

}
