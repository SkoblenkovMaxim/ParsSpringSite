package captainpiston.parsing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParsSiteApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParsSiteApplication.class, args);

		//Проверка работы метода по поиску константы
		String code = "1";
		SearchConst codeSearch = SearchConst.searchStringConst(code);
		System.out.println("Code " + code + " = " + codeSearch);
	}
}
