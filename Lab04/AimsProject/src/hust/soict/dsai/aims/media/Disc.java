package hust.soict.dsai.aims.media;
// Cao Thanh Tung 20200569 Lab4 mission 5.1
// Create Disc class extend Media class
public class Disc extends Media{
	// add fields and getters
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(String title) {
		super(title);
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}
	public Disc() {
		super();
	}

}


