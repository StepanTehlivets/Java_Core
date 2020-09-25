package ua.academy.lgs;

public class Robot {
	public String name;
	public String work;
	
	Robot(String name, String work){
		this.name=name;
		this.work=work;
	}
	Robot(){
		this.name="Robot";
		this.work="я просто працюю";
	}
	
	
	
	
	public void work() {
		System.out.println("Я " + getName() + " - "+ getWork() );
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
