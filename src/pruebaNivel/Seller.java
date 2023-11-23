package pruebaNivel;

public class Seller {
	private String name;
	private String city;

	public Seller(String name, String city) {
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

	public void addItem(Item item) {

	}

	@Override
	public String toString() {
		return "Seller [name=" + name + ", city=" + city + "]";
	}

}
