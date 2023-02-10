package ex12;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Computer[] computers = new Computer[300];
		computers[0] = new DeskTop();
		computers[1] = new DeskTop();
		computers[2] = new MyNoteBook();
		
		for(int i = 0; i < computers.length; i++) {
			// System.out.println("1"); // 300 번
			if(computers[i] != null) {
				computers[i].display();
				if(computers[i] instanceof MyNoteBook) {
					System.out.println("좋은 노트북을 구매했네요");
				}
			}
		}	
	}// end of main
}// end of class
