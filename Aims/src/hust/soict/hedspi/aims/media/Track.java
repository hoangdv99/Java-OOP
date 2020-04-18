package hust.soict.hedspi.aims.media;

public class Track implements Playable {

	public Track() {
		super();
	}
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}

}
