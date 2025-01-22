package guru.springframework.sftgi.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingsService {

    @Override
    public String sayGreetings() {
        return "Hello World - From Primary Bean";
    }
}
