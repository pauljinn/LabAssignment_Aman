package exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class CopyDataThread implements Runnable{
	
	private FileInputStream file;
	
	public CopyDataThread(FileInputStream file) {
		this.file = file;
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Started");
		readCharacter();
	}
	
	public void readCharacter() {
		try {
			int characterAscii;
			File f = new File("C:\\\\Users\\\\Aman Soni\\\\Desktop\\\\target.txt");
			f.createNewFile();
			FileOutputStream fw = new FileOutputStream(f); 
			int characterRead = 0;
			while((characterAscii=this.file.read())!=-1) {
				if(characterRead<10) {
					fw.write(characterAscii);
				}
				else {
					System.out.println("10 character are copied");
					System.out.println("Waiting for 5 seconds\n");
					try {
						Thread.sleep(5000);
					}
					catch(InterruptedException i) {
						System.out.println(i.getMessage());
					}
					fw.write(characterAscii);
					characterRead = 1;
				}
				characterRead++;
			}
			fw.close();
		}
		catch(IOException i) {
			System.out.println(i.getMessage());
		}
	}
	

}
