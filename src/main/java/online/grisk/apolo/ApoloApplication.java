package online.grisk.apolo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ApoloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApoloApplication.class, args);
	}

}
