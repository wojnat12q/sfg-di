package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;



public class ProperyInjectedController {
    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }

}
