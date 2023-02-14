package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean die; // boolean -- get,set -->is 라 쓰는게 일반적이다.
	
	// getter 메서드 직접 만들어 보세요 5개
	public String getName() {
		return this.name;
	}
	public int gethp() {
		return this.hp;
	}
	public int getpower() {
		return this.power;
	}
	public double getdefense() {
		return defense;
	}
	public boolean isDie() {
		return die;
	}
	
	// setter 메서드 직접 만들어 보세요 5개
	// 방어적 코드도 추가해보세요 
	public void setPower(int power) {
		if(power <= 0 ) {
			System.out.println("잘못된 입력 값입니다.");
		}else {
			this.power = power;
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setDefense(double defense) {
		this.defense = defense;
	}
	public void setDie(boolean die) {
		this.die = die;
	}
}
