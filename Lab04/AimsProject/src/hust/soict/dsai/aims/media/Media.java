package hust.soict.dsai.aims.media;
// Cao Thanh Tung 20200569
public abstract class Media {
	// Cao Thanh Tung 20200569
	// Lab4 mission4
	// add fields and accessor method
	private int id;
	private String title;
	private String category;
	private float cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media() {
		super();
	}
	
	public Media(int id) {
		super();
		this.id = id;
	}
	public Media(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Media(int id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public boolean isMatch(String title) {
		String thisTitle = this.getTitle().toLowerCase();
		title = "(.*)"+title.toLowerCase()+"(.*)";
		return thisTitle.matches(title);
	}
	@Override
	public boolean equals(Object obj) {
		// Cao Thanh Tung 20200569 Lab4
		if(obj instanceof Media) {
			Media media = (Media) obj;
			if(media.title.equals(this.title)) {
				return true;
			}
		}
			return false;
	}
	
}
