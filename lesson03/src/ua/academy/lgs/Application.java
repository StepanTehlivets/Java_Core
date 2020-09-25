package ua.academy.lgs;

public class Application {
public static void main(String[] args) {
	CoffeeRobot cr = new CoffeeRobot();
	cr.work();
	RobotDancer rd = new RobotDancer();
	rd.work();
	RobotCooker rc = new RobotCooker();
	rc.work();
	Robot r = new Robot();
	r.work();
	System.out.println("");
	
	Robot[] rarray = {r,cr,rd,rc};
	for (int i = 0; i < rarray.length; i++) {
		rarray[i].work();
	}
	
}
}
