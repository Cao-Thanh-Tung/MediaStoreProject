package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

// Cao Thanh Tung 20200569
public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Naruto", "Animation","George Lucas",87, 18.99f);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Doremon", "Animation","George Lucas",87, 18.99f);
		
		realSwap(jungleDVD, cinderellaDVD);
		System.out.println("Cao Thanh Tung, jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("Cao Thanh Tung, cinderella dvd title: " + cinderellaDVD.getTitle());
//		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("Cao Thanh Tung, jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
//	public static void changeTitle(DigitalVideoDisc dvd, String title) {
//		String oldTitle = dvd.getTitle();
//		dvd.setTitle(title);
//		dvd = new DigitalVideoDisc(oldTitle);
//	}
	
	// Cao Thanh Tung 20200569
	// Write a swap() method that can correctly swap the two objects
	public static void realSwap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		// Swap title
		String tmpTitle = o1.getTitle();
		o1.setTitle(o2.getTitle());
		o2.setTitle(tmpTitle);
		
		// Swap cost
		float tmpCost = o1.getCost();
		o1.setCost(o2.getCost());
		o2.setCost(tmpCost);
		
		// Swap Director
		String tmpDirector = o1.getDirector();
		o1.setDirector(o2.getDirector());
		o2.setDirector(tmpDirector);
		
		// Swap category
		String tmpCategory = o1.getCategory();
		o1.setCategory(o2.getCategory());
		o2.setCategory(tmpCategory);
		
		// Swap length
		int tmpLength = o1.getLength();
		o1.setLength(o2.getLength());
		o2.setLength(tmpLength);
	}
}
