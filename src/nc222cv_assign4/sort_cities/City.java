package nc222cv_assign4.sort_cities;

public class City implements Comparable<City> {
	private String name;
	private int zipCode;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		return getZipCode() - o.getZipCode();
	}
}
