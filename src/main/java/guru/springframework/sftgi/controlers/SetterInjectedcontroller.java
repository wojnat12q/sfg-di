package guru.springframework.sftgi.controlers;

import guru.springframework.sftgi.service.GreetingsService;



public class SetterInjectedcontroller {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
