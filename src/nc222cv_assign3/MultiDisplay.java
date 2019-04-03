package nc222cv_assign3;

public class MultiDisplay {
	private String message;
	private int count;

	public void setDisplayMessage(String message) {
		this.message = message;
	}
	
	public void setDisplayCount(int count) {
		this.count = count;
	}
	
	public void display() {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	
	public void display(String message, int times) {
		this.message = message;
		for(int i = 0; i < times; i++) {
			System.out.println(message);
		}
	}
	
	public String getDisplayMessage() {
		return message;
	}
}
