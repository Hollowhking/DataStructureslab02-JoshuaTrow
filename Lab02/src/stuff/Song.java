package stuff;

public class Song {
	String artist,title;
	public static String collectionName;
	int duration;
	
	public Song(String art, String tit, int dur) {
		this.artist=art;
		this.title=tit;
		this.duration=dur;
	}
	public String toString() {
		return (this.title+" ( "+this.artist+" ) - "+time(this.duration));
	}
	public String time(int tim) {
	    int hours = tim / 3600;
	    int rem = tim - hours * 3600;
	    int minutes = rem / 60;
	    rem = rem - minutes * 60;
	    int seconds = rem;

	    return (hours+":"+minutes+":"+seconds);
	}
	
	//Getters/setters
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCollectionName() {
		return collectionName;
	}
	public void setCollectionName(String collectionName) {
		Song.collectionName = collectionName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
