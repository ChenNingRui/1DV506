package nc222cv_assign4;

import java.io.FileInputStream;
import java.io.IOException;

public class CountChar {
	
	private static String filePath = "src/nc222cv_assign4/HistoryOfProgramming.txt";
	
	private static int upperCounter;
	private static int lowerCounter;
	private static int spaceCounter;
	private static int othersCounter;
	
	public static void main(String[] args) {
		init();
		
		try {
			readFile(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printResult();
	}
	
	private static void init() {
		upperCounter = 0;
		lowerCounter = 0;
		spaceCounter = 0;
		othersCounter = 0;
	}
	
	private static void readFile(String filePath) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(filePath);
		int ascii;
		
		while((ascii = fileInputStream.read()) != -1) {
			if(ascii <= 32)
				spaceCounter++;
			else if(ascii >= 65 && ascii <= 90)
				upperCounter++;
			else if(ascii >= 97 && ascii <= 122)
				lowerCounter++;
			else
				othersCounter++;
		}
		
		fileInputStream.close();
	}
	
	private static void printResult() {
		System.out.println("Number of upper case letters: " + upperCounter);
		System.out.println("Number of lower case letters: " + lowerCounter);
		System.out.println("Number of \"whitespaces\": " + spaceCounter);
		System.out.println("Number of others: " + othersCounter);
	}
}
