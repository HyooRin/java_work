package ch07;

public class Subway {
	
	int Subwayline;
	int money;
	
	public Subway(int Subwayline) {
		this.Subwayline = Subwayline;
	}
	
	public void take(int money) {
		this.money += money;
		
	}
	public void showInfo() {
		System.out.println(this.Subwayline +"에"+"name" +"탑승하였습니다.");
	}

}
