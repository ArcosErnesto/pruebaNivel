package pruebaNivel;

import java.util.ArrayList;

public class Buyer {

	private String name;
	private String city;
	ArrayList<Item> inventory = new ArrayList<Item>();

	public Buyer(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Buyer: " + name + ", " + city + ".";
	}

}
