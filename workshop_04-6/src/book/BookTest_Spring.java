package book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest_Spring {

	public static void main(String[] args) {
		// 3개의 Book 객체를 생성한다
		// 각각의 Book 객체의 정보를 실행 결과 예와 같이 출력 한다.
		ApplicationContext ac = new ClassPathXmlApplicationContext("book/applicationContext.xml");
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("----------------------------------------");
		Book bk = ac.getBean("SQLPlus", Book.class);
		System.out.println(bk.toString());
		bk = ac.getBean("Java2", Book.class);
		System.out.println(bk.toString());
		bk = ac.getBean("JSPServlet", Book.class);
		System.out.println(bk.toString());

	}

}
