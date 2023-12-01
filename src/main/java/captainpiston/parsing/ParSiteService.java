package captainpiston.parsing;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParSiteService {
//    @Value("${url}")
//    String url;
    private final MkService mkService;

    public ParSiteService(MkService mkService) {
        this.mkService = mkService;
    }
//    public List<Poll> getPolls() {
//        return mkService.getDocument();
//    }
    public List<Poll> getPolls() throws IOException {
//        Document document = Jsoup.connect(url).get();
        Elements voteRight = mkService.getDocument().getElementsByClass("right_block vote_right");
        List<Poll> listPS = new ArrayList();
        for(Element divVoteRight: voteRight) {
            Poll psquestion = new Poll();
            String question = divVoteRight.select("a[href]").text();
            psquestion.setHeader(question);
            listPS.add(psquestion);
        }
//        for(Poll s: listPS) {
//            s.getHeader();
//        }
        return listPS;
    }
}
