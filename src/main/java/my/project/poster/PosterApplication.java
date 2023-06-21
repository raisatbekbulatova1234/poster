package my.project.poster;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PosterApplication {
    public static void main(String[] args) {
        Sentry.capture("Application started");
        SpringApplication.run(PosterApplication.class, args);
    }
}