package pruebaNivel;

import java.util.ArrayList;

public class Farmer extends Seller {

	ArrayList<Item> inventory = new ArrayList<Item>();

	public Farmer(String name, String city) {
		super(name, city);
	}

	public void addItem(Item item) {
		if (inventory.size() < 6) {
			inventory.add(item);
		} else {
			System.out.println("[Inventario lleno!- El vendedor no puede comprar el ítem]");
		}

	}

	@Override
	public String toString() {
		return "Farmer: " + super.getName() + ", " + super.getCity() + ".";
	}

}
