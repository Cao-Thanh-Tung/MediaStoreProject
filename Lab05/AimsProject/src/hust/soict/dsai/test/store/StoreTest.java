package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;
public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 97, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Start Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation","George Lucas", 87, 18.99f);
		// Cao Thanh Tung 20200569
		// 7 lab3
		// add dvd into store
//		store.addDVD(dvd1, dvd2, dvd3);
//		// remove dvd by index
//		store.removeDVD(1);
//		// remove dvd by title
//		store.removeDVD("wars");
		
	}

}
