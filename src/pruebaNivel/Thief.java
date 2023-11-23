package pruebaNivel;

import java.util.ArrayList;

public class Thief extends Seller {

	ArrayList<Item> inventory = new ArrayList<Item>();

	public Thief(String name, String city) {
		super(name, city);
	}

	public void addItem(Item item) {
		if (inventory.size() < 4) {
			inventory.add(item);
		} else {
			System.out.println("[Inventario lleno!- El vendedor no puede comprar el ítem]");
		}

	}

	@Override
	public String toString() {
		return "Thief: " + super.getName() + ", " + super.getCity() + ".";
	}

}
