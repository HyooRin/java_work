package ex11;

public class Archer extends Hero{
	
	public Archer(String name, int hp) {
		super(name,hp); // super- 키워드는 부모 생성자를 호출하는 녀석이다.
		System.out.println("Warrior 생성자 마지막 줄 코드");
	}
	
	void fireArrow() {
		System.out.println( name + "전사가 2단공격을 합니다.");
		
	}

	}


}
