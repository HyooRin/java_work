package ch03;


public class Customer {
	
	private String name;
	private int balance;
	
	public Customer(String name, int balance ) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}	

	public int getBalance() {
		return balance;
	}
	
	public void buyCoffee(Coffee coffee) {
		if(balance >= coffee.getPrice()) {
			balance -= coffee.getPrice();
		}
	}

	
	
	


	
	

}
