package hust.soict.dsai.aims.media;

import java.util.Comparator;

// Cao Thanh Tung 20200569
public abstract class Media {
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	// Cao Thanh Tung 20200569
	// Lab4 mission4
	// add fields and accessor method
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int numberOfElements = 0 ;
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
		this.id = numberOfElements +1 ;
		numberOfElements += 1;
	}
	public Media(String title) {
		super();
		this.id = numberOfElements +1;
		numberOfElements += 1;
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		super();
		this.id = numberOfElements +1;
		numberOfElements += 1;
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
	public void sort() {
		
	}
}
