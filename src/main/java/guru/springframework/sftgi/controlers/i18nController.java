package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {

    private final GreetingsService greetingsService;

    public i18nController(@Qualifier("i18nService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }
    public String sayHello() {
       return greetingsService.sayGreetings();
    }
}
