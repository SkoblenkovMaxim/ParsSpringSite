package CaptainPiston.ParsSpringSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

@SpringBootApplication
public class ParsSiteApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ParsSiteApplication.class, args);
		String url = "https://www.mk.ru/polls/";
		Document document = Jsoup.connect(url).get();
		Elements voteRight = document.getElementsByClass("right_block vote_right");
		for(Element blockVoteRight: voteRight) {
			System.out.println(blockVoteRight.text());
			Elements href = document.getElementsByTag("<a>");
			System.out.println(href.text());
		}
	}

}
