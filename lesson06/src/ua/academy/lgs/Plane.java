package ua.academy.lgs;

public abstract class Plane {
	private int length;
	private int width;
	private int weight;
	Plane(int length, int width, int weight){
		this.length=length;
		this.width=width;
		this.weight=weight;
	}
	
	
	int time = (int)  (20 + Math.random()*(88-20));
	double fly = Math.random()*1000;
	public void engineStart() {
		System.out.println("Двигуни запустяться через " + time + " секунд");
	}
	public void planeBlastOff() {
		System.out.println("Літак злетів. Палива в баку вистарчить на " + fly + " кілометрів");
	}
	public void planeLanding() {
		System.out.println("Літак іде на посадку");
	}
	
}
