package CaptainPiston.ParsSpringSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ParsSiteApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ParsSiteApplication.class, args);

		ParSiteData ps = new ParSiteData();

		List<ParSiteData> listPS = new ArrayList();
		listPS.add(new ParSiteData(ps.question));
		System.out.println(listPS);
	}
}
