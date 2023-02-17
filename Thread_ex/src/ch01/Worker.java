package ch01;

// 쓰래드 만들어 보기 (생성하는 방법)
// - 상속 활용해서 쓰래드 만들어보기 (작업자 만들어보기)
// 쓰래드 상속한 클래스이다. 즉 Worker는 Thread 이기도 하다 - 다형성 
class Worker extends Thread{
	
	private String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
	// 약속된 부분!!	
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그럼 쓰래드는 run 메서드 안에 있는 부분을 수행시킨다. -- 약속!!!!!!!! 
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("worker  " + name + " : " + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}// end of run !!
