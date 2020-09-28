package ua.academy.lgs3;

public class Application {
	public static void main(String[] args) {
		Frog f = new Frog();
		Amphibia a = f;
		a.eat();
		a.sleep();
		a.swim();
		a.walk();
	}
}
