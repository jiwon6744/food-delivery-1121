package food.delivery.common;


import food.delivery.ReviewApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ReviewApplication.class })
public class CucumberSpingConfiguration {
    
}
