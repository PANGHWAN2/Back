package book;

public class BookTest {

	public static void main(String[] args) {
		// 3개의 Book 객체를 생성한다
		// 각각의 Book 객체의 정보를 실행 결과 예와 같이 출력 한다.
		System.out.println("책이름\t\t가격\t할인율\t할인후금액");
		System.out.println("----------------------------------------");
		Book SQLPlus = new Book("SQL Plus", 50000, 5.0);
		System.out.println(SQLPlus.toString());
		Book Java2 = new Book("Java 2.0", 40000, 3.0);
		System.out.println(Java2.toString());
		Book JSPServlet = new Book("JSP Servlet", 60000, 6.0);
		System.out.println(JSPServlet.toString());
	}
}
