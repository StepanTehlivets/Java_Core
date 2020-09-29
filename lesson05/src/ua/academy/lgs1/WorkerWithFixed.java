package ua.academy.lgs1;

public class WorkerWithFixed implements Salary {
	private int toPay;

	WorkerWithFixed(int toPay) {
		this.toPay = toPay;
	}

	@Override
	public void salary() {
		System.out.println("We need to pay him " + toPay);

	}

}
