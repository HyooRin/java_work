package ch05;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스번호 : " + this.busNumber);
		System.out.println("승객수 : " + this.passengerCount);
		System.out.println("수익금액 : " + this.money);
	}

}
