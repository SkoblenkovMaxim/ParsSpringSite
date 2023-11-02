package CaptainPiston.ParsSpringSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ParsSiteApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ParsSiteApplication.class, args);

		String url = "https://www.mk.ru/polls/";
		Document document = Jsoup.connect(url).get();
		Elements voteRight = document.getElementsByClass("right_block vote_right");
		List<ParSiteData> listPS = new ArrayList();
		for(Element divVoteRight: voteRight) {
			ParSiteData psquestion = new ParSiteData();
			String question = divVoteRight.select("a[href]").text();
			psquestion.setHeader(question);
			listPS.add(psquestion);
		}
		for(ParSiteData s: listPS) {
			System.out.println(s.getHeader());
		}
	}
}
