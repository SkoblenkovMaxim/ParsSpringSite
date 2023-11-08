package CaptainPiston.ParsSpringSite;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ParSiteService {
    @ConfigurationProperties(prefix = "url")
    @Bean
    public String home() {
        return "polls";
    }
}
