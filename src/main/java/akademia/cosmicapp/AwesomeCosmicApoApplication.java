package akademia.cosmicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class AwesomeCosmicApoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwesomeCosmicApoApplication.class, args);
    }

}
