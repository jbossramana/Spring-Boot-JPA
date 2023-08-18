package demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
public class Lab7SpringBootHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7SpringBootHibernateApplication.class, args);
	}

	  @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	  
}
