package exercises;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class FileProgram {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Aman Soni\\Desktop\\Virutal Onboarding Program\\LabAssignments\\Lab8_Assignment\\src\\exercises\\Source.txt");
			CopyDataThread copyFile = new CopyDataThread(file);
		}
		catch(FileNotFoundException f) {
			System.out.println(f.getMessage());
		}

	}

}
