package ch07;

public class Student {
	
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1_000);
		this.money -= 1000;
	
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1_200);
		this.money -= 1200;		
	}
	
	public void showInfo() {
		System.out.println(this.name + "님의 잔액은");
		System.out.println(this.money + "입니다.");
	}

}
