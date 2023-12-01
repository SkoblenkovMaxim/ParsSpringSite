package captainpiston.parsing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MkService {
    public MkService() throws IOException {
    }
     @Value("${url}")
    String url;

    public Document getDocument() {
        try {
            Document document = Jsoup.connect(url).get();
            return document;
        } catch(Exception e) {
             e.getMessage();
        }
        return null;
    }
}
