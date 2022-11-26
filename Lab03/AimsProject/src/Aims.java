
public class Aims {

	public static void main(String[] args) {

		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Superman", "Animation", 18.99f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Ironman", "Animation", 18.99f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Doremon", "Animation", 18.99f);

		// input is a disc
		anOrder.addDigitalVideoDisc(dvd4);
		System.out.println("Total Cost is: " + anOrder.totalCost());
		
		DigitalVideoDisc dvdList[] = {dvd1, dvd2, dvd3};
		// input is a list of disc
		anOrder.addDigitalVideoDisc(dvdList);
		System.out.println("Total Cost is: " + anOrder.totalCost());
		
		// method allows to pass an arbitrary number of arguments for dvd
		anOrder.addDigitalVideoDisc(dvd5, dvd6);
		System.out.println("Total Cost is: " + anOrder.totalCost());
	}
}
