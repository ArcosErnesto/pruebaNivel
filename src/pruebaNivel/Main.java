package pruebaNivel;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Seller> sellerList = new ArrayList<Seller>();
		ArrayList<Buyer> buyerList = new ArrayList<Buyer>();
		ArrayList<Item> itemList = new ArrayList<Item>();

		Seller seller1 = new Seller("Voldemor", "Kandor");
		Seller seller2 = new Seller("Jasper", "Mitril");
		Buyer buyer1 = new Buyer("Aragorn", "Kandor");
		Buyer buyer2 = new Buyer("Rodenor", "Mitril");
		Item item1 = new Item("Sword", "Weapon", 2000);
		Item item2 = new Item("Hemlet", "Armor", 750);

		sellerList.add(seller1);
		sellerList.add(seller2);
		buyerList.add(buyer1);
		buyerList.add(buyer2);
		itemList.add(item1);
		itemList.add(item2);

		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				createSeller(sellerList);
				break;
			case 2:
				addItemSeller(sellerList, itemList);
				break;
			case 3:
				notImplemented();
				break;
			case 4:
				notImplemented();
				break;
			case 5:
				createBuyer(buyerList);
				break;
			case 6:
				notImplemented();
				break;
			case 7:
				notImplemented();
				break;
			case 8:
				notImplemented();
				break;
			case 9:
				notImplemented();
				break;
			case 10:
				notImplemented();
				break;
			case 0:
				System.out.println("Saliendo de la aplicación");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 10;

		do {
			System.out.println("\nMENú PRINCIPAL");
			System.out.println("1. Crear un vendedor.");
			System.out.println("2. Añadir un item al inventario de un vendedor.");
			System.out.println("3. Mostrar el ítem más barato de todos los vendedores de una ciudad.");
			System.out.println("4. Consultar los ítems de un vendedor.");
			System.out.println("5. Crear un comprador.");
			System.out.println("6. Realizar la compra de un ítem.");
			System.out.println("7. Consultar los ítems de un Comprador.");
			System.out.println("8. Consultar todos los vendedores que hay en una ciudad.");
			System.out.println("9. Consultar todos los compradores que hay en una ciudad.");
			System.out.println("10. Mostrar todos los ítems de un determinado tipo ordenados por precio (asc).");
			System.out.println("0. Salir de la aplicación.\n");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Opción no válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static void createSeller(ArrayList<Seller> sellerList) {
		System.out.println("Indica el nombre del nuevo vendedor:");
		String name = sc.nextLine();
		System.out.println("Indica la ciudad del nuevo vendedor:");
		String city = sc.nextLine();

		switch (selectSellerType()) {
		case 1:
			Seller farmer = new Farmer(name, city);
			System.out.println("Creado Campesino:");
			System.out.println(farmer);
			sellerList.add(farmer);
			break;
		case 2:
			Seller thief = new Thief(name, city);
			System.out.println("Creado ladrón:");
			System.out.println(thief);
			sellerList.add(thief);
			break;
		case 3:
			Seller merchant = new Merchant(name, city);
			System.out.println("Creado Mercader:");
			System.out.println(merchant);
			sellerList.add(merchant);
			break;
		}

	}

	public static byte selectSellerType() {
		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 3;

		do {
			System.out.println("\nSelecciona el tipo de vendedor");
			System.out.println("1. Campesino.");
			System.out.println("2. Ladrón.");
			System.out.println("3. Mercader.");
			opcion = sc.nextByte();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Opción no válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;

	}

	public static void createBuyer(ArrayList<Buyer> buyerList) {
		System.out.println("Indica el nombre del nuevo comprador:");
		String name = sc.nextLine();
		System.out.println("Indica la ciudad del nuevo comprador:");
		String city = sc.nextLine();

		Buyer buyer = new Buyer(name, city);
		System.out.println("Creado Comprador:");
		System.out.println(buyer);
		buyerList.add(buyer);
	}

	public static void addItemSeller(ArrayList<Seller> sellerList, ArrayList<Item> itemList) {

		System.out.println("Indica el nombre del vendedor:");
		String nameSeller = sc.nextLine();

		for (Seller seller : sellerList) {
			if (nameSeller.equalsIgnoreCase(seller.getName())) {

				System.out.println("Indica el nombre del item:");
				String nameItem = sc.nextLine();
				for (Item item : itemList) {
					if (nameItem.equalsIgnoreCase(nameItem)) {
						seller.addItem(item);

					} else {
						System.out.println("Item no encontrado.");
					}

				}
			} else {
				System.out.println("Vendedor no encontrado.");
			}

		}
	}

	public static void notImplemented() {
		System.out.println("method not implemented");
	}

}
