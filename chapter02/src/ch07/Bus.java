package ch07;

public class Bus {
	
	int busNumber;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		
	}
	public void showInfo() {
		System.out.println(this.busNumber +"에"+"name" +"탑승하였습니다.");		
	}
}
