package ch02;

// sharedResource 상황을 구현해보자 
public class BankAccount {

	int money = 100_000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 입금
	// synchronized <--- 동기화 처리 진행
	public synchronized void saveMoney(int money) {
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금
	public synchronized int withDraw(int money) {
		// 현재 10만원 상태
		//synchronized (this) {
			int currentMoney = getMoney();
			try {
				
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액" + getMoney());
				return money;
			} else {
				System.out.println("잘못된 입력입니다");
				return 0;
			}
			
		//}

	}

}

class Father extends Thread {
	BankAccount account;

	// 생성자 추가
	public Father(BankAccount account) {
		this.account = account;
	}

	// 이것만하면 null 뜸
	@Override
	public void run() {
		// 입금시키기
		account.saveMoney(10_000);
	}

}

class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		account.withDraw(5_000);

	}

}
