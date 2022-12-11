package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	// Cao Thanh Tung 20200569
	// id for instance
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	public DigitalVideoDisc() {
		nbDigitalVideoDiscs += 1;
		// set id for instance
		this.id = nbDigitalVideoDiscs;
	}

	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs += 1;
		// set id for instance
		this.id = nbDigitalVideoDiscs;
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs += 1;
		// set id for instance
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc( String title,  String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs += 1;
		// set id for instance
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs += 1;
		// set id for instance
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Cao Thanh Tung 20200569
	// 6 Lab3
	public String toString() {
		return "DVD - " + this.title + " - "+ this.category +" - "+ this.director + " - "+this.length+": "+this.cost+"$";
	}
	public boolean isMatch(String title) {
		String thisTitle = this.title.toLowerCase();
		title = "(.*)"+title.toLowerCase()+"(.*)";
		return thisTitle.matches(title);
	}
}
