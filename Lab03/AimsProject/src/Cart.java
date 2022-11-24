
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
			// in ra đã tràn
			System.out.println("Đã tràn items");
			return;
		}
		itemsOrdered.add(disc);
		this.qtyOrdered += 1;
		// in ra đã được thêm vào
		System.out.println(disc.getTitle() + " đã được thêm vào!");
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
}
