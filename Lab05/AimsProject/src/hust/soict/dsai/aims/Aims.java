package hust.soict.dsai.aims;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store;
public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS: ");
        System.out.println("-----------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("-----------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("-----------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

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
//    	DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
//    	DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
//        Scanner sc = new Scanner(System.in);
//        Scanner scString = new Scanner(System.in);
//        
//        List<String> authors1 = new ArrayList<String>();
//        authors1.add("Yann Martel");
//        Book book1 = new Book("Life Of Pi", "Action and adventure",
//                25.5f, authors1);
//        List<String> authors2 = new ArrayList<>();
//        authors2.add(". Beyond the End of the World");
//        authors2.add("Meagan Spooner");
//        Book book2 = new Book( "Beyond the End of the World", "Young Adult",
//                15.8f, authors2);
//
//        Store store = new Store();
//        store.addMedia(dvd1);
//        store.addMedia(dvd2);
//        store.addMedia(book1);
//        store.addMedia(book2);
//
//        Cart cart = new Cart();
//        int opt = 1;
//        int storeOpt = 1;
//        int mediaOpt = 1;
//        int cartOpt = 1;
//        int filterOpt = 1;
//        int sortOpt = 1;
//        String title;
//
//        Media mediaStore;
//        Media mediaCart;
//        do {
//            showMenu();
//            opt = sc.nextInt();
//            switch (opt) {
//                    case 1:
//                        store.displayStore();
//                        do {
//                            storeMenu();
//                            storeOpt = sc.nextInt();
//                            switch (storeOpt) {
//                                //1. See a media’s details
//                                case 1:
//                                    System.out.print("Enter title of media: ");
//                                    title = scString.nextLine(); //enter title of media want to view
//                                    mediaStore = store.searchInStore(title); //search media
//                                    if (mediaStore != null) {
//                                        mediaStore.toString(); //display that media detail
//                                        do {
//                                            mediaDetailsMenu();
//                                            mediaOpt = sc.nextInt();
//                                            switch (mediaOpt) {
//                                                case 1:
//                                                    cart.addMedia(mediaStore);
//                                                    break;
//                                                case 2:
//                                                    if (mediaStore instanceof DigitalVideoDisc) {
//                                                        ((DigitalVideoDisc) mediaStore).play();
//                                                    } else {
//                                                        System.out.println("This media can not play !");
//                                                    }
//                                                    break;
//                                                case 0:
//                                                    break;
//                                                default:
//                                                    System.out.println("Option invalid !");
//                                                    break;
//                                            }
//                                        } while (mediaOpt != 0);
//                                    } else {
//                                        System.out.println("Media does not exits in store !");
//                                    }
//                                    
//                                    break;
//                                //2. Add media to cart
//                                case 2:
//                                    System.out.print("Enter title of media: ");
//                                    title = scString.nextLine(); //enter title of media want to view
//                                    mediaStore = store.searchInStore(title); //search media
//                                    if (mediaStore != null) {
//                                        cart.addMedia(mediaStore);
//                                        System.out.println("Add media to cart successfully!");
//                                        if(mediaStore instanceof Disc){
//                                            System.out.println("Current cart has" +
//                                                    cart.numberDVDsInCart() + "DVDs");
//                                        }
//                                    } else {
//                                        System.out.println("Media does not exits in store");
//                                    }
//                                    break;
//                                // 3. Play a media
//                                case 3:
//                                    System.out.print("Enter title of media: ");
//                                    title = scString.nextLine(); //enter title of media want to view
//                                    mediaStore = store.searchInStore(title); //search media
//                                    if (mediaStore != null) {
//                                        if (mediaStore instanceof DigitalVideoDisc) {
//                                            ((DigitalVideoDisc) mediaStore).play();
//                                        } else {
//                                            System.out.println("This is not an DVD");
//                                        }
//                                    } else {
//                                        System.out.println("Media does not exits in store");
//                                    }
//                                    break;
//                                case 4:
//                                    System.out.println("Current cart: ");
//                                    cart.displayCart();
//                                    break;
//                                case 0:
//                                    break;
//                                default:
//                                    System.out.println("Option invalid");
//                                    break;
//                            }
//                        } while (storeOpt != 0);
//                        break;
//
//                    case 2:
//                        System.out.println("Not implement");
//                        break;
//                    // 3. See current cart
//                    case 3:
//                        System.out.println("Current cart");
//                        cart.displayCart();
//                        do {
//                            cartMenu();
//                            cartOpt = sc.nextInt();
//                            switch (cartOpt) {
//                                // 1. Filter medias in cart
//                                case 1:
//                                    System.out.println("Enter 1 to filter by id or 2 to filter by title");
//                                    filterOpt = sc.nextInt();
//                                    if (filterOpt == 1) {
//                                        int idToFilter = sc.nextInt();
//                                        mediaCart = cart.searchInCart(idToFilter);
//                                    } else {
//                                        String titleToFilter = sc.nextLine();
//                                        mediaCart = cart.searchInCart(titleToFilter);
//                                    }
//                                    if (mediaCart != null) {
//                                        System.out.println("Product found: ");
//                                        mediaCart.toString();
//                                    } else {
//                                        System.out.println("Not found !");
//                                    }
//                                    break;
//                                // 2. Sort medias in cart
//                                case 2:
//                                    System.out.println("Enter 1 to sort by title or 2 to sort by cost");
//                                    sortOpt = sc.nextInt();
//                                    System.out.println("Current cart after sort: ");
//                                    if (sortOpt == 1) {
//                                        cart.sortCartByTitle();
//                                        cart.displayCart();
//                                    } else {
//                                        cart.sortCartByCost();
//                                        cart.displayCart();
//                                    }
//                                    break;
//                                case 3:
//                                    System.out.print("Enter title of media want to remove:  ");
//                                    title = scString.nextLine();
//                                    mediaCart = cart.searchInCart(title);
//                                    if(mediaCart != null){
//                                        cart.removeMedia(mediaCart);
//                                        System.out.println("Current cart: ");
//                                        cart.displayCart();
//                                    } else {
//                                        System.out.println("Media does not exist in cart !");
//                                    }
//                                    break;
//                                case 4:
//                                    System.out.print("Enter title of media want to play:  ");
//                                    title = scString.nextLine();
//                                    mediaCart = cart.searchInCart(title);
//                                    if(mediaCart != null){
//                                        ((DigitalVideoDisc) mediaCart).play();
//                                    } else {
//                                        System.out.println("Media does not exist in cart !");
//                                    }
//                                    break;
//                                case 5:
//                                    System.out.println("An order is created !");
//                                    cart = new Cart();
//                                    break;
//                                case 0:
//                                    break;
//                                default:
//                                    System.out.println("Option invalid !");
//                                    break;
//                            }
//                        } while (cartOpt != 0);
//                        break;
//                    case 0:
//                        break;
//                    default:
//                        System.out.println("Option invalid !");
//            }
//        } while (opt != 0);
//        scString.close();
//        sc.close();
//        return;
    }
}
