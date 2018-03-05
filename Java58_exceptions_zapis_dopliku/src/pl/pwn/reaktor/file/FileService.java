package pl.pwn.reaktor.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import pl.pwn.reaktor.model.User;

public class FileService {
	
	private File file;

	public FileService(File file) {
		this.file = file;
	}
	
	public void writeToFile(List<User> users) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		
		for (User user : users) {
			
			fw.write(user.getImie()+"," + user.getNazwisko() + "," + user.getWiek()+"\n");
			
		}		
		fw.close();
		
	}
	
	public void readFromFile() throws FileNotFoundException {
		Scanner rf = new Scanner(file);
		
		while (rf.hasNextLine()) {
			System.out.println(rf.nextLine());
		}
		rf.close();
	}
	

}
