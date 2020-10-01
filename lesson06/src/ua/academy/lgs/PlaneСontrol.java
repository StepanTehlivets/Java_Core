package ua.academy.lgs;

public class PlaneСontrol {


	
	public void MovementUp(){
		int distance= (int) (Math.random()*100);
		System.out.println("Літак рухається на " +distance + " метрів вверх" );  
	}
	public void MovementDown(){
		int distance= (int) (Math.random()*100);
		System.out.println("Літак рухається на " +distance + " метрів вниз" );  
	}
	public void MovementLeft(){
		int distance= (int) (Math.random()*100);
		System.out.println("Літак рухається на " +distance + " метрів вліво" );  
	}
	public void MovementRight(){
		int distance= (int) (Math.random()*100);
		System.out.println("Літак рухається на " +distance + " метрів вправо" );  
	}
}
