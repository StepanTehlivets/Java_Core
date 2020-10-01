package ua.academy.lgs;

public class SU27 extends Plane implements Special  {
	private int maxSpeed;
	private String color;
	private PlaneСontrol pc = new PlaneСontrol();
	
	SU27(int length, int width, int weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed=maxSpeed;
		this.color=color;
	}
	
	public void up() {
		pc.MovementUp();
	}
	
	public void down() {
		pc.MovementDown();
	}
	
	public void left() {
		pc.MovementLeft();
	}
	public void right() {
		pc.MovementRight();
	}
	
	@Override
	public void turbo() {
		int turboSpeed = maxSpeed + (int)(Math.random()*100);

		System.out.println("Використано систему турбоприскорення. Нова швидкість " + turboSpeed+ " км/год");
		
	}

	@Override
	public void stealth() {
		int stealthTime = (int) (Math.random()*10);
		System.out.println("Винищувач неможливо засікти протягом " + stealthTime + " секунд");
	}

	@Override
	public void nuclearAttack() {
	int bombDropped = (int)(Math.random() *10);
		System.out.println("Було скинуто наступну кількість бомб: "+bombDropped );
	}

}
