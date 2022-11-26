
import java.util.ArrayList;
import java.util.List;

public class Cart {

	public static int MAX_NUMBERS_ORDERED = 20;

	private List<DigitalVideoDisc> itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);

	private int qtyOrdered = itemsOrdered.size();

	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			// Thông báo đã tràn
			System.out.println("Đã tràn items. Cao Thanh Tung");
			return;
		}
		// Thêm đĩa vào
		itemsOrdered.add(disc);
		// Cập nhật số lượng đĩa.
		this.qtyOrdered += 1;
		// Thông báo đĩa đã được thêm vào
		System.out.println(disc.getTitle() + " đã được thêm vào!");
	}

	// Practice 2.1 Lab3
	// overloading, allows to pass an arbitrary number of arguments for dvd
	// Cao Thanh Tung 20200569
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
		// Kiểm tra xem có thêm được tất cả các dvd trong dvdList vào không
		if (itemsOrdered.size() + dvdList.length >= MAX_NUMBERS_ORDERED) {
			// Thông báo tràn và không thêm đĩa nào vào cả, dừng hàm luôn.
			System.out.println("Đã tràn items. Không thêm được danh sách dvd.");
			return;
		}
		// Nếu cho thêm được tất cả các dvd trong dvdList vào thì ta thực hiện thêm từng đĩa.
		for(int i = 0; i < dvdList.length; i++){
			// Thêm vào đĩa thứ i trong danh sách dvdList
			itemsOrdered.add(dvdList[i]);
			// Thông báo dvd đã được thêm vào
			System.out.println(dvdList[i].getTitle() + " đã được thêm vào thành công!");
		}
		// Cập nhật số lượng dvd.
		this.qtyOrdered += dvdList.length;
	}
	
	// Practice 2.1 Lab3
	// overloading, parameter is array
	// Cao Thanh Tung 20200569
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
//		// Kiểm tra xem có thêm được tất cả các dvd trong dvdList vào không
//		if (itemsOrdered.size() + dvdList.length > MAX_NUMBERS_ORDERED) {
//			// Thông báo tràn và không thêm đĩa nào vào cả, dừng hàm luôn.
//			System.out.println("Đã tràn items. Không thêm được danh sách dvd.");
//			return;
//		}
//		// Nếu cho thêm được tất cả các dvd trong dvdList vào thì ta thực hiện thêm từng đĩa.
//		for(int i = 0; i < dvdList.length; i++){
//			// Thêm vào đĩa thứ i trong danh sách dvdList
//			itemsOrdered.add(dvdList[i]);
//			// Thông báo dvd đã được thêm vào
//			System.out.println(dvdList[i].getTitle() + " đã được thêm vào thành công!");
//		}
//		// Cập nhật số lượng dvd.
//		this.qtyOrdered += dvdList.length;
//	}


	// Practice 2.2 Lab3
	// overloading by differing the number of parameters.
	// Cao Thanh Tung 20200569
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (itemsOrdered.size() + 2 >= MAX_NUMBERS_ORDERED) {
			// Thông báo đã tràn
			System.out.println("Đã tràn items. Cao Thanh Tung 20200569");
			return;
		}
		// Thêm đĩa vào
		itemsOrdered.add(dvd1);
		itemsOrdered.add(dvd2);
		// Cập nhật số lượng đĩa.
		this.qtyOrdered += 2;
		// Thông báo đĩa đã được thêm vào
		System.out.println(dvd1.getTitle() + " và "+ dvd2.getTitle() + " đã được thêm vào!");
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (itemsOrdered.isEmpty()) {
			// in ra là rỗng
			System.out.println("items rỗng");
			return;
		}

		if (itemsOrdered.contains(disc)) {
			itemsOrdered.remove(disc);

			// in ra remove thành công
			System.out.println(disc.getTitle() + " đã được xóa khỏi items!");
			
		} else {
			// in ra không chứa
			System.out.println(disc.getTitle() + " không chứa trong items");
		}
	}

	public float totalCost() {
		float cost = 0.0f;
		if (!itemsOrdered.isEmpty()) {
			for (DigitalVideoDisc disc : itemsOrdered) {
				cost += disc.getCost();
			}
		} else {
			// in ra là rỗng
			System.out.println("items rỗng");
		}

		return cost;
	}
	
	// Cao Thanh Tung 20200569
	// 6 Lab3
	public void print() {
		float cost = 0f;
		int index = 0;
		System.out.println("*********************************CART************************************");
		for(DigitalVideoDisc disc:itemsOrdered){
			index++;
			cost += disc.getCost();
			System.out.println(index+". "+disc);
		}
		System.out.println("Total cost: "+ cost+"$");
		System.out.println("*************************************************************************");
	}
	
	// Cao Thanh Tung 20200569
	// 6 Lab3
	public void searchById(int id) {
		int index = 0;
		for(DigitalVideoDisc disc:itemsOrdered){
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
	// 6 Lab3
	public void searchByTitle(String title) {
		int index = 0;
		for(DigitalVideoDisc disc:itemsOrdered){
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
