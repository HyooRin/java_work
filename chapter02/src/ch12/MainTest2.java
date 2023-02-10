package ch12;

public class MainTest2 {

	public static void main(String[] args) {
		
		Computer computerMy = new MyNoteBook();
		Computer DeskTop1 = new DeskTop();
		computerMy.typing();
		computerMy.turnOn();
		DeskTop1.display();
		DeskTop1.turnOn();

	}

}
