package ch06;

public class Hero {
	private String name;
	private int hp;
	private int power;
	private boolean defense;
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
	public boolean getdefense() {
		return this.defense;
	}
	public boolean getdie() {
		return this.die;
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
	

}
