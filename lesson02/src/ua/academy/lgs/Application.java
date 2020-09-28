package ua.academy.lgs;

public class Application {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();

		Rectangle rect2 = new Rectangle(20, 90);

		System.out.println("Площа прямокутника = " + rect1.area());
		System.out.println("Периметр прямокутника = " + rect1.perimeter());

		System.out.println("Площа прямокутника = " + rect2.area());
		System.out.println("Периметр прямокутника = " + rect2.perimeter());

		Circle circ1 = new Circle(4.6, 9.2);

		circ1.area();
		circ1.circumference();
	}
}