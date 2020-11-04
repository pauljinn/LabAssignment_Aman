
import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class SongPlayer {
	/**
	 * This method will start the song player and get the list of songs.
	 */
	public void start() {
		List<Song> songList = getSongs();
		System.out.println("Unsorted list: " + songList);
	}
	
	/**
	 * Read the songList.txt file and separate only songs and return the songs and return the songs list.
	 */
	private List<Song> getSongs(){
		List<Song> listOfSongs = new ArrayList<>();
		File file;
		BufferedReader br;
		try {
			file = new File("C:\\Users\\Aman Soni\\Desktop\\Virutal Onboarding Program\\LabAssignments\\Collection_API_Demo\\src\\songList.txt");
			br = new BufferedReader(new FileReader(file));
			String newSong;
			while((newSong=br.readLine())!=null) {
				String token[] = newSong.split("/");
				String name =  token[0];
				String artist = token[1];
				listOfSongs.add(new Song(name,artist));
			}
			//Collections.sort(listOfSongs);
			System.out.println("Sorted list: " + listOfSongs.stream().sorted().collect(Collectors.toList()));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return listOfSongs;
	}

}
