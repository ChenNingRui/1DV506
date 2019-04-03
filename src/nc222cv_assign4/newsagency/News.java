package nc222cv_assign4.newsagency;

public class News {
	private String title;
	private String content;
	private String delivered;
	
	public News(String delivered, String title, String content) {
		this.delivered = delivered;
		this.title = title;
		this.content = content;
	}
	
	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
	
	public String getDelivered() {
		return delivered;
	}

}
