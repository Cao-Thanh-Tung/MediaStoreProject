package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
// Cao Thanh Tung 20200569
public class Store {
	private static int MAX_NUMBERS = 20;
	private List<Media> itemsInStore = new ArrayList<Media>(MAX_NUMBERS);
	public void addMedia(Media... MediaList) {
		if(itemsInStore.size() + MediaList.length > MAX_NUMBERS) {
			System.out.println("Vượt quá sức chứa của store. Cao Thanh Tung 20200569");
			return;
		}
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
				Media tmp = media;
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
				Media tmp = media;
				itemsInStore.remove(media);
			}else {
				index++;
			}
        }
	}
}
