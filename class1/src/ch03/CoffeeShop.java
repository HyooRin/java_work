package ch03;

public class CoffeeShop {
	
	private int id;
	private String name;
	private String location;
	
	public CoffeeShop(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	

}
