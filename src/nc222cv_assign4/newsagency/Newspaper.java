package nc222cv_assign4.newsagency;

import java.util.ArrayList;

public class Newspaper {
	private String name;
	private ArrayList<News> newsList;
	
	public Newspaper(String name) {
		this.name = name;
		newsList = new ArrayList<News>();
	}

	public String getName() {
		return name;
	}

	public void addNews(News news) {
		newsList.add(news);
	}
	
	public void removeNews(News news) {
		newsList.remove(news);
	}
	
	public News getNews(String title) {
		for(int i = 0, length = newsList.size(); i < length; i++) {
			News news = newsList.get(i);
			if(news.getTitle() == title)
				return news;
		}
		
		return null;
	}
}
