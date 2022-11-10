package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private List<Item> items = new LinkedList<Item>();

	public static void main(String[] args) {
		Mediatheque mediatheque = new Mediatheque();
		
		mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
		mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
		mediatheque.addItem( new CD(12, "Sergeant Peppers"));
		mediatheque.printCatalog();
		mediatheque.printOnlyBooks();
		mediatheque.printOnlyCDs();		
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
            System.out.println("Catalog :");
		for (Item i : items)
			System.out.println(i);
	}
	
	public void printOnlyBooks() {
            System.out.println("Books :");
            BookPrinter printer = new BookPrinter();
            for (Item i : items)
			i.accept(printer);
	}

	public void printOnlyCDs() {
            System.out.println("CDs :");
            CDPrinter printer = new CDPrinter();
            for (Item i : items)
			i.accept(printer);
        }

}
