package guru.springframework.sftgi.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello world-Constructor";
    }
}
