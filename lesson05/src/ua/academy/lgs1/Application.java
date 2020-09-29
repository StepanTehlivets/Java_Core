package ua.academy.lgs1;

public class Application {
	public static void main(String[] args) {
		WorkerWithFixed w1 = new WorkerWithFixed(8900);

		w1.salary();

		WorkerWithHourly w2 = new WorkerWithHourly(176, 65);
		w2.salary();

	}

}