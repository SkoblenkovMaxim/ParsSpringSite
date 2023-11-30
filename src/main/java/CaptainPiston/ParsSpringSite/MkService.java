package CaptainPiston.ParsSpringSite;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MkService {
    public MkService() {
    }

    @Value("${url}")
    String url;

    public Document getDocument() throws IOException {
        Document document = Jsoup.connect(url).get();
        return document;
    }
}
