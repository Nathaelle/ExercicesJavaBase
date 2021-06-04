package journaux;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Article article1 = new Article("L'été approche 1", "Tourisme", "Lorem ipsum sin dolor...");
		Article article2 = new Article("L'été approche 2", "Tourisme", "Lorem ipsum sin dolor...");
		Article article3 = new Article("L'été approche 3", "Tourisme", "Lorem ipsum sin dolor...");
		Article article4 = new Article("L'été approche 4", "Tourisme", "Lorem ipsum sin dolor...");
		Article article5 = new Article("L'été approche 5", "Tourisme", "Lorem ipsum sin dolor...");
		Article article6 = new Article("L'été approche 6", "Tourisme", "Lorem ipsum sin dolor...");
		Article article7 = new Article("L'été approche 7", "Tourisme", "Lorem ipsum sin dolor...");
		Article article8 = new Article("L'été approche 8", "Tourisme", "Lorem ipsum sin dolor...");
		Article article9 = new Article("L'été approche 9", "Tourisme", "Lorem ipsum sin dolor...");
		Article article10 = new Article("L'été approche 10", "Tourisme", "Lorem ipsum sin dolor...");
		
		List<Article> cat1 = new ArrayList<>();
		List<Article> cat2 = new ArrayList<>();
		List<Article> cat3 = new ArrayList<>();
		
		cat1.add(article1);
		cat1.add(article2);
		cat1.add(article3);
		cat1.add(article4);
		
		cat2.add(article5);
		cat2.add(article6);
		cat2.add(article7);
		
		cat3.add(article8);
		cat3.add(article9);
		cat3.add(article10);
		
		Map<String, List<Article>> journal = new HashMap<>();
		journal.put("Arts", cat1);
		journal.put("Economie", cat2);
		journal.put("Fait divers", cat3);
		
	}

}
