package student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05_Spring {

	public static void main(String[] args) {
		// Student 객체를 3개 생성한다.
		 // 각각의 객체의 평균과 학점을 화면에 출력 한다.
		ApplicationContext ac = new ClassPathXmlApplicationContext("student/applicationContext.xml");
		Student st = ac.getBean("Kim", Student.class);
		System.out.println(st.toString());
		st = ac.getBean("Lee", Student.class);
		System.out.println(st.toString());
		st = ac.getBean("Park", Student.class);
		System.out.println(st.toString());
	}
}
