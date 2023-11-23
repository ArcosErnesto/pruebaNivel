package pruebaNivel;

import java.util.ArrayList;

public class Merchant extends Seller {

	ArrayList<Item> inventory = new ArrayList<Item>();

	public Merchant(String name, String city) {
		super(name, city);
	}

	public void addItem(Item item) {
		if (inventory.size() < 8) {
			inventory.add(item);
		} else {
			System.out.println("[Inventario lleno!- El vendedor no puede comprar el ítem]");
		}

	}

	@Override
	public String toString() {
		return "Merchant: " + super.getName() + ", " + super.getCity() + ".";
	}

}
