package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructionIncejtedControler {
    private final GreetingsService greetingsService;
    public ConstructionIncejtedControler(@Qualifier("constructorGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
