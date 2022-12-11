package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

// Cao Thanh Tung 20200569
public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	// Cao Thanh Tung 20200569
	// Lab4 mission 3
	// create addAuthor(String authorName) and removeAuthor(String authorName) for the Book class
	public void addAuthor(String authorName) {
		// kiem tra xem author da co trong danh sach chua, neu chua thi them vao.
		if(this.authors.indexOf(authorName) == -1) {
			this.authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		// kiẻm tra xem author co o trong danh sach khong, neu co thi xoa di.
		if(this.authors.indexOf(authorName) != -1) {
			this.authors.remove(authorName);
		}
	}

}
