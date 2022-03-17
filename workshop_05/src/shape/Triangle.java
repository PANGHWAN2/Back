package shape;

public class Triangle extends Shape implements Resize {
	
	public Triangle() {
	}

	public Triangle(int width, int height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getArea() {
		
		return (width * height) / 2.0; 
	}
	
	public void setResize(int size) {
		this.height = this.height + size;
	}
	
	public String toString() {
		return "Triangle"+"\t" + getArea() + "\t" + color;
	}
}
