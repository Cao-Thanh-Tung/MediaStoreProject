package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable {
	// Cao Thanh Tung 20200569 Lab 5 mission 5.1
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, length, director);
	}
	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	// Cao Thanh Tung 20200569
	// 6 Lab3
	public String toString() {
		return "DVD - " + this.getTitle() + " - "+ this.getCategory() +" - "+ this.getDirector() + " - "+this.getLength()+": "+this.getCost()+"$";
	}
}
