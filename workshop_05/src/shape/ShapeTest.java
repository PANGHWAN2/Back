package shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		// (1.조건)에서 주어진 데이터를 기반으로 Shape type의 객체를 생성 하여
		// 6개의 도형 객체를 배열에 넣는다.
		 // 모든 객체의 넓이 정보와 색상 정보를 for Loop를 이용하여 화면에 출력 한다
		 // 모든 객체들을 setResize함수를 이용하여 5를 입력 하고 사이즈를 변경 후
		// 화면에 출력 한다. 단 for Loop문을 이용한다.

		Triangle shape1 = new Triangle(7, 5, "Blue");
		Rectangle shape2 = new Rectangle(4, 6, "Blue");
		Triangle shape3 = new Triangle(6, 7, "Red");
		Rectangle shape4 = new Rectangle(8, 3, "Red");
		Triangle shape5 = new Triangle(9, 8, "White");
		Rectangle shape6 = new Rectangle(5, 7, "White");
		shape[0] = shape1;
		shape[1] = shape2;
		shape[2] = shape3;
		shape[3] = shape4;
		shape[4] = shape5;
		shape[5] = shape6;
		System.out.println("기본정보");
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}
		System.out.println("\n사이즈 변경 후 정보");
		shape1.setResize(5);
		shape2.setResize(5);
		shape3.setResize(5);
		shape4.setResize(5);
		shape5.setResize(5);
		shape6.setResize(5);
		for (int i = 0; i < shape.length; i++) {
			System.out.println(shape[i]);
		}
	}
}
