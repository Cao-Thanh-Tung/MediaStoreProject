package hust.soict.dsai.test.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class MediaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Media> mediae = new ArrayList<Media>();
		
		CompactDisc cd = new CompactDisc("doremon", "aaa", 80, 10, "bbb", "furio furiko");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Naruto", "Animation","George Lucas",87, 18.99f);
		Book book = new Book("Nana", "ggg", 80);
		
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
	}

}
