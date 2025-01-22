package guru.springframework.sftgi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "Hello world-Setter ";
    }
}
