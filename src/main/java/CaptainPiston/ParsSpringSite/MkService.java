package CaptainPiston.ParsSpringSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MkService {
    public MkService() throws IOException {
    }
    @Value("${url}")
    String url;
    Document document = Jsoup.connect(url).get();
    Elements voteRight = document.getElementsByClass("right_block vote_right");
    List<Poll> listPS = new ArrayList();

    public String serviceHome() {
        for(Element divVoteRight: voteRight) {
            Poll psQuestion = new Poll();
            String question = divVoteRight.select("a[href]").text();
            psQuestion.setHeader(question);
            listPS.add(psQuestion);
        }
        return " " + listPS;
    }
}
