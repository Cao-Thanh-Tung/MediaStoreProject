package hust.soict.dsai.aims.media;
// Cao Thanh Tung 20200569 Lab4 mission 5.2
// Create Track class
public class Track implements Playable {

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	// add fields and getter
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Track) {
			Track track = (Track) obj;
			if(track.title.equals(this.title) && track.length == this.length) {
				return true;
			}
		}
			return false;
	}
	
	

}
