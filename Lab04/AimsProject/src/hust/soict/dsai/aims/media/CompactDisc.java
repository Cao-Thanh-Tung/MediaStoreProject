package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

// Cao Thanh Tung 20200569 Lab4 mission 5
public class CompactDisc extends Disc implements Playable {
	// Cao Thanh Tung 20200569 Lab4 mission 6
	@Override
	public void play() {
		System.out.println("Title: "+ this.getTitle()+ " Artist"+ this.getArtist());
		for(Track track: tracks) {
			track.play();
		}
	}
	// Cao Thanh Tung 20200569 Lab4 mission 5.3
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		super(title, category, cost, length, director);
		this.artist = artist;
	}
	// create getter for Artist
	public String getArtist() {
		return artist;
	}
// Cao Thanh Tung 20200569 Lab4 mission 5.3
//	Create methods addTrack() and removeTrack()
	public void addTrack(Track track) {
		// kiem tra xem track da co trong danh sach chua, neu chua thi them vao.
		if(this.tracks.indexOf(track) == -1) {
			this.tracks.add(track);
			System.out.println(track.getTitle() + " da duoc them thanh cong.");
		}else {
			System.out.println(track.getTitle() + " da co trong danh sach.");
		}
	};
	public void removeTrack(Track track) {
		// kiem tra xem track co trong danh sach khong, neu co thi xoa di.
		if(this.tracks.indexOf(track) != -1) {
			this.tracks.remove(track);
			System.out.println(track.getTitle() + " da xoa thanh cong.");
		}else {
			System.out.println(track.getTitle() + " khong co trong danh sach.");
		}
	};
	// Cao Thanh Tung 20200569 Lab4 mission 5.3
	// The length of the CD should be the sum of lengths of all its tracks.
	public int getLength() {
		int sumLength = 0;
		for(Track track: tracks) {
			sumLength += track.getLength();
		}
		return sumLength;
	}
}
