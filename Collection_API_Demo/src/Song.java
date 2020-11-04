
public class Song {
	
	private String name;
	private String artist;
	
	/**
	 * @param name
	 * @param artist
	 */
	public Song(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
	}
	/*
	public int compareTo(Song song) {
		return this.getName().compareTo(song.getName());
	}
	*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + "]";
	}
	
	
	
	
	

}
