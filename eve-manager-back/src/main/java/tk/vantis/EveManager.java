package tk.vantis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Index Controller
 * Created by Vantis on 2016/4/21.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class EveManager {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(EveManager.class, args);
    }
}
