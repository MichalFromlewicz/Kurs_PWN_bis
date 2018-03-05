package pl.pwn.reaktor.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {

		File myFile = new File("C:\\Users\\micha\\Desktop\\Java - programy\\Java49_scanerZPliku\\src\\pl\\pwn\\reaktor\\file\\plik.txt");
		Scanner rf = new Scanner(myFile, "UTF-8");
		
		while (rf.hasNextLine()){
			
			String nextLine = rf.nextLine();
			
			String lowerCaseNL = nextLine.toLowerCase();
			int charACounter =0;
			int charOCounter =0;
			
			for (int i=0; i<lowerCaseNL.length(); i++){
				if (lowerCaseNL.charAt(i)=='a') {
					charACounter++;
				}
				if (lowerCaseNL.charAt(i)=='o') {
					charOCounter++;
				}
				
			}
			if((charACounter>3 && charOCounter>2)|| lowerCaseNL.contains("allow")) {
				System.out.println(nextLine);
			}
		}
		rf.close();
	}

}
