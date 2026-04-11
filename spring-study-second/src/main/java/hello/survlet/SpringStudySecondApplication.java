package hello.survlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class SpringStudySecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringStudySecondApplication.class, args);
    }

}
