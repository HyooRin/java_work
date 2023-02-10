package ch04;

// 클래스 설계하기
public class Wizard {
	
	// 상태
	String name;
	int power;
	int hp; 
	int level;
	
	public Wizard(String name, int power, int hp, int level) {
		this.name = name;
		this.power = power;
		this.hp = hp;
		this.level = level;
	}
	
	// 기능 
	public void attack(int count) {
		this.power -= count;		
	}
    public void defence(int count) {
    	this.power -= count;
		
	} 
    public void energydrink() {
    	
    }
    public void showInfo() {
    	System.out.println("상태창");
    	System.out.println("name: " + this.name);
    	System.out.println("power: " + this.power);
    	System.out.println("power: " + this.hp);
    }
	

}// end of main
