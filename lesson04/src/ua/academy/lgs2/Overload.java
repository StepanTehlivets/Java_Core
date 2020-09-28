package ua.academy.lgs2;

public class Overload {
	private String name;
	private String lastName;
	private int age;

	
	Overload(String name, String last_name, int age){
		this("Іван", "Мураха");
		this.age=age;
	}

	Overload(String name, String last_name){
		this.name=name;
		this.age=age;
	}
	
	
	
}
