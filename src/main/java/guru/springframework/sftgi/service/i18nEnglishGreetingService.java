package guru.springframework.sftgi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class i18nEnglishGreetingService  implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "hello world -EN";
    }
}
