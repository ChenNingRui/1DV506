package nc222cv_assign4.sort_cities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CityMain {
	private static ArrayList<City> cityList;
	private static String filePath = "src/nc222cv_assign4/sort_cities/City.txt";
	
	public static void main(String[] args) {
		init();
		
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		printCity();
	}
	
	private static void init() {
		cityList = new ArrayList<City>();
	}
	
	private static void readFile() throws IOException {
		File file = new File(filePath);
		InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String content;
		while((content = bufferedReader.readLine()) != null) {
			City city = new City();
			city.setZipCode(Integer.parseInt(content.split(";")[0]));
			city.setName(content.split(";")[1]);
			
			cityList.add(city);
		}

		Collections.sort(cityList);
		
		bufferedReader.close();
	}
	
	private static void printCity() {
		System.out.println("Reading cities from file: " + filePath);
		System.out.println("Number of cities found: " + cityList.size());
		
		for(int i = 0, length = cityList.size(); i < length; i++) {
			System.out.println(cityList.get(i).getZipCode() + " " + cityList.get(i).getName());
		}
	}
}
