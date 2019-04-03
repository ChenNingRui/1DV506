package nc222cv_assign4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Histogram {
	private static String filePath = "src/nc222cv_assign4/integersFile.txt";
	
	private static ArrayList<String> contentList;
	private static ArrayList<Integer> intervalList;
	
	public static void main(String[] args) {	
		System.out.println("Reading integers from file: " + filePath);
		
		try {
			readFile(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		countIntervalListNumberInFile(1, 100);
		
		printStatistics();
		printHistogram(1, 100, 10);
	}
	
	private static void readFile(String filePath) throws IOException {
		File file = new File(filePath);
		
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		contentList = new ArrayList<String>();
		String content = "";
		
		while((content = bufferedReader.readLine()) != null) {
			contentList.add(content);
		}
		
		bufferedReader.close();
		reader.close();
	}
	
	private static void countIntervalListNumberInFile(int from, int to) {
		
		intervalList = new ArrayList<Integer>();
		
		for(int i = 0, length = contentList.size(); i < length; i++) {
			int number = Integer.parseInt(contentList.get(i));
			if(number >= from && number <= to) { //Integer
				intervalList.add(number);
			}
		}
	}
	
	private static void printStatistics() {
		System.out.println("Number of integers in the interval [1,100]: " + intervalList.size());
		System.out.println("Others: " + (contentList.size() - intervalList.size()));
	}
	

	private static void printHistogram(int from, int to, int span) {
		System.out.println("Histogram");
		int start = 0;
		int end = 0;
		String size = "";
		int number;
		
		for(int i = from; i <= to; i += span) {
			size = "";
			start = i;
			end = i + span - 1;
			
			for(int j = 0, length = intervalList.size(); j < length; j++) {
				number = intervalList.get(j);
				if(number >= start && number <= end) {
					size += "*";
				}
			}
			
			System.out.println(start + " - " + end + "    |   " + size);
		}
	}
}
