package ch04;

public class GameTest {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100, 100, 1);
		warrior.attack(1);			
		warrior.attack(1);	
		warrior.defence(1);
		warrior.energydrink(1);
		warrior.showInfo();
				
		

	}

}

