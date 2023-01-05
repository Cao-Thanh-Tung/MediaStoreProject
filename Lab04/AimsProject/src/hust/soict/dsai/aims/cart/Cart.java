package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;
public class Cart {
	// Cao Thanh Tung 20200569 Lab4 mission 7
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public float totalCost() {
		float cost = 0.0f;
		if (!itemsOrdered.isEmpty()) {
			for (Media disc : itemsOrdered) {
				cost += disc.getCost();
			}
		} else {
			// in ra là rỗng
			System.out.println("items rỗng");
		}

		return cost;
	}
	// Cao Thanh Tung 20200569 Lab4 mision 7
	public void addMedia(Media... media) {
		// Kiem tra xem co them duoc nua khong
		for(Media a: media) {
			itemsOrdered.add(a);
			System.out.println(a.getTitle()+ " da duoc them thanh cong!");
		}
	}
	
	// Cao Thanh Tung 20200569 Lab4 mision 7
	public void removeMedia(Media media) {
		// Kiem tra xem media co trong danh sach khong
			for(Media a: itemsOrdered) {
				if(media.equals(a)) {
					itemsOrdered.remove(media);
					return;
				}
			}
			System.out.println(media.getTitle()+ " khong co trong danh sach.");			
	}
	// Cao Thanh Tung 20200569
	// 6 Lab3
	public void print() {
		float cost = 0f;
		int index = 0;
		System.out.println("*********************************CART************************************");
		for(Media disc:itemsOrdered){
			index++;
			cost += disc.getCost();
			System.out.println(index+". "+disc);
		}
		System.out.println("Total cost: "+ cost+"$");
		System.out.println("*************************************************************************");
	}
	
	// Cao Thanh Tung 20200569
	// 6 Lab3 search cart
	public void searchById(int id) {
		int index = 0;
		for(Media disc:itemsOrdered){
			if(id == disc.getId()) {	
				index++;
				System.out.println(index+". "+disc);
			}
		}
		if(index == 0) {
			System.out.println("Khong tim thay ket qua phu hop. Cao Thanh Tung 20200569");
		}
	}
	
	// Cao Thanh Tung 20200569
	// 6 Lab3 search cart
	public void searchByTitle(String title) {
		int index = 0;
		for(Media disc:itemsOrdered){
			if(disc.isMatch(title)) {
				index++;
				System.out.println(index+". "+disc);				
			}
		}
		if(index == 0) {
			System.out.println("Khong tim thay ket qua phu hop. Cao Thanh Tung 20200569");
		}
	}
}
