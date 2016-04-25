package tk.vantis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

/**
 * Index Controller
 * Created by Vantis on 2016/4/21.
 */
@Controller
@EnableAutoConfiguration
public class EveManager {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(EveManager.class, args);
    }
}
