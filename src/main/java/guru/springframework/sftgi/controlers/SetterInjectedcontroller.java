package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedcontroller {
    private GreetingsService greetingsService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
