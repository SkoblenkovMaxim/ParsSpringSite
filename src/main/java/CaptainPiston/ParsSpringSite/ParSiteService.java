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
public class ParSiteService {
    public ParSiteService() {
    }
    @Value("${url}")
    String url;

    public String getPolls() throws IOException {
        Document document = Jsoup.connect(url).get();
        Elements voteRight = document.getElementsByClass("right_block vote_right");
        List<Poll> listPS = new ArrayList();
        for(Element divVoteRight: voteRight) {
            Poll psquestion = new Poll();
            String question = divVoteRight.select("a[href]").text();
            psquestion.setHeader(question);
            listPS.add(psquestion);
        }
        for(Poll s: listPS) {
            s.getHeader();
        }
        return "null";
    }

//    private MkService mkService;
//
//    public ParSiteService(MkService mkService) {
//        this.mkService = mkService;
//    }

//    public String getPolls() {
//        return mkService.getDocument();
//    }
}
