package guru.springframework.sftgi.config;

import com.springframeworks.pets.PetService;
import com.springframeworks.pets.PetServiceFactory;
import guru.springframework.sftgi.datasorce.FakeDataSorce;
import guru.springframework.sftgi.repository.EnglishGreetingRepository;
import guru.springframework.sftgi.repository.EnglishGreetingRepositoryImpl;
import guru.springframework.sftgi.service.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasorce.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSorce fakeDataSorce(@Value("${guru.username}") String username,
                                @Value("${guru.password}")  String password,
                                @Value("${guru.jbdcurl}") String jbdcurl) {
        FakeDataSorce fakeDataSorce = new FakeDataSorce();
        fakeDataSorce.setUsername(username);
        fakeDataSorce.setPassword(password);
        fakeDataSorce.setJdbcurl(jbdcurl);
        return fakeDataSorce;
    }
    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }
    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
       return petServiceFactory.getPetService("dog");
    }
    @Bean
    @Profile("cat")
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18NSpanishService(){
        return new I18nSpanishGreetingService();
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }
    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository ){
        return new I18nEnglishGreetingService(englishGreetingRepository );
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingsService constructorGreetingService(){
        return new ConstructorGreetingsService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
