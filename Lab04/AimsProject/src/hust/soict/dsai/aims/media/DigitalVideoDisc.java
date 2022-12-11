package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc {
	// Cao Thanh Tung 20200569 Lab 5 mission 5.1
	private static int nbDigitalVideoDiscs = 0;

	public DigitalVideoDisc(String title) {
		super(nbDigitalVideoDiscs+1, title);
		nbDigitalVideoDiscs += 1;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(nbDigitalVideoDiscs+1, title, category, cost, length, director);
		nbDigitalVideoDiscs += 1;
	}

	// Cao Thanh Tung 20200569
	// 6 Lab3
	public String toString() {
		return "DVD - " + this.getTitle() + " - "+ this.getCategory() +" - "+ this.getDirector() + " - "+this.getLength()+": "+this.getCost()+"$";
	}
	public boolean isMatch(String title) {
		String thisTitle = this.getTitle().toLowerCase();
		title = "(.*)"+title.toLowerCase()+"(.*)";
		return thisTitle.matches(title);
	}
}
