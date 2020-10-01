package ua.academy.lgs;

public class Application {
	public static void main(String[] args) {
		SU27 p = new SU27(21, 6, 16380, 2500, "blue");
	
		p.engineStart();
		p.planeBlastOff();
		p.up();
		p.down();
		p.left();
		p.right();
		p.nuclearAttack();
		p.stealth();
		p.turbo();
		p.planeLanding();
		
		
	}
	
}
