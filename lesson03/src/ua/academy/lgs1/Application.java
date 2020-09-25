package ua.academy.lgs1;

public class Application {
public static void main(String[] args) {
	Animal a = new Animal();
	System.out.println("Назва тварини = "+ a.getName()+ ", Швидкість тварини = " + a.getSpeed()+ " км/год, Вік тварини = " + a.getAge());
	a.setName("Бик");
	a.setAge(3);
	a.setSpeed(10);
	System.out.println("Назва тварини = "+ a.getName()+ ", Швидкість тварини = " + a.getSpeed()+ " км/год, Вік тварини = " + a.getAge());
}
}
