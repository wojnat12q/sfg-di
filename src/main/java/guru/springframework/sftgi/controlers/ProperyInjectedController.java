package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class ProperyInjectedController {

    @Autowired
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }

}
