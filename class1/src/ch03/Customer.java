package ch03;


public class Customer {
	
	private int id;
	private String name;
	private String email;
	private String phone;
    //List<coffee> orders;
	
	public Customer(int id, String name, String email, String phone) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	

}
