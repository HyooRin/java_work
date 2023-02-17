package ch01;

public class ThreadTest2_Ex {

	public static void main(String[] args) {

		Worker2 worker1 = new Worker2("일하자1");
		worker1.start();
		Worker2 worker2 = new Worker2("일하자2");
		worker2.start();

	}// end of main

}// end of class

class Worker2 extends Thread {

	private String name;

	public Worker2(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		int i = 0;
		while (i < 50) {
			System.out.println( name +" i :" + i);
			i++;

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
