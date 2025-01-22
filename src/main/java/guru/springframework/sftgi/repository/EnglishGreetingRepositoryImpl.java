package guru.springframework.sftgi.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

        @Override
    public String getGreeting() {
        return "hello world -EN";
    }
}
