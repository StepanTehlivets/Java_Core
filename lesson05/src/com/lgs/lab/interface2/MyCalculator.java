package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private double a;
	private double b;

	MyCalculator (double a, double b){
		this.a=a;
		this.b=b;
	}

	@Override
	public void plus() {
		double c = a+b;
		System.out.println("Result of adding " + c);

	}

	@Override
	public void minus() {
		double c = a-b;
		System.out.println("Result of substraction " + c);
	}

	@Override
	public void multiply() {
		double c = a*b;
		System.out.println("Result of multiplying " + c);
	}

	@Override
	public void devide() {
		double c = a/b;
		System.out.println("Result of division " + c);
	}

}
