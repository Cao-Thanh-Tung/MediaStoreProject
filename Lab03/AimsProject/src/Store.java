import java.util.ArrayList;
import java.util.List;

// Cao Thanh Tung 20200569
public class Store {
	private static int MAX_NUMBERS = 20;
	private List<DigitalVideoDisc> itemsInStore = new ArrayList<>(MAX_NUMBERS);
	public void addDVD(DigitalVideoDisc... DVDList) {
		if(itemsInStore.size() + DVDList.length > MAX_NUMBERS) {
			System.out.println("Vượt quá sức chứa của store. Cao Thanh Tung 20200569");
			return;
		}
		for(DigitalVideoDisc dvd: DVDList) {
			itemsInStore.add(dvd);
			System.out.println(dvd.getTitle() +" được thêm vào store thành công. Cao Thanh Tung 20200569");
		}
	}
	// Cao Thanh Tung 20200569 
	// xoa theo id
	public void removeDVD(int id) {
		int index = 0;
		while (index < itemsInStore.size()) {
			DigitalVideoDisc dvd = itemsInStore.get(index);
			if(id == dvd.getId()) {
				System.out.println("Da xoa DVD: "+ dvd.getTitle());
				DigitalVideoDisc tmp = dvd;
				itemsInStore.remove(dvd);
			}else {
				index++;
			}
        }
	}
	// xoa theo title
	public void removeDVD(String title) {
		int index = 0;
		while (index < itemsInStore.size()) {
			DigitalVideoDisc dvd = itemsInStore.get(index);
			if(dvd.isMatch(title)) {
				System.out.println("Da xoa DVD: "+ dvd.getTitle());
				DigitalVideoDisc tmp = dvd;
				itemsInStore.remove(dvd);
			}else {
				index++;
			}
        }
	}
}
