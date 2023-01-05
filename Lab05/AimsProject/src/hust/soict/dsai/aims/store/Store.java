package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Iterator;

import hust.soict.dsai.aims.media.Media;
// Cao Thanh Tung 20200569
public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void addMedia(Media... MediaList) {
		for(Media media: MediaList) {
			itemsInStore.add(media);
			System.out.println(media.getTitle() +" được thêm vào store thành công. Cao Thanh Tung 20200569");
		}
	}
	// Cao Thanh Tung 20200569 
	// xoa theo id
	public void removeMedia(int id) {
		int index = 0;
		while (index < itemsInStore.size()) {
			Media media = itemsInStore.get(index);
			if(id == media.getId()) {
				System.out.println("Da xoa Media: "+ media.getTitle());
				itemsInStore.remove(media);
			}else {
				index++;
			}
        }
	}
	// xoa theo title
	public void removeMedia(String title) {
		int index = 0;
		while (index < itemsInStore.size()) {
			Media media = itemsInStore.get(index);
			if(media.isMatch(title)) {
				System.out.println("Da xoa DVD: "+ media.getTitle());
				itemsInStore.remove(media);
			}else {
				index++;
			}
        }
	}
	
    public void displayStore(){
        Iterator<Media> it;
        for (it = itemsInStore.iterator(); it.hasNext();) {
            Media m = it.next();
            System.out.printf("%s \n",m.toString());
        }
    }
	public Media searchInStore(String title) {
		for (Media m: itemsInStore){
            if(m.isMatch(title)){
                return m;
            }
        }
		return null;
	}
    public Media searchInStore(int id){
        for (Media m: itemsInStore){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }
}
