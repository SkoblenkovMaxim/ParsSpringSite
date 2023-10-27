package CaptainPiston.ParsSpringSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
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

		ParSiteData psquestion = new ParSiteData();
		List<String> listPS = new ArrayList();

		String question = voteRight.select("a[href]").text();
		psquestion.setHeader(question);
		listPS.add(psquestion.getHeader());
		System.out.println(listPS);
	}
}
