package guru.springframework.sftgi.service;


public class I18nSpanishGreetingService  implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "Holla Mundo - ES";
    }
}
