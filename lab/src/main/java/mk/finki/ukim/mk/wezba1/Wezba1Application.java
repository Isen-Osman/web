package mk.finki.ukim.mk.wezba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Wezba1Application {

    public static void main(String[] args) {
        SpringApplication.run(Wezba1Application.class, args);
    }

}
