package ua.academy.lgs1;


public class WorkerWithHourly implements Salary {
	private int hoursWorked;
	private int hourlyPayment;

	WorkerWithHourly(int hoursWorked, int hourlyPayment) {
		this.hoursWorked = hoursWorked;
		this.hourlyPayment = hourlyPayment;

	}

	@Override
	public void salary() {
		System.out.println("We need to pay him " + hoursWorked * hourlyPayment);

	}
}