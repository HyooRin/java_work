package ch04;

// 전사 클래스 설계하기
public class Warrior {
	
	// 상태
	String name;
	int power;
	int hp; 
	int level;
	
	public Warrior(String name, int power, int hp, int level) {
		this.name = name;
		this.power = power;
		this.hp = hp;
		this.level = level;
	}
	
	// 기능
	public void attack(int count) {
		this.hp -= count;
		System.out.println(count + "만큼 공격했습니다.");
	}
    public void defence(int count) {
    	System.out.println(count + "방어성공");
	} 
    public void energydrink(int count) {
    	this.hp += (count * 10);
    }
    public void level(int count) {
    	if(power%5 ==0 ) {
    		System.out.println("레벨 up하였습니다.");
    		this.level += 1;
    		
    	}
    	
    }
    public void showInfo() {
    	System.out.println("===상태창===");
    	System.out.println("name: " + this.name);
    	System.out.println("power: " + this.power);
    	System.out.println("hp: " + this.hp);
    	System.out.println("level: " + this.level);
    }
	

}
