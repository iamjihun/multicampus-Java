package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {
	// 크롤링은 인터넷 문서(html)을 다 받아와서,
	// html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://comic.naver.com/index");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list = doc.select(".menu span"); //<a class="nav">
			System.out.println(list.size());
			Element tag = list.get(0);
			System.out.println(tag);
			
			System.out.println();
			
			for (int i = 0; i < list.size(); i++) {
				Element tag2 = list.get(i);
				System.out.println(tag2);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} //html코드를 다 가지고 와서 doc변수에 넣어놨음.
	}
}