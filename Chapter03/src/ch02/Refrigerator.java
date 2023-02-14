package ch02;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고를 끕니다");
		
	}

	@Override
	public void soundOn() {
		System.out.println("띠리링~냉장고 문열림");
		
	}
	

	
}
