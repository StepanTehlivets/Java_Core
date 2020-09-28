package ua.academy.lgs;

public class Circle {
	private double radius;
	private double diameter;
 
 
Circle(double radius, double diameter){
	 this.diameter=diameter;
	 this.radius=radius;
 }

public void circumference() {
	 System.out.println("Circle circumference = "+ 2*Math.PI*radius);
	 
 }
 
 public void area () {
  System.out.println("Circle area = "+ Math.PI*diameter/2*diameter/2 );
 }
}