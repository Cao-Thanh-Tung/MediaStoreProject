package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
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
			if(!itemsOrdered.contains(a)) {
			itemsOrdered.add(a);
			System.out.println(a.getTitle()+ " da duoc them thanh cong!");
			}else {
				System.out.println(a.getTitle()+ " da duoc co trong gio hang!");
			}
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
    /**
     * Sort the items in the cart by title and cost.
     */
    public void sortCartByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    /**
     * Sort the items in the cart by cost, then by title.
     */
    public void sortCartByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    /**
     * The function iterates through the itemsOrdered ArrayList and prints out the toString() of each Media object
     */
    public void displayCart(){
        Iterator<Media> it;
        for (it = itemsOrdered.iterator(); it.hasNext();) {
            Media m = it.next();
            System.out.printf("%s \n",m.toString());
        }
    }


    /**
     * This function takes an id as a parameter and searches the itemsOrdered array for a media object with the same id. If
     * it finds one, it prints the object and returns true. If it doesn't find one, it prints "Not found!" and returns
     * false
     *
     * @param id the id of the media item you want to search for
     * @return A boolean value.
     */
    public Media searchInCart(int id){
        for (Media m: itemsOrdered){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }


     /**
      * > Search the itemsOrdered array for a Media object whose title matches the title parameter. If a match is found,
      * return the Media object. If no match is found, return null
      *
      * @param title The title of the media item to be searched for.
      * @return The method is returning the media object that matches the title.
      */
     public Media searchInCart(String title) {
        for (Media m: itemsOrdered){
            if(m.isMatch(title)){
               return m;
            }
        }
        return null;
    }
     public int numberDVDsInCart(){
         int count = 0;
         for (Media m : itemsOrdered){
             if (m instanceof DigitalVideoDisc){
                 count++;
             }
         }
         return count;
     }
}
