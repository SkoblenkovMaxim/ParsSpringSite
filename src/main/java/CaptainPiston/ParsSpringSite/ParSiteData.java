package CaptainPiston.ParsSpringSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ParSiteData {

    String url = "https://www.mk.ru/polls/";
    Document document = Jsoup.connect(url).get();
    Elements voteRight = document.getElementsByClass("right_block vote_right");

    Elements question;
//    Elements answer;
//    Elements numberResponses;

    ParSiteData() throws IOException {

    }

    ParSiteData(Elements question) throws IOException {
        this.question = question;

        for(Element divRightBlock: voteRight) {
            question = divRightBlock.select("a[href]");
//			answer = divRightBlock.select("div.vote_label");
//			numberResponses = divRightBlock.select("div.vote_procent");
            System.out.println("=============================");
            System.out.println(question.text() + "\n");
//          System.out.println(answer.text() + numberResponses.text() + "\n");
        }
    }
}
