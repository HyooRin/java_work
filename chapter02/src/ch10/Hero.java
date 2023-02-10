package ch10;

public class Hero {
	String name;
	int hp;
	
	public  Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println("공격을 합니다.");
	}
	
	public static void main(String[] args) {


		
	}// end of main

}// end of class

class Warrior extends Hero{
	
		
	

	public Warrior(String name, int hp) {
		super("효린", 100);
		
		// TODO Auto-generated constructor stub
	}

	public void comboAttack() {
		System.out.println("콤보공격");
	}
	
	
} // end of Warrior

class Archer extends Hero{
	
	
	public Archer(String name, int hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub
	}

	public void fireArrow() {
		System.out.println("불꽃화살");
	}
	
} // end of Archer

class Wizard extends Hero{
	
	
	public Wizard(String name, int hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub
	}

	public void freezing() {
		System.out.println("얼음공격");
	}
	
} // end of Wizard