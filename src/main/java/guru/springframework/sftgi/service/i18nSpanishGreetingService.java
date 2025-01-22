package guru.springframework.sftgi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class i18nSpanishGreetingService  implements GreetingsService{
    @Override
    public String sayGreetings() {
        return "Holla Mundo - ES";
    }
}
