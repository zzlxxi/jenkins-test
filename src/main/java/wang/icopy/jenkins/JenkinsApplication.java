package wang.icopy.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** @author lizhengguang */
@RestController
@SpringBootApplication
public class JenkinsApplication {

  @GetMapping("/")
  public String index() {
    return "Hello World";
  }

  public static void main(String[] args) {
    SpringApplication.run(JenkinsApplication.class, args);
  }
}
