package CaptainPiston.ParsSpringSite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ParSiteService {
    @Value("${url}")
    String url;
    public String serviceHome() {
        return url;
    }
}
