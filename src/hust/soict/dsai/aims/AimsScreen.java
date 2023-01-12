package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;

public class AimsScreen {
	public static void main(String[] args) {
		// Cao Thanh Tung 20200569
		
		Store store = new Store();
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King1", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars1", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin1", "Animation","George Lucas", 87, 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The lion King2", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Start Wars2", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Aladin2", "Animation","George Lucas", 87, 18.99f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("The lion King3", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Start Wars3", "Science Fiction", "George Lucas", 87, 24.95f);
		Book book1 = new Book("Lots money", "Luther", 12);
		List<String> authors1 = new ArrayList<String>();
	    authors1.add("Yann Martel");
	    Book book3 = new Book("Life Of Pi", "Action and adventure",25.5f, authors1);
	    List<String> authors2 = new ArrayList<>();
	    authors2.add(". Beyond the End of the World");
	    authors2.add("Meagan Spooner");
	    Book book2 = new Book( "Beyond the End of the World", "Young Adult",
	                15.8f, authors2);
		store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, book1, book2, book3);
	    cart.addMedia(dvd1, book2, book3);
		new StoreScreen(store, cart);

	}
}
