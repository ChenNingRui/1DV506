package nc222cv_assign4.newsagency;

import java.util.HashMap;

public class NewsAgency {
	private HashMap<String, Newspaper> newspaperMap;
	private News currentNews;
	
	public NewsAgency() {
		newspaperMap = new HashMap<String, Newspaper>();
	}

	public void registers(Newspaper newspaper) {
		if(newspaperMap.get(newspaper.getName()) == null) {
			newspaperMap.put(newspaper.getName(), newspaper);
			System.out.println(" successfully registered");
		}
		else
			System.out.println("this newspaper had been registered");
	}
	
	public void collects(News news) {
		if(newspaperMap.get(news.getDelivered()) == null) {
			System.out.println("this newspaper had not been registered");
			return;
		}
		else {
			Newspaper newspaper = newspaperMap.get(news.getDelivered());
			newspaper.addNews(news);
			currentNews = news;
		}
	}
	
	public void broadcasts() {
		for(Newspaper newspaper : newspaperMap.values()) {
			if(newspaper.getName() != currentNews.getDelivered()) {
				newspaper.addNews(currentNews);
			}
		}
	}
	
	public String toString() {
		return "hello!";
	}
}
