package nc222cv_assign4.newsagency;

public class NewsMain {
	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		
		Newspaper NYT = new Newspaper("The New-York Daily Times");
		Newspaper WP = new Newspaper("The Washington Post");
		
		newsAgency.registers(NYT);
		newsAgency.registers(WP);
		
		News news1 = new News("The New-York Daily Times", "Trump/'s Pick for Attorney General", "nothing");
		News news2 = new News("The Washington Post", "D.C. area dogs, kids take advantage of first snowfall", "nothing");
		
		newsAgency.collects(news1);
		newsAgency.broadcasts();
		
		newsAgency.collects(news2);
		newsAgency.broadcasts();
		
		Child child = new Child();
		
		System.out.print(child.toString());
	}

}

