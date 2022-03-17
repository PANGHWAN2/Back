package student;
public class Test05 {
	public static void main(String[] args) {
		// Student 객체를 3개 생성한다.
		// 각각의 객체의 평균과 학점을 화면에 출력 한다.
		Student Kim = new Student("Kim", 100, 90, 95, 89);
		System.out.println(Kim.toString());
		Student Lee = new Student("Lee", 60, 70, 99, 98);
		System.out.println(Lee.toString());
		Student Park = new Student("Park", 68, 86, 60, 40);
		System.out.println(Park.toString());
	}
}
