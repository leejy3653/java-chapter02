package paint;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		
		drawPoint(p1);
		p1.show(false);
		
		Point p2 = new Point(100, 200);
		drawPoint(p2);
		
		ColorPoint cp1 = new ColorPoint();
		cp1.setX(300);
		cp1.setY(200);
		cp1.setColor("yellow");
		drawPoint(cp1);
		
		Triangle triangle = new Triangle();
		draw(triangle);

		Rect rect = new Rect();
		draw(rect);

		Circle circle = new Circle();
		draw(circle);
	}

	public static void drawPoint(Point point) {
		point.show();
	}

	public static void draw(Shape shape) {
		shape.draw();
	}
	
//	public static void draw(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void draw(Rect rect) {
//		rect.draw();
//	}
//	
//	public static void draw(Circle circle) {
//		circle.draw();
//	}
}
