package guru.springframework.sftgi.service;

import guru.springframework.sftgi.repository.EnglishGreetingRepository;

public class I18nEnglishGreetingService  implements GreetingsService{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreetings() {
        return "hello world -EN";
    }
}
